let input = require("fs")
  .readFileSync("input.txt")
  .toString()
  .trim()
  .split(" ");
let arrA = input[0].split("").map((n) => parseInt(n));
let arrB = input[1].split("").map((n) => parseInt(n));
arrA.reverse();
arrB.reverse();
let answer = [];
if (arrA.length >= arrB.length) {
  for (let i = 0; i < arrA.length; i++) {
    if (arrB[i]) {
      answer.push(arrA[i] + arrB[i]);
    } else {
      answer.push(arrA[i]);
    }
  }
} else {
  for (let i = 0; i < arrB.length; i++) {
    if (arrA[i]) {
      answer.push(arrA[i] + arrB[i]);
    } else {
      answer.push(arrB[i]);
    }
  }
}

answer.reverse();
console.log(answer.join(""));
