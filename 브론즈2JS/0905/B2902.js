const short = require("fs").readFileSync("input.txt").toString();
console.log(short.match(/[A-Z]/g).reduce((acc, i) => acc + i, ""));
