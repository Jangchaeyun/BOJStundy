const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Enter n: ", (n) => {
  n = parseInt(n);

  const mod = 45678;
  let result = 5;

  for (let i = 1; i < n; i++) {
    result = (result + (i + 2) * 3 - 2) % mod;
  }

  console.log(result);
  rl.close();
});
