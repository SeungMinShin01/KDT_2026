let table = [".", ".", ".", ".", ".", ".", ".", ".", "."];

console.log(table);

let name1 = prompt("첫번째 순서로 할 사람 이름 입력");
let name2 = prompt("두번째 순서로 할 사람 이름 입력");
let emptynumber = [];
let turn = 1;
let gameend = false;

// if ("o" == "O") console.log("같다.");

// 첫번째 턴
if (turn % 2 != 0 && gameend == false) {
  //홀수 턴이고, 게임승리가 안됨
  let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9) 턴: ${turn}`)); //번호 입력
  if (table[indexO - 1] == ".") {
    //테이블이 빈칸(.)일때
    table[indexO - 1] = "o"; //O 삽입
    turn++; // 턴 + 1
    console.log(
      // 테이블 출력
      `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
    );
  } else if (table[indexO - 1] != ".") {
    let indexO = Number(
      prompt(`${name1}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
    ); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "o"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  }
}

// 두번째 턴
if (turn % 2 == 0 && gameend == false) {
  //짝수 턴이고, 게임승리가 안됨

  let indexO = Number(prompt("번호입력(0~9)")); //번호 입력
  if (table[indexO - 1] == ".") {
    //테이블이 빈칸(.)일때
    table[indexO - 1] = "x"; //X 삽입
    turn++; // 턴 + 1
    console.log(
      // 테이블 출력
      `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
    );
  } else if (table[indexO - 1] != ".") {
    let indexO = Number(
      prompt(`${name2}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
    ); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "x"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  }
}

// 세번째 턴
if (turn % 2 != 0 && gameend == false) {
  let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9 턴: ${turn}`));
  if (table[indexO - 1] == ".") {
    table[indexO - 1] = "o";
    turn++;
    console.log(
      `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
    );
  } else if (table[indexO - 1] != ".") {
    let indexO = Number(
      prompt(`${name1}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
    ); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "o"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  }
}
// 네번째 턴
if (turn % 2 == 0 && gameend == false) {
  let indexO = Number(prompt("번호입력(0~9"));
  if (table[indexO - 1] == ".") {
    table[indexO - 1] = "x";
    turn++;
    console.log(
      `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
    );
  } else if (table[indexO - 1] != ".") {
    let indexO = Number(
      prompt(`${name2}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
    ); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "x"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  }
}

// 다섯번째 턴
if (turn % 2 != 0 && gameend == false) {
  let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9 턴: ${turn}`));
  if (table[indexO - 1] == ".") {
    table[indexO - 1] = "o";
    turn++;
    console.log(
      `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
    );
  } else if (table[indexO - 1] != ".") {
    let indexO = Number(
      prompt(`${name1}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
    ); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "o"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  }
}

// 여섯번째 턴
if (turn % 2 == 0 && gameend == false) {
  let indexO = Number(prompt("번호입력(0~9"));
  if (table[indexO - 1] == ".") {
    table[indexO - 1] = "x";
    turn++;
    console.log(
      `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
    );
  } else if (table[indexO - 1] != ".") {
    let indexO = Number(
      prompt(`${name2}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
    ); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "x"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  }
}

// 일곱번째 턴
if (turn % 2 != 0 && gameend == false) {
  let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9 턴: ${turn}`));
  if (table[indexO - 1] == ".") {
    table[indexO - 1] = "o";
    turn++;
    console.log(
      `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
    );
  } else if (table[indexO - 1] != ".") {
    let indexO = Number(
      prompt(`${name1}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
    ); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "o"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  }
}

// 여덟번째 턴
if (turn % 2 == 0 && gameend == false) {
  let indexO = Number(prompt("번호입력(0~9"));
  if (table[indexO - 1] == ".") {
    table[indexO - 1] = "x";
    turn++;
    console.log(
      `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
    );
  } else if (table[indexO - 1] != ".") {
    let indexO = Number(
      prompt(`${name2}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
    ); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "x"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  }
}

// 아홉번째 턴 (마지막턴)
if (turn % 2 != 0 && gameend == false) {
  let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9 턴: ${turn}`));
  if (table[indexO - 1] == ".") {
    table[indexO - 1] = "o";
    turn++;
    console.log(
      `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
    );
    if (gameend == false) console.log("비겼습니다!");
  } else if (table[indexO - 1] != ".") {
    let indexO = Number(
      prompt(`${name1}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
    ); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "o"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  }
}
