let input = require("fs").readFileSync("input.txt").toString().split("\n");
let N = parseInt(input[0]);
function Trans(string) {
  let num = string.charCodeAt(0) - 65;
  return num;
}

for (let i = 1; i <= N; i++) {
  let arr = input[i].split("");
  let string = arr.slice(0, 3);
  let num1 =
    Trans(string[0]) * Math.pow(26, 2) +
    Trans(string[1]) * 26 +
    Trans(string[2]);
  let numArr = arr.slice(4).join("");
  let num2 = parseInt(numArr);

  let answer = num1 - num2;
  if (Math.abs(answer) <= 100) {
    console.log("nice");
  } else {
    console.log("not nice");
  }
}
