const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
let input = [];
rl.on("line", function (line) {
  input.push(line.toString());
}).on("close", function () {
  input.shift();
  input = input.map((el) => el.split(" "));
  for (let i = 0; i < input.length; i++) {
    let value = +input[i][0];
    for (let j = 1; j < input[i].length; j++) {
      if (input[i][j] === "@") value *= 3;
      else if (input[i][j] === "%") value += 5;
      else value -= 7;
    }
    console.log(value.toFixed(2));
  }

  process.exit();
});
