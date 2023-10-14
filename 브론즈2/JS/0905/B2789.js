let fs = require("fs");
let input = fs.readFileSync("input.txt").toString();
let canbridge = "CAMBRIDGE".split("");
let result = "";

for (let i = 0; i < input.length; i++) {
  if (!canbridge.includes(input[i])) result += input[i];
}

console.log(result);
