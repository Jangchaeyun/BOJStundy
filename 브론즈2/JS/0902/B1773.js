const fs = require("fs");

fs.readFileSync("input.txt", "utf-8", (err, data) => {
  if (err) {
    console.error(err);
    return;
  }

  const lines = data.trim().split("\n");
  const [Student, End] = lines[0].split(" ").map(Number);
  const timeline = lines[1].split(" ").map(Number);

  let sum = 0;
  let mok = 0;

  for (let i = 0; i < Student; i++) {
    mok = End / timeline[i];
    sum += mok;
  }

  let flag = false;

  for (let i = 1; i <= End; i++) {
    for (let j = 0; j < Student; j++) {
      if (i % timeline[j] !== 0) {
        flag = false;
        break;
      } else {
        flag = true;
      }
    }

    if (flag) {
      sum--;
    }
  }

  console.log(sum);
});
