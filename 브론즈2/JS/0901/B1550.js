const fs = require("fs");
const input = fs.readFileSync("input.txt").toString().trim();
console.log(parseInt(input, 16));
