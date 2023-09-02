const fs = require("fs");

function encrypt(plainText, key) {
  let ciperText = "";
  const pLen = plainText.length;
  const kLen = key.length;

  for (let i = 0; i < pLen; i++) {
    const a = plainText.charAt(i);
    if (a !== " ") {
      const gap = key.charAt(i % kLen).charCodeAt(0) - 96;
      const encryptedChar = String.fromCharCode(
        a.charCodeAt(0) - gap < 97
          ? a.charCodeAt(0) - gap + 26
          : a.charCodeAt(0) - gap
      );
      ciperText += encryptedChar;
    } else {
      ciperText += " ";
    }
  }

  return ciperText;
}

fs.readFileSync("input.txt", "utf-8", (err, data) => {
  if (err) {
    console.log(err);
  }

  const lines = data.trim().split("\n");
  if (lines.length < 2) {
    console.error("Input file should contain at least two lines.");
    return;
  }

  const plainText = lines[0].trim();
  const key = lines[1].trim();
  const ciperText = encrypt(plainText, key);

  console.log(ciperText);
});
