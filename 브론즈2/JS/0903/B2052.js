const fs = require("fs");
const input = fs.readFileSync("input.txt", "utf-8").toString().trim();
const n = parseInt(input);
const ans = Math.pow(0.5, n);
console.log(ans.toFixed(n));
