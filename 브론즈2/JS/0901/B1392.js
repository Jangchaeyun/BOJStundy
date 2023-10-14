const fs = require("fs");

const input = fs.readFileSync("input.txt", "utf8").split("\n");
const [N, Q] = input[0].split(" ").map(Number);

const musicList = input.slice(1, N + 1).map(Number);
const findList = input.slice(N + 1, N + Q + 1).map(Number);

const result = [];
let i = 1;
for (const item of musicList) {
  for (let j = 0; j < item; j++) {
    result.push(i);
  }
  i++;
}

for (const item of findList) {
  console.log(result[item]);
}
