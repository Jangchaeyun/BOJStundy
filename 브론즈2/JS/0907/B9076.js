const fs = require("fs");
const input = fs.readFileSync("input.txt").toString().trim().split("\n");

let T = parseInt(input[0]);
let newInput = [];
for (let i = 1; i <= T; i++) {
  newInput.push(input[i]);
}

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

function Solution(newInput) {
  let answer = [];

  newInput.map((Ni) => {
    Ni = Ni.split(" ").map((el) => parseInt(el));
    Ni = sort(Ni);

    if (Ni[1] - Ni[3] >= 4) answer.push("KIN");
    else answer.push(Ni[1] + Ni[2] + Ni[3]);
  });

  console.log(answer.join("\n"));
}

Solution(newInput);
