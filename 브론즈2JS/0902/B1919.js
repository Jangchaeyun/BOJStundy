const fs = require("fs");

const input = fs.readFileSync("input.txt", "utf-8").toString().split("\n");
const word1 = input[0].trim();
const word2 = input[1].trim();

let countAlphabet = new Array(26).fill(0);
let result = getAnagramCount(word1, word2);

function getAnagramCount(word1, word2) {
  let toBeRemovedCount = 0;

  for (let index = 0; index < word1.length; index++) {
    countAlphabet[word1.charCodeAt(index) - 97]++;
  }

  for (let index = 0; index < word2.length; index++) {
    countAlphabet[word2.charCodeAt(index) - 97]--;
  }

  for (let index = 0; index < countAlphabet.length; index++) {
    let count = Math.abs(countAlphabet[index]);
    toBeRemovedCount += count;
  }

  return toBeRemovedCount;
}

console.log(result);
