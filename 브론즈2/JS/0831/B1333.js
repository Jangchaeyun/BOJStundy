const fs = require("fs");

const SILENT_SECTION = 5;

const input = fs.readFileSync("input.txt").toString().trim().split("\n");
const [N, L, D] = input[0].split(" ").map(Number);

let result;

for (let i = 1; ; i++) {
  if (D * i > N * L + (N - 1) * SILENT_SECTION) {
    result = D * i;
    break;
  }
}

for (let n = 1; n <= N; n++) {
  const silentStart = n * L + (n - 1) * SILENT_SECTION;
  const silentEnd = silentStart + SILENT_SECTION;

  let foundAnswer = false;

  for (let i = 1; D * i < silentEnd; i++) {
    if (silentStart <= D * i && D * i < silentEnd) {
      result = D * i;
      foundAnswer = true;
      break;
    }

    if (silentStart < D * i + 1 && D * i + 1 < silentEnd) {
      result = D * i + 1;
      foundAnswer = true;
      break;
    }
  }

  if (foundAnswer) {
    break;
  }
}

console.log(result);
