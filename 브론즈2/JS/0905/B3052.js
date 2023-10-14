let input = require("fs")
  .readFileSync("input.txt")
  .toString()
  .trim()
  .split("\n");

const userNum = [];

input.forEach((x) => {
  const num = x % 42;

  if (userNum.indexOf(num) === -1) {
    userNum.push(num);
  }
});

console.log(userNum.length);