const prompt = require("prompt-sync")();

function factorial(a) {
  let temp = 1;
  for (let i = a; i >= 1; i--) {
    temp *= i;
  }
  return temp;
}

//arrow function

function sun(a, b) {
  return a + b;
}
let sum = (a, b) => {
  return a + b;
};

console.log("Enter the number of which yoiur want to find the factorial: ");
let num = prompt();
console.log("The factorial of " + num + " is " + factorial(num));

console.log("Enter the first number: ");
let a = Number.parseFloat(prompt());

console.log("Enter the second number: ");
let b = Number.parseInt(prompt());

console.log("The sum of two numbers is " + sun(a, b));
