let reader = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});

reader.on("line", (line) => {
  if (line[0] === "0" && line[1] !== "x") {
    console.log(parseInt(line, 8));
  } else if (line[0] === "0" && line[1] === "x") {
    console.log(parseInt(line, 16));
  } else {
    console.log(line);
  }

  reader.close();
});
