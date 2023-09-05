let fs = require("fs");
let input = fs.readFileSync("input.txt").toString().split("\n");
let alpha = "abcdefghijklmnopqrstuvwxyz".toUpperCase().split("");
alpha = new Map(alpha.map((el, idx) => [el, idx + 1]));
for (let i = 1; i <= +input[0]; i++) {
  let test = input[i].split(" ");
  let result = "Distances: ";
  for (let j = 0; j < test[0].length; j++) {
    let str1 = alpha.get(test[0][j]);
    let str2 = alpha.get(test[1][j]);
    if (str1 <= str2) result += str2 - str1 + " ";
    else result += str2 + 26 - str1 + " ";
  }
  console.log(result.trim());
}
