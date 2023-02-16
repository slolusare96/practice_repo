const clickHere = document.querySelector("#clk_btn");
const input_area = document.getElementById("txtbox");

const para = document.querySelector("#para");

const search = document.querySelector("#textBoxBtn");

const contactDetails = {
  shubham: 9049668166,
  uttam: 8888839389,
  anup: 7517003230,
  chandradip: 9767296952,
  ranjana: 7057679495,
  parth: 9021489766,
  vidhi: 9373344942,
};

clickHere.onclick = () => {
  document.getElementById("welcome").style.display = "none";
  document.getElementById("outer").style.display = "flex";
};

search.addEventListener("click", () => {
  const searchName = input_area.value;
  const mobNum = contactDetails[searchName];
  if (mobNum != undefined)
    para.textContent = `The mobile number of ${searchName.toUpperCase()} is ${mobNum}`;
  else
    para.textContent = `The mobile number of ${searchName.toUpperCase()} is not present`;
});
