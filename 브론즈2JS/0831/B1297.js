const fs = require("fs");

const input = fs.readFileSync("input.txt").toString().trim().split("\n")[0];
const temp = input.split(" ").map(Number);

const diagonal = temp[0];
const height = temp[1];
const width = temp[2];

const res = Math.sqrt(diagonal ** 2 / (height ** 2 + width ** 2));
console.log(`${Math.floor(res * height)} ${Math.floor(res * width)}`);
