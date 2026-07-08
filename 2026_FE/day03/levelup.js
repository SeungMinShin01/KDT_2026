/*
    [1번]
    "초 단위 -> HH:MM:SS"
    0이상 정수 초 입력
    단 분/초가 한자리면 앞에 0을 붙여 출력
    if/ for/ math 금지

    1시간~ = 3600
    1분~59분 = 60 ~ 3540
    1초~59초 = 1 ~ 59 
*/

let second = Number(prompt("초 입력"));

let hour =
  second < 0
    ? null
    : parseInt(second / 3600) < 0 //0시간이하 -> 00
      ? "00"
      : parseInt(second / 3600) >= 100 // 100시간 이상
        ? null
        : parseInt(second / 3600) > 9 // 1시간 이상이면서 두자리
          ? `${parseInt(second / 3600)}` //두자리
          : `0${parseInt(second / 3600)}`; //한자리

/* 
    second /60 (분) /60 (시) 에서 ParseInt로 시간 부분만 
    
     ## 99시간 이하여야한다. + 
*/
let minute =
  second < 0
    ? null
    : parseInt((second % 3600) % 60) <= 0
      ? "00" //0분이하
      : parseInt((second % 3600) % 60) > 9
        ? `${parseInt((second % 3600) % 60)}`
        : `0${parseInt((second % 3600) % 60)}`;

let second2 =
  second < 0
    ? null
    : parseInt(second % 60) % 60 <= 0
      ? "00"
      : parseInt(second % 60) % 60 > 9
        ? `${parseInt(second % 60) % 60}`
        : `0${parseInt(second % 60) % 60}`;

console.log(`${hour}:${minute}:${second2}`);
/* 
    1분이상 59분이하
    60분이상 => 1시간
    3661 % 60 61 
    61 - 60 = 1
    3600 % 60 - 60 = 0
    36060 % 60 - 60 = 541?
    3660 % 60 % 60



*/

// let second2 =
//   scond < 0
//     ? null
//     : second >= 1 && second <= 59 && second > 9
//       ? second
//       : `0${second}`;
// $;

// :${miniute}:${second}
