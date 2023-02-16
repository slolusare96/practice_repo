const theme = document.querySelector("#theme_mode");
const html = document.querySelector("html");

theme.addEventListener("change", colors);

function bgchanger(bgcolor, textcolor) {
  html.style.backgroundColor = bgcolor;
  html.style.color = textcolor;
}

function colors() {
  const ops = theme.value;

  if (ops === "light") {
    bgchanger("white", "darkgreen");
  } else if (ops === "dark") {
    bgchanger("purple", "white");
  }
  alert(`You have selected ${ops} background!`);
}
