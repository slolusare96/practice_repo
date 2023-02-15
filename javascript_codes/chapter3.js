const prompt = require("prompt-sync")();

for (let x = 1; x <= 10; x++) console.log(x);

const obj = {
  name: "shubham",
  rollno: 22,
  school: "MCCK",
  isStudent: true,
  isPricipal: false,
};

for (let a in obj) {
  console.log(a + ": " + obj[a]);
}

let a = [];
a[0] = 10;
a[1] = 20;
a[2] = 40;
a[3] = "shubham";
console.log(a.length);

for (let i = 0; i < a.length; i++) {
  console.log(a[i] + " ");
}

for (b of a) {
  console.log(b);
}
console.log(a);

let c = [];

for (let d of c) {
  d = prompt();
}

console.log(c);
