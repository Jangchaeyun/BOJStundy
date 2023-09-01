const fs = require("fs");

const input = fs.readFileSync("input.txt", "utf8").split("\n");
const t_machine = input[0].split(":").map(Number);

const hour = Array.from({ length: 12 }, (_, index) => index + 1);
const min_sec = Array.from({ length: 60 }, (_, index) => index);

let result = 0;

for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 3; j++) {
    for (let k = 0; k < 3; k++) {
      if (i !== j && j !== k && k !== i) {
        if (
          hour.includes(t_machine[i]) &&
          min_sec.includes(t_machine[j]) &&
          min_sec.includes(t_machine[k])
        ) {
          result++;
        }
      }
    }
  }
}

console.log(result);
