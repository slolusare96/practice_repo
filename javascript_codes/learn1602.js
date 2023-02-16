const selec1 = document.querySelector("#selec");
const para = document.querySelector("p");

selec1.addEventListener("change", () => {
  const choice = selec1.value;

  switch (choice) {
    case "sunny":
      para.textContent = "It's sunny";
      break;
    case "cold":
      para.textContent = "It's cold outside";
      break;
    case "rainy":
      para.textContent = "It's rainy";
      break;
    case "springy":
      para.textContent = "It's spring";
      break;
    default:
      para.textContent = "";
      break;
  }
});
