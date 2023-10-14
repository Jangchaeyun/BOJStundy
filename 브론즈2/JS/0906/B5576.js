const fs = require("fs");
const input = fs
  .readFileSync("input.txt")
  .toString()
  .trim()
  .split("\n")
  .map((el) => parseInt(el));

function sort(arr) {
  let tmp = 0;
  for (let i = 0; i < arr.length; i++)
    for (let j = i + 1; j < arr.length; j++)
      if (arr[i] < arr[j]) {
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
      }

  return arr;
}

function sumTop3(arr) {
  let sum = 0;
  for (let i = 0; i < 3; i++) sum += arr[i];

  return sum;
}

function Solution(input) {
  const W = [];
  const K = [];
  const answer = [];

  for (let i = 0; i < 20; i++) {
    if (i < 10) W.push(input[i]);
    else K.push(input[i]);
  }

  answer.push(sumTop3(sort(W)));
  answer.push(sumTop3(sort(K)));

  console.log(answer.join(" "));
}

Solution(input);
