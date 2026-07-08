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
    : second < 3600
      ? "00"
      : second >= 3600 && second % 3600 > 0
        ? `${parseInt(second / 3600)}`
        : `0${parseInt(second / 3600)}`;

// let miniute =
//   second < 0
//     ? null
//     : second < 60
//       ? "00"
//       : second >= 60 && second % 60 > 0 ?
//     //   second <= 3540 && second / 60 > 9
//     ? `${parseFloat(second / 60)}`
//     : `0{parseFloat(second/60`;
/* 
    60 미만은 00 ,
    60 이상 360 이하.
    360 이상?? 예: 3660 = 01:01:00
*/

// let second2 =
//   scond < 0
//     ? null
//     : second >= 1 && second <= 59 && second > 9
//       ? second
//       : `0${second}`;
// $;

console.log(`${hour}:00:00`);

// :${miniute}:${second}
