const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function getLastConsecutiveZeros(N, decimal) {
  let zeros = 0;

  while (N) {
    if (N % decimal) {
      break;
    }
    zeros++;
    N /= decimal;
  }

  return zeros;
}

rl.question("Enter the number of test cases (T): ", (T) => {
  T = parseInt(T);

  const results = [];

  function processTestCase() {
    rl.question("Enter N for the next test case: ", (N) => {
      N = parseInt(N);

      if (N == 1) {
        results.push(0);
        continueOrExit();
        return;
      }

      let result = 1;

      for (let i = 2; i < N; i++) {
        result += getLastConsecutiveZeros(N, i);
      }

      results.push(result);
      continueOrExit();
    });
  }

  function continueOrExit() {
    if (results.length < T) {
      processTestCase();
    } else {
      rl.close();
      printResults();
    }
  }

  processTestCase();

  function printResults() {
    for (let i = 0; i < results.length; i++) {
      console.log(results[i]);
    }
  }
});
