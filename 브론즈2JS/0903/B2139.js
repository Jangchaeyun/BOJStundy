const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function calculateLiveDay(year, month, day) {
  const inputDate = new Date(year, month - 1, day);
  const stdDate = new Date(year, 0, 1);

  const timeDiff = inputDate - stdDate;
  const daysDiff = Math.floor(timeDiff / (24 * 60 * 60 * 1000));

  return daysDiff + 1;
}

rl.on("line", (input) => {
  const [day, month, year] = input.split(" ").map(Number);

  if (day === 0 && month === 0 && year === 0) {
    rl.close();
  } else {
    console.log(calculateLiveDay(year, month, day));
  }
});
