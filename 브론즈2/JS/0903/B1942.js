const readline = require("readline");

const MAX = 3;
const MAX_SECOND = 60;
const MAX_MINUTE = 60;
const MAX_HOUR = 24;

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function getTimeStruct(input) {
  const startTime = {
    hour: parseInt(input.substring(0, 2)),
    minute: parseInt(input.substring(3, 5)),
    second: parseInt(input.substring(6, 8)),
  };

  const endTime = {
    hour: parseInt(input.substring(9, 11)),
    minute: parseInt(input.substring(12, 14)),
    second: parseInt(input.substring(6, 8)),
  };

  return { startTime, endTime };
}

function isTimeEqual(startTime, endTime) {
  return (
    startTime.hour === endTime.hour &&
    startTime.minute === endTime.minute &&
    startTime.second === endTime.second
  );
}

function convertTimeStructToInt(time) {
  return time.hour * 10000 + time.minute * 100 + time.second;
}

function incrementTime(time) {
  time.second++;

  if (time.second === MAX_SECOND) {
    time.second = 0;
    time.minute++;
  }

  if (time.minute === MAX_MINUTE) {
    time.minute = 0;
    time.hour++;
  }

  if (time.hour === MAX_HOUR) {
    time.hour = 0;
  }
}

function main() {
  const inputLines = [];
  let currentLine = 0;

  rl.on("line", (line) => {
    inputLines.push(line);
    currentLine++;

    if (currentLine === MAX) {
      rl.close();
    }
  });

  rl.on("close", () => {
    for (let i = 0; i < MAX; i++) {
      const input = inputLines[i];
      const { startTime, endTime } = getTimeStruct(input);

      let result = 0;

      while (true) {
        const start = convertTimeStructToInt(startTime);
        const end = convertTimeStructToInt(endTime);

        if (start % 3 === 0) {
          result++;
        }

        if (isTimeEqual(startTime, endTime)) {
          break;
        }

        incrementTime(startTime);
      }

      console.log(result);
    }
  });
}

main();
