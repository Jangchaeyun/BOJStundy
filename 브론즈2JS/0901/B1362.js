const fs = require("fs");

const inputLines = fs
  .readFileSync("input.txt", "utf8")
  .toString()
  .split("\n")
  .filter(Boolean);
let scene_num = 0;
const state = [":-)", ":-(", "RIP"];

let lineIndex = 0;

while (true) {
  const [o, w] = inputLines[lineIndex++].split(" ").map(Number);

  if (o === 0 && w === 0) {
    break;
  }

  let mIndex = lineIndex;
  while (true) {
    const m = inputLines[mIndex++].split(" ");
    if (m[0] === "#" && m[1] === "0") {
      break;
    }

    if (w > 0) {
      if (m[0] === "F") {
        w += parseInt(m[1]);
      } else {
        w -= parseInt(m[1]);
      }
    }
  }

  scene_num++;
  if (o * 0.5 < w && w < o * 2) {
    console.log(scene_num, state[0]);
  } else if (w <= 0) {
    console.log(scene_num, state[2]);
  } else {
    console.log(scene_num, state[1]);
  }

  lineIndex = mIndex;
}
