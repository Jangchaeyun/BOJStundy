const readline = require("readline");
const fs = require("fs");

const rl = readline.createInterface({
  input: fs.createReadStream("input.txt"),
  output: process.stdout,
  terminal: false,
});

let N = null;
let count = 0;
let size = null;
let fileArr = [];

rl.on("line", (line) => {
  if (N === null) {
    N = parseInt(line);
  } else if (size === null) {
    size = parseInt(line);
  } else {
    fileArr = line.split(" ").map(Number);
    for (let i = 0; i < N; i++) {
      const file = fileArr[i];
      if (file !== 0) {
        count += Math.floor(file / size);
        if (file % size !== 0) {
          count++;
        }
      }
    }
    console.log(size * count);
    rl.close();
  }
});
