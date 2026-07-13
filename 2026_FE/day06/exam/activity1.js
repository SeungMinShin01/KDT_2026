let 전체결과 = "";

for (let i = 1; i <= 10; i++) {
  let 결과 = "";

  // 앞 공백
  for (let j = 1; j <= 10 - i; j++) {
    for (let j = 1; j <= i; j++) {
      결과 += " * ";
    }
  }

  전체결과 += 결과 + "\n";
}

for (let i = 9; i >= 1; i--) {
  let 결과 = "";

  // 앞 공백
  for (let j = 1; j <= 10 - i; j++) {
    결과 += " ";
  }

  // 별 + 공백
  for (let j = 1; j <= i; j++) {
    결과 += "* ";
  }

  전체결과 += 결과 + "\n";
}

console.log(전체결과);
