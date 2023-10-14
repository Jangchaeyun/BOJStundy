let inputs = require("fs")
  .readFileSync("input.txt")
  .toString()
  .trim()
  .split("\n");

let Euclid = (x, y) => {
  if (y === 0) return x;
  else return Euclid(y, x % y);
};

for (let i = 1; i <= inputs[0]; i++) {
  let input = inputs[i].split(" ");
  let ans = Euclid(input[0], input[1]);
  console.log((parseInt(input[0]) * parseInt(input[1])) / ans, ans);
}
