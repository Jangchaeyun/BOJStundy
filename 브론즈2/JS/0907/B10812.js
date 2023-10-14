const fs = require("fs");
const [NnM, ...exes] = fs
  .readFileSync("input.txt")
  .toString()
  .trim()
  .split("\n");
const [n, m] = NnM.split(" ").map((e) => +e);
const baskets = new Array(n).fill(0).map((v, i) => i + 1);
const execute = (str) => {
  let [begin, end, mid] = str.split(" ").map((e) => e - 1);
  let tempBaskets = [...baskets];

  baskets = tempBaskets
    .splice(0, begin)
    .concat(tempBaskets.slice(mid, end + 1))
    .concat(begin, mid)
    .concat(tempBaskets.slice(end + 1, tempBaskets.length));
};
exes.forEach(execute);
console.log(baskets.join(" "));
