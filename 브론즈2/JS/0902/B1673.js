const fs = require("fs");

const inputText = fs.readFileSync("input.txt", "utf-8").split("\n");

for (let i = 0; i < inputText.length; i++) {
  const line = inputText[i].trim();

  if (line === "") continue;

  const input = line.split(" ");

  const coupon = parseInt(input[0]);
  const k = parseInt(input[0]);

  let count = 0;
  let newCoupon;
  let newCount;

  while (true) {
    newCount = coupon - (coupon % k);
    newCoupon = Math.floor(newCount / k);
    coupon = coupon % k;
    count += newCoupon;

    count += newCount;
    if (coupon < k) {
      count += coupon;
      break;
    }
  }

  console.log(count);
}
