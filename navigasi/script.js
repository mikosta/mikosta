const paragraphs = {
    easy: [
      "bunga sayur buah laut gunung datar cepat lambat tinggi landai besar kecil panas dingin rama putri jaya indah cantik tampan pintar bodoh"
    ],
    medium: [
       "sepeda motor perahu kapal pesawat kereta api rumah gedung sekolah kantor toko pasar hutan pantai sungai danau laut gunung padang rumput pohon bunga kucing anjing singa harimau kambing sapi kuda ayam itik bebek"
    ],
    hard: [
        "kemacetan lalu lintas kecelakaan mobil obesitas diabetes hipertensi serangan jantung banjir bandang longsor tanah gagal panen pengangguran meningkat kemiskinan meluas ekonomi lesu korupsi merajalela kejahatan meningkat perceraian meningkat polusi udara polusi air limbah beracun sampah berserakan kebakaran hutan tanah longsor erosi pencemaran sungai"
    ]
};

const typingText = document.querySelector(".typing-text p"),
    inpField = document.querySelector(".wrapper .input-field"),
    tryAgainBtn = document.querySelector(".content button.try-again-btn"),
    timeTag = document.querySelector(".timeLeft span b"),
    errorTag = document.querySelector(".errors span"),
    wpmTag = document.querySelector(".wpm span"),
    cpmTag = document.querySelector(".cpm span"),
    easyBtn = document.querySelector(".difficulty-buttons .easy-btn"),
    mediumBtn = document.querySelector(".difficulty-buttons .medium-btn"),
    hardBtn = document.querySelector(".difficulty-buttons .hard-btn");

let timer,
    maxTime = 60,
    timeLeft = maxTime,
    charIndex = errors = isTyping = 0,
    currentDifficulty = "easy";

function loadParagraph(difficulty) {
    const ranIndex = Math.floor(Math.random() * paragraphs[difficulty].length);
    typingText.innerHTML = "";
    paragraphs[difficulty][ranIndex].split("").forEach(char => {
        let span = `<span>${char}</span>`;
        typingText.innerHTML += span;
    });
    typingText.querySelectorAll("span")[0].classList.add("active");
    document.addEventListener("keydown", () => inpField.focus());
    typingText.addEventListener("click", () => inpField.focus());
}

function setDifficulty(difficulty) {
    currentDifficulty = difficulty;
    resetTest();
}

function initTyping() {
    let characters = typingText.querySelectorAll("span");
    let typedChar = inpField.value.split("")[charIndex];
    if (charIndex < characters.length - 1 && timeLeft > 0) {
        if (!isTyping) {
            timer = setInterval(initTimer, 1000);
            isTyping = true;
        }
        if (typedChar == null) {
            if (charIndex > 0) {
                charIndex--;
                if (characters[charIndex].classList.contains("incorrect")) {
                    errors--;
                }
                characters[charIndex].classList.remove("correct", "incorrect");
            }
        } else {
            if (characters[charIndex].innerText == typedChar) {
                characters[charIndex].classList.add("correct");
            } else {
                errors++;
                characters[charIndex].classList.add("incorrect");
            }
            charIndex++;
        }
        characters.forEach(span => span.classList.remove("active"));
        characters[charIndex].classList.add("active");

        let wpm = Math.round(((charIndex - errors) / 5) / (maxTime - timeLeft) * 60);
        wpm = wpm < 0 || !wpm || wpm === Infinity ? 0 : wpm;

        wpmTag.innerText = wpm;
        errorTag.innerText = errors;
        cpmTag.innerText = charIndex - errors;
    } else {
        clearInterval(timer);
        inpField.value = "";
    }
}

function initTimer() {
    if (timeLeft > 0) {
        timeLeft--;
        timeTag.innerText = timeLeft;
        let wpm = Math.round(((charIndex - errors) / 5) / (maxTime - timeLeft) * 60);
        wpmTag.innerText = wpm;
    } else {
        clearInterval(timer);
    }
}

function resetTest() {
    loadParagraph(currentDifficulty);
    clearInterval(timer);
    timeLeft = maxTime;
    charIndex = errors = isTyping = 0;
    inpField.value = "";
    timeTag.innerText = timeLeft;
    wpmTag.innerText = 0;
    errorTag.innerText = 0;
    cpmTag.innerText = 0;
}

loadParagraph(currentDifficulty);
inpField.addEventListener("input", initTyping);
tryAgainBtn.addEventListener("click", resetTest);
easyBtn.addEventListener("click", () => setDifficulty("easy"));
mediumBtn.addEventListener("click", () => setDifficulty("medium"));
hardBtn.addEventListener("click", () => setDifficulty("hard"));
