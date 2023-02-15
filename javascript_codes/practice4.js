const prompt = require("prompt-sync")();

let input = prompt("Enter your string: ");

let num = input.charCodeAt(5);
let res = "";

for (let i = 0; i < input.length; i++) {
  if (
    input.charCodeAt(i) == 48 ||
    input.charCodeAt(i) == 49 ||
    input.charCodeAt(i) == 50 ||
    input.charCodeAt(i) == 51 ||
    input.charCodeAt(i) == 52 ||
    input.charCodeAt(i) == 53 ||
    input.charCodeAt(i) == 54 ||
    input.charCodeAt(i) == 55 ||
    input.charCodeAt(i) == 56 ||
    input.charCodeAt(i) == 57
  ) {
    res = res + input.charAt(i);
  }
}

console.log(res);
