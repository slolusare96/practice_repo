const person = {
  name: "shubham",
  age: 26,
  bio() {
    console.log(`Hi My name is ${this.name} and my age is ${this.age}`);
  },
};

console.log(person.bio());
