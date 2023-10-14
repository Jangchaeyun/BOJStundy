let fs = require("fs");
let input = fs.readFileSync("input.txt").toString().split(" ");

let number = Number(input);
let result = "";

for (let i = 0; i < number * 2; i++) {
  if (i !== 0) {
    result += "\n";
  }
  if (i % 2 === 0) {
    for (let j = 0; j < number; j++) {
      if (j % 2 === 0) {
        result += "*";
      } else {
        result += " ";
      }
    }
  } else {
    for (let j = 0; j < number; j++) {
      if (j % 2 === 0) {
        result += " ";
      } else {
        result += "*";
      }
    }
  }
}

console.log(result);
