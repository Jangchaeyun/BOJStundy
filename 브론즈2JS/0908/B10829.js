const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");
let n = Number(input[0]);
let answer = "";

function NumberTrans(n) {
  if (n <= 1) {
    answer += n % 2;
    return 0;
  }
  answer += n % 2;
  return NumberTrans(Math.floor(n / 2));
}

NumberTrans(n);

answer = answer.split("").reverse().join("");
console.log(answer);
