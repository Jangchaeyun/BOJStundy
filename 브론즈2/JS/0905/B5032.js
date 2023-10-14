const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
let input = [];
rl.on("line", function (line) {
  input = line
    .toString()
    .split(" ")
    .map((el) => Number(el));
}).on("close", function () {
  let bottle = input[0] + input[1];
  let canDrink = 0;
  let result = 0;
  while (bottle >= input[2]) {
    canDrink = Math.floor(bottle / input[2]);
    result += canDrink;
    bottle = (bottle % input[2]) + canDrink;
  }

  console.log(result);
  process.exit();
});
