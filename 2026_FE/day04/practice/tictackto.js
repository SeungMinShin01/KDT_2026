let table = [".", ".", ".", ".", ".", ".", ".", ".", "."];

let name1 = prompt("첫번째 순서로 할 사람 이름 입력");
let name2 = prompt("두번째 순서로 할 사람 이름 입력");

let turn = 1;
let gameend1 = false;
let gameend2 = false;

// 첫번째 턴
if (turn % 2 != 0 && gameend1 == false && gameend2 == false) {
  //홀수 턴이고, 게임승리가 안됨
  let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9) 턴: ${turn}`)); //번호 입력
  if (table[indexO - 1] == ".") {
    //테이블이 빈칸(.)일때
    table[indexO - 1] = "O"; //O 삽입
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
      table[indexO - 1] = "O"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
    }
  } else if (gameend1 == true) {
    console.log(`게임종료: ${name1}님 승리!`);
  } else if (gameend2 == true) {
    console.log(`게임종료: ${name2}님 승리!`);
  }

  // 두번째 턴
  if (turn % 2 == 0 && gameend1 == false && gameend2 == false) {
    //짝수 턴이고, 게임승리가 안됨

    let indexO = Number(prompt("번호입력(0~9)")); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "X"; //X 삽입
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
        table[indexO - 1] = "X"; //O 삽입
        turn++; // 턴 + 1
        console.log(
          // 테이블 출력
          `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
        );
      }
    }
  }
  // 세번째 턴 -- 이후 홀수번 턴 복사 + 붙여넣기
  if (turn % 2 != 0 && gameend1 == false && gameend2 == false) {
    //홀수 턴이고, 게임승리가 안됨
    let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9) 턴: ${turn}`)); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "O"; //O 삽입
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
        table[indexO - 1] = "O"; //O 삽입
        turn++; // 턴 + 1
        console.log(
          // 테이블 출력
          `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
        );
      }
    } else if (gameend1 == true) {
      console.log(`게임종료: ${name1}님 승리!`);
    } else if (gameend2 == true) {
      console.log(`게임종료: ${name2}님 승리!`);
    }
  }

  // 네번째 턴 - 이후 짝수턴 복사 + 붙여넣기
  if (turn % 2 == 0 && gameend1 == false && gameend2 == false) {
    //짝수 턴이고, 게임승리가 안됨

    let indexO = Number(prompt("번호입력(0~9)")); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "X"; //X 삽입
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
        table[indexO - 1] = "X"; //O 삽입
        turn++; // 턴 + 1
        console.log(
          // 테이블 출력
          `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
        );
      }
    }
  }
  // 승리조건 검증
  if (
    (table[0] == "O" && table[1] == "O" && table[2] == "O") ||
    (table[3] == "O" && table[4] == "O" && table[5] == "O") ||
    (table[6] == "O" && table[7] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[3] == "O" && table[6] == "O") ||
    (table[1] == "O" && table[4] == "O" && table[7] == "O") ||
    (table[2] == "O" && table[5] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[4] == "O" && table[8] == "O") ||
    (table[2] == "O" && table[4] == "O" && table[6] == "O")
  )
    gameend1 = true;
  else if (
    (table[0] == "X" && table[1] == "X" && table[2] == "X") ||
    (table[3] == "X" && table[4] == "X" && table[5] == "X") ||
    (table[6] == "X" && table[7] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[3] == "X" && table[6] == "X") ||
    (table[1] == "X" && table[4] == "X" && table[7] == "X") ||
    (table[2] == "X" && table[5] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[4] == "X" && table[8] == "X") ||
    (table[2] == "X" && table[4] == "X" && table[6] == "X")
  )
    gameend2 = true;

  // 다섯번째 턴
  if (turn % 2 != 0 && gameend1 == false && gameend2 == false) {
    //홀수 턴이고, 게임승리가 안됨
    let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9) 턴: ${turn}`)); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "O"; //O 삽입
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
        table[indexO - 1] = "O"; //O 삽입
        turn++; // 턴 + 1
        console.log(
          // 테이블 출력
          `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
        );
      }
    } else if (gameend1 == true) {
      console.log(`게임종료: ${name1}님 승리!`);
    } else if (gameend2 == true) {
      console.log(`게임종료: ${name2}님 승리!`);
    }
  }
  if (
    (table[0] == "O" && table[1] == "O" && table[2] == "O") ||
    (table[3] == "O" && table[4] == "O" && table[5] == "O") ||
    (table[6] == "O" && table[7] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[3] == "O" && table[6] == "O") ||
    (table[1] == "O" && table[4] == "O" && table[7] == "O") ||
    (table[2] == "O" && table[5] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[4] == "O" && table[8] == "O") ||
    (table[2] == "O" && table[4] == "O" && table[6] == "O")
  )
    gameend1 = true;
  else if (
    (table[0] == "X" && table[1] == "X" && table[2] == "X") ||
    (table[3] == "X" && table[4] == "X" && table[5] == "X") ||
    (table[6] == "X" && table[7] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[3] == "X" && table[6] == "X") ||
    (table[1] == "X" && table[4] == "X" && table[7] == "X") ||
    (table[2] == "X" && table[5] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[4] == "X" && table[8] == "X") ||
    (table[2] == "X" && table[4] == "X" && table[6] == "X")
  )
    gameend2 = true;

  // 여섯번째 턴
  if (turn % 2 == 0 && gameend1 == false && gameend2 == false) {
    //짝수 턴이고, 게임승리가 안됨

    let indexO = Number(prompt("번호입력(0~9)")); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "X"; //X 삽입
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
        table[indexO - 1] = "X"; //O 삽입
        turn++; // 턴 + 1
        console.log(
          // 테이블 출력
          `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
        );
      }
    } else if (gameend1 == true) {
      console.log(`게임종료: ${name1}님 승리!`);
    } else if (gameend2 == true) {
      console.log(`게임종료: ${name2}님 승리!`);
    }
  }
  if (
    (table[0] == "O" && table[1] == "O" && table[2] == "O") ||
    (table[3] == "O" && table[4] == "O" && table[5] == "O") ||
    (table[6] == "O" && table[7] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[3] == "O" && table[6] == "O") ||
    (table[1] == "O" && table[4] == "O" && table[7] == "O") ||
    (table[2] == "O" && table[5] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[4] == "O" && table[8] == "O") ||
    (table[2] == "O" && table[4] == "O" && table[6] == "O")
  )
    gameend1 = true;
  else if (
    (table[0] == "X" && table[1] == "X" && table[2] == "X") ||
    (table[3] == "X" && table[4] == "X" && table[5] == "X") ||
    (table[6] == "X" && table[7] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[3] == "X" && table[6] == "X") ||
    (table[1] == "X" && table[4] == "X" && table[7] == "X") ||
    (table[2] == "X" && table[5] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[4] == "X" && table[8] == "X") ||
    (table[2] == "X" && table[4] == "X" && table[6] == "X")
  )
    gameend2 = true;

  // 일곱번째 턴
  if (turn % 2 != 0 && gameend1 == false && gameend2 == false) {
    //홀수 턴이고, 게임승리가 안됨
    let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9) 턴: ${turn}`)); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "O"; //O 삽입
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
        table[indexO - 1] = "O"; //O 삽입
        turn++; // 턴 + 1
        console.log(
          // 테이블 출력
          `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
        );
      }
    } else if (gameend1 == true) {
      console.log(`게임종료: ${name1}님 승리!`);
    } else if (gameend2 == true) {
      console.log(`게임종료: ${name2}님 승리!`);
    }
  }

  if (
    (table[0] == "O" && table[1] == "O" && table[2] == "O") ||
    (table[3] == "O" && table[4] == "O" && table[5] == "O") ||
    (table[6] == "O" && table[7] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[3] == "O" && table[6] == "O") ||
    (table[1] == "O" && table[4] == "O" && table[7] == "O") ||
    (table[2] == "O" && table[5] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[4] == "O" && table[8] == "O") ||
    (table[2] == "O" && table[4] == "O" && table[6] == "O")
  )
    gameend1 = true;
  else if (
    (table[0] == "X" && table[1] == "X" && table[2] == "X") ||
    (table[3] == "X" && table[4] == "X" && table[5] == "X") ||
    (table[6] == "X" && table[7] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[3] == "X" && table[6] == "X") ||
    (table[1] == "X" && table[4] == "X" && table[7] == "X") ||
    (table[2] == "X" && table[5] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[4] == "X" && table[8] == "X") ||
    (table[2] == "X" && table[4] == "X" && table[6] == "X")
  )
    gameend2 = true;

  // 여덟번째 턴
  if (turn % 2 == 0 && gameend1 == false && gameend2 == false) {
    //짝수 턴이고, 게임승리가 안됨

    let indexO = Number(prompt("번호입력(0~9)")); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "X"; //X 삽입
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
        table[indexO - 1] = "X"; //O 삽입
        turn++; // 턴 + 1
        console.log(
          // 테이블 출력
          `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
        );
      }
    } else if (gameend == true) {
      console.log(`게임종료: ${name1}님 승리! 턴: ${turn}`);
    }
  }
  if (
    (table[0] == "O" && table[1] == "O" && table[2] == "O") ||
    (table[3] == "O" && table[4] == "O" && table[5] == "O") ||
    (table[6] == "O" && table[7] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[3] == "O" && table[6] == "O") ||
    (table[1] == "O" && table[4] == "O" && table[7] == "O") ||
    (table[2] == "O" && table[5] == "O" && table[8] == "O") ||
    (table[0] == "O" && table[4] == "O" && table[8] == "O") ||
    (table[2] == "O" && table[4] == "O" && table[6] == "O")
  )
    gameend1 = true;
  else if (
    (table[0] == "X" && table[1] == "X" && table[2] == "X") ||
    (table[3] == "X" && table[4] == "X" && table[5] == "X") ||
    (table[6] == "X" && table[7] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[3] == "X" && table[6] == "X") ||
    (table[1] == "X" && table[4] == "X" && table[7] == "X") ||
    (table[2] == "X" && table[5] == "X" && table[8] == "X") ||
    (table[0] == "X" && table[4] == "X" && table[8] == "X") ||
    (table[2] == "X" && table[4] == "X" && table[6] == "X")
  )
    gameend2 = true;

  // 아홉번째 턴
  if (turn % 2 != 0 && gameend1 == false && gameend2 == false) {
    //홀수 턴이고, 게임승리가 안됨
    let indexO = Number(prompt(`${name1}님 차례: 번호입력(1~9) 턴: ${turn}`)); //번호 입력
    if (table[indexO - 1] == ".") {
      //테이블이 빈칸(.)일때
      table[indexO - 1] = "O"; //O 삽입
      turn++; // 턴 + 1
      console.log(
        // 테이블 출력
        `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
      );
      console.log("비겼습니다!.");
    } else if (table[indexO - 1] != ".") {
      let indexO = Number(
        prompt(`${name1}님 차례: 빈칸 숫자 재입력(1~9) 턴: ${turn}`),
      ); //번호 입력
      if (table[indexO - 1] == ".") {
        //테이블이 빈칸(.)일때
        table[indexO - 1] = "O"; //O 삽입
        turn++; // 턴 + 1
        console.log(
          // 테이블 출력
          `${table[0]} ${table[1]} ${table[2]}\n${table[3]} ${table[4]} ${table[5]}\n${table[6]} ${table[7]} ${table[8]}`,
        );
        console.log("비겼습니다!.");
      }
    }
  } else if (gameend1 == true) {
    console.log(`게임종료: ${name1}님 승리!`);
  } else if (gameend2 == true) {
    console.log(`게임종료: ${name2}님 승리!`);
  }
}
