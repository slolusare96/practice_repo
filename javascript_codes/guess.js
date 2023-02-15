const prompt = require("prompt-sync")();

let random_num = Math.floor(Math.random() * 1001 + 1);

console.log("Welcome to the Guess the Number game...");

let guessed_num;
let counter = 0;

do {
  guessed_num = prompt("Please guess the integer from 1 to 100: ");

  if (random_num == guessed_num) {
    counter++;
    console.log("You have guessed the correct number");
    break;
  } else if (guessed_num < random_num) {
    counter++;
    console.log("Your guess is too low");
  } else if (guessed_num > random_num) {
    counter++;
    console.log("Your guess is too high");
  }
} while (random_num != guessed_num);

console.log("Your score is " + (100 - counter));
