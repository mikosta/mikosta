import streamlit as st
import streamlit.components.v1 as components
import pandas as pd
import numpy as np
import networkx as nx
import wikipediaapi
from pyvis.network import Network

book1 = pd.read_csv("got_dataset/book1.csv")
book2 = pd.read_csv("got_dataset/book2.csv")
book3 = pd.read_csv("got_dataset/book3.csv")
book4 = pd.read_csv("got_dataset/book4.csv")
book5 = pd.read_csv("got_dataset/book5.csv")

def gen_network(df):
    net = Network(height='750px', width='100%',
                  bgcolor='#0E1117', font_color='white')
    net.barnes_hut()
    sources = df['Source']
    targets = df['Target']
    weights = df['weight']
    g_book = nx.Graph()
    for index, edge in df.iterrows():
        g_book.add_edge(edge['Source'], edge['Target'], weight=edge['weight'])
    edge_data = zip(sources, targets, weights)
    degree = nx.degree(g_book)

    for e in edge_data:
        src = e[0]
        dst = e[1]
        w = e[2]

        net.add_node(src, src, title=src)
        net.add_node(dst, dst, title=dst)
        net.add_edge(src, dst, value=w)

    deg_cen = nx.degree_centrality(g_book)
    bet_cen = nx.betweenness_centrality(g_book, weight='weight')
    close_cen = nx.closeness_centrality(g_book)
    eigen_cen = nx.eigenvector_centrality(g_book, weight='weight')

    n_nodes = g_book.number_of_nodes()
    n_edges = g_book.number_of_edges()
    avg_short_path = np.round(nx.average_shortest_path_length(g_book), 2)
    diameter = nx.algorithms.distance_measures.diameter(g_book)

    for node in net.nodes:
        node['title'] += '<br>Node Degree: ' + str(degree[node['id']]) + ' <br>Betweenness Centrality: ' + '{0:.4f}'.format(
            bet_cen[node['id']]) + '<br>Degree Centrality: ' + '{0:.4f}'.format(
            deg_cen[node['id']])+'<br>Closeness Centrality: ' + '{0:.4f}'.format(close_cen[node['id']]) + '<br>Eigenvector Centrality: ' + '{0:.4f}'.format(eigen_cen[node['id']])
        node['value'] = 1000*degree[node['id']]
    net.set_options("""
    var options = {
      "nodes": {
        "borderWidthSelected": 4,
        "color": {
          "highlight": {
            "border": "rgba(0,255,255,1)",
            "background": "rgba(0,191,255,1)"
          },
          "hover": {
            "border": "rgba(0,139,139,1)",
            "background": "rgba(0,255,255,1)"
          }
        },
        "font": {
          "background": "rgba(0,0,0,0)"
        },
        "shadow": {
          "enabled": true
        },
        "shapeProperties": {
          "borderRadius": 4
        }
      },
      "edges": {
        "color": {
          "highlight": "rgba(59,127,132,1)",
          "inherit": false,
          "opacity": 0.45
        },
        "smooth": {
          "type": "continuous",
          "forceDirection": "none",
          "roundness": 0.2
        }
      },
      "interaction": {
        "hover": true,
        "multiselect": true
      },
      "physics": {
        "barnesHut": {
          "gravitationalConstant": -80000,
          "springLength": 325,
          "springConstant": 0.03,
          "damping": 0.41,
          "avoidOverlap": 0.45
        },
        "minVelocity": 0.75
      }
    }
    """)
    return (net, n_nodes, n_edges, avg_short_path, diameter)

def main():
    st.set_page_config(layout="wide")
    st.title('Game of Thrones Network Analysis Dashboard')

    col1, col2, col3 = st.columns([0.2, 0.6, 0.2])
    with col2:
        book_list = ['A Game of Thrones', 'A Clash of Kings',
                     'A Storm of Swords', 'A Feast for Crows', 'A Dance with Dragons']
        book = st.selectbox("Select Book:", book_list)

        if book == book_list[0]:
            df_select = book1
        elif book == book_list[1]:
            df_select = book2
        elif book == book_list[2]:
            df_select = book3
        elif book == book_list[3]:
            df_select = book4
        else:
            df_select = book5

        got_net, n_nodes, n_edges, avg_short_path, diameter = gen_network(df_select)

        try:
            got_net.save_graph('pyvis_graph.html')
            HtmlFile = open('pyvis_graph.html', 'r', encoding='utf-8')
        except:
            got_net.save_graph('pyvis_graph.html')
            HtmlFile = open('pyvis_graph.html', 'r', encoding='utf-8')

        components.html(HtmlFile.read(), height=1000)

    with col1:
        st.subheader("Network Properties")
        st.write("Number of nodes:", str(n_nodes))
        st.write("Number of edges:", str(n_edges))
        st.write("Diameter of Network:", str(diameter))
        st.write("Average Shortest Path:", str(avg_short_path))
        properties = ['Node Degree', 'Betweenness Centrality', 'Degree Centrality',
                      'Closeness Centrality', 'Eigenvector Centrality']
        st.subheader("Centrality Measures")
        property = st.multiselect('Select Measure:', properties)
        if 'Node Degree' in property:
            st.subheader('Node Degree')
            # Keterangan tentang Node Degree
        if 'Betweenness Centrality' in property:
            st.subheader('Betweenness Centrality')
            # Keterangan tentang Betweenness Centrality
        if 'Degree Centrality' in property:
            st.subheader('Degree Centrality')
            # Keterangan tentang Degree Centrality
        if 'Closeness Centrality' in property:
            st.subheader('Closeness Centrality')
            # Keterangan tentang Closeness Centrality
        if 'Eigenvector Centrality' in property:
            st.subheader('Eigenvector Centrality')
            # Keterangan tentang Eigenvector Centrality

    with col3:
        char_list = list(df_select.Source.unique())
        selected_char = st.selectbox("Select Character", char_list)
        st.subheader(selected_char.replace('-', ' '))
        wiki_wiki = wikipediaapi.Wikipedia('en')
        selected_char = selected_char.replace('-', '_')
        page = wiki_wiki.page(selected_char)
        st.write(page.summary)

if __name__ == '__main__':
    main()

