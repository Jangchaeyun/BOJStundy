const fs = require("fs");

const input = fs.readFileSync("input.txt", "utf8");
const arr = new Array(26).fill(0);
let maxcnt = 0;

for (let i = 0; i < input.length; i++) {
  const tmp = input[i];
  if (/[a-zA-Z]/.test(tmp)) {
    arr[tmp.toLowerCase().charCodeAt(0) - "a".charCodeAt(0)]++;
    if (maxcnt < arr[tmp.toLowerCase().charCodeAt(0) - "a".charCodeAt(0)]) {
      maxcnt = arr[tmp.toLowerCase().charCodeAt(0) - "a".charCodeAt(0)];
    }
  }
}

for (let i = 0; i < 26; i++) {
  if (maxcnt <= arr[i]) {
    process.stdout.write(String.fromCharCode(i + "a".charCodeAt(0)));
  }
}
