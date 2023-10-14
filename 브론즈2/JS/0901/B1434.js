const fs = require("fs");

const input = fs.readFileSync("input.txt", "utf8").split("\n");
const [N, M] = input[0].split(" ").map(Number);
const box = input[1].split(" ").map(Number);
const book = input[2].split(" ").map(Number);

let i = 0;
let j = 0;
let t = 0;
let in_box = 0;

while (i < N && j < M) {
  if (box[i] > t + book[j]) {
    t = 0;
    i += 1;
  } else {
    in_box += book[j];
    t += book[j];
    j += 1;
  }
}

const totalSum = box.reduce((acc, val) => acc + val, 0);
console.log(totalSum - in_box);
