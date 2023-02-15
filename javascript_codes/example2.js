const promt = require("prompt-sync")();

let num = promt();

if (num % 2 == 0 && num % 3 == 0) console.log("Number is divisible by 2 & 3");
else console.log("Number is not divisible by 2 & 3");
