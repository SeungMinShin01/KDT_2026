/*
    입력 (prompt)
    칸 번호 입력 (0 ~ 8)
    prompt(" 칸 번호를 입력하세요 (0~8")

    1. 입력값 검증
        a - 입력한 번호가 0~8 범위를 벗어날 경우
        b - 출력: 잘못된 위치입니다.
    2. 자리 중복 검사
        a - 선택한 칸에 이미 값이 있을 경우
        b - 출력: 이미 선택된 자리입니다.
    3. 정상 입력일 경우
        a - 현재 플레이어의 기호(X 또는 O)를 해당 인덱스에 저장
    4. 턴 교체
        a - 한턴이 끝나면
        b. X -> O
        c. O -> X   

    추가 제한 조건
    while 반복분 구성
    게임 승리 조건 배열을 별도로 구성하여 반복문으로 검사할 것.
    함수 사용 금지
*/

let turn = 0;
let 승자 = "";
let 게임판;
let 게임종료 = false;
for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 3; j++) {
    // 게임판 초기화
    게임판[i][j] += " ";
  }
}

for (let j = 0; j < 3; j++) {
  for (let j = 0; j < 3; j++) {
    // 게임판 출력
    document.querySelector("tbody").innerHTML +=
      `<tr><td>${게임판[i][j]}</td><td>${게임판[i][j]}</td><td>${게임판[i][j]}</td></tr>`;
  }
}
turn += 1;

while (1) {
  for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
      // 게임승리 조건 검증
      if (게임판[i][j] != " ") {
        if (
          게임판[i][j] == 게임판[i][j + 1] ||
          게임판[i][j] == 게임판[i + 1][j] ||
          (게임판[0][0] == 게임판[1][1] && 게임판[1][1] == 게임판[2][2]) ||
          (게임판[0][2] == 게임판[1][1] && 게임판[1][1] == 게임판[2][0])
        ) {
          if (turn % 2 == 1) {
            승자 = "선공";
            게임종료 = true;
            break;
          } else {
            승자 = "후공";
            게임종료 = true;
            break;
          }
        }
      }
    }
    if (turn % 2 == 1 && gameend == false) {
      let 칸번호 = Number(
        prompt(`선공 턴: ${turn} \n 칸 번호를 입력하세요 (0~8) :`),
      );
      if (게임판[칸번호] == " ") {
        게임판[칸번호] = "O";
        for (j = 0; j < 3; j++) {
          document.querySelector("tbody").innerHTML +=
            `<tr><td>${게임판[j * 3]}</td><td>${게임판[j * 3 + 1]}</td><td>${게임판[j * 3 + 2]}</td></tr>`;
        }
        turn++;
      } else continue;
    }
    if (turn % 2 == 0 && gameend == false) {
      let 칸번호 = Number(
        prompt(`후공 턴: ${turn} \n 칸 번호를 입력하세요 (0~8) :`),
      );
      if (게임판[칸번호] == " ") {
        게임판[칸번호] = "X";
        for (j = 0; j < 3; j++) {
          document.querySelector("tbody").innerHTML +=
            `<tr><td>${게임판[j * 3]}</td><td>${게임판[j * 3 + 1]}</td><td>${게임판[j * 3 + 2]}</td></tr>`;
        }
        turn++;
      } else continue;
    }
  }
}
