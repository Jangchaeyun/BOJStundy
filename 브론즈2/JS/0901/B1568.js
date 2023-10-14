const fs = require("fs");

const input = fs.readFileSync("input.txt", "utf8");
const lines = input.split("\n");
const n = parseInt(lines[0]);

let bird = 1;
let count = 0;

for (let i = 1; i <= n; i++) {
  if (n < bird) {
    bird = 1;
  }
  n -= bird;
  bird++;
  count++;
}

console.log(count);
