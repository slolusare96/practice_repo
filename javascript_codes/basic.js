let a = null;
let b = 20;
let c = 30.5;
let d = true;
let e = BigInt("35");
let f = Symbol("Hi there");
let g = "Shubham";
let h = undefined;

console.log(a, b, c, d, e, f, g, h);

console.log(
  typeof a,
  typeof b,
  typeof c,
  typeof d,
  typeof e,
  typeof f,
  typeof g,
  typeof h
);

const object = {
  num: "Shubham",
  num2: 30,
};

console.log(typeof object["num2"]);

let str = "string";
let br = 30;

let res = str + br;

console.log(res);
console.log(typeof res);

const object2 = {
  num: "Shubham",
};

object2["friend"] = true;

console.log(typeof object2["friend"]);
console.log(object2);

// Operator

let i = 45.2;
let j = 4.3;

console.log("i+j = " + i + j);
console.log("i*j = " + i * j);
console.log("i/j = " + i / j);
console.log("i-j = " + (i - j));
console.log("i**j = ", i ** j);
console.log("i++ = " + i++);

let flag = false;

if (flag == true) {
  console.log(flag);
}
