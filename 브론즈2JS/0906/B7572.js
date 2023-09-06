const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
let input = 0;
rl.on("line", function (line) {
  input = +line.toString();
}).on("close", function () {
  input -= 4;
  let gan = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
  let zi = "ABCDEFGHIJKL".split("");
  let num10 = input < 0 ? gan.length + input : input % 10;
  let num12 = input < 0 ? zi.length + input : input % 12;
  console.log(zi[num12] + gan[num10]);
  process.exit();
});
