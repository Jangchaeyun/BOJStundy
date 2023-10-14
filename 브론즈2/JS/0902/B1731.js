const fs = require("fs");

fs.readFileSync("input.txt", "utf8", (err, data) => {
  if (err) {
    console.log(err);
    return;
  }

  const lines = data.trim().split("\n");
  const n = parseInt(lines[0]);
  const arr = lines[1].split(" ").map(Number);

  if (Math.abs(arr[0] - arr[1]) === Math.abs(arr[1] - arr[2])) {
    const next = Math.abs(arr[0] - arr[1]);
    console.log(arr[n - 1] + next);
  } else {
    const next = arr[1] / arr[0];
    console.log(arr[n - 1] * next);
  }
});
