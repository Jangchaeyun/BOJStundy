const fs = require("fs");
let [num, divider] = fs.readFileSync("input.txt").toString().trim().split(" ");

let ans = parseInt(num, Number(divider));

console.log(ans);
