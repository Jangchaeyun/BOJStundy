const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("", (input) => {
  const [n, m, l] = input.split(" ").map(Number);

  const ball_cnt = new Array(n + 1).fill(0);
  let res = 0;
  let npw = 0;

  while (true) {
    ball_cnt[now]++;
    if (ball_cnt[now] === m) break;

    if (ball_cnt[now] % 2 === 1) {
      now += l;
      if (now > n) {
        now -= n;
      }
    } else {
      now -= l;
      if (now <= 0) {
        now += n;
      }
    }

    res++;
  }

  console.log(res);
  rl.close();
});
