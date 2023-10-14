const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
let input = [];
rl.on("line", function (line) {
  input.push(+line.toString());
}).on("close", function () {
  input.shift();
  let result = [];

  for (let i = 0; i < input.length; i++) {
    let prision = new Array(input[i] + 1).fill(true);
    for (let j = 2; j <= input[i]; j++) {
      for (let k = j; k <= input[i]; k += j) {
        prision[k] = !prision[k];
      }
    }
    result.push(prision.filter((el) => el === true).length - 1);
  }
  console.log(result.join("\n"));
  process.exit();
});
