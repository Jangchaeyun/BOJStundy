const readline = require("readline");
const fs = require("fs");

const rl = readline.createInterface({
  input: fs.createReadStream("input.txt"),
  output: process.stdout,
});

function ascending(array) {
  let now = array[0];
  let result = 1;
  for (let i = 1; i < array.length; i++) {
    if (now < array[i]) {
      result++;
      now = array[i];
    }
  }

  return result;
}

const array = [];

rl.on("line", (line) => {
  array.push(Number(line));
});

rl.on("close", () => {
  console.log(ascending(array));
  const reversedArray = [...array].reverse();
  console.log(ascending(reversedArray));
});
