const fs = require("fs");

const input = fs.readFileSync("input.txt").toString().trim().split("\n");
const [N, m, M, T, R] = input[0].split(" ").map(Number);

let cur = m,
  dest = 0,
  cnt = 0;
let flag = false;

while (true) {
  if (dest === N) {
    break;
  }
  if (cur + T <= M) {
    cur += T;
    dest++;
    cnt++;
    flag = false;
    continue;
  }
  if (cur - R >= m) {
    cur -= R;
    cnt++;
    flag = false;
    continue;
  }
  if (cur - R < m) {
    cur = m;
    cnt++;
    if (flag) {
      cnt = -1;
      break;
    }
    flag = true;
  }
}

console.log(cnt);
