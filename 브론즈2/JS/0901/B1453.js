const fs = require("fs");

const input = fs.readFileSync("input.txt", "utf8").split("\n");
const guest = parseInt(input[0]);
const a = new Array(101).fill(0);

let cnt = 0;
for (let i = 1; i <= guest; i++) {
  const num = parseInt(input[i]);
  if (a[num] > 0) {
    cnt++;
  }
  a[num]++;
}

console.log(cnt);
