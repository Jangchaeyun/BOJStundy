const fs = require("fs");

const input = fs.readFileSync("input.txt").toString().trim().split("\n")[0];
const nums = input.split(" ").map(Number);

const s1 = nums[0];
const s2 = nums[1];
const s3 = nums[2];

const result = Array(s1 + s2 + s3 + 13).fill(100);

for (let i = 1; i <= s1; i++) {
  for (let j = 1; j <= s2; j++) {
    for (let k = 1; k <= s3; k++) {
      result[i + j + k]--;
    }
  }
}

let min = 100;
let index = -1;
for (let n = 0; n < result.length; n++) {
  if (min > result[n]) {
    min = result[n];
    index = n;
  }
}

console.log(index);
