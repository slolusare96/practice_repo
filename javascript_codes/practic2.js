//Problem 1
const marks = {
  harry: 98,
  rohan: 96,
  aakash: 63,
  preti: 72,
};

for (let a in marks) {
  console.log("The marks of " + a + " is " + marks[a]);
}

for (let i = 0; i < Object.keys(marks).length; i++) {
  console.log(
    "The marks of " +
      Object.keys(marks)[i] +
      " is " +
      marks[Object.keys(marks)[i]]
  );
}

// Problem 2
