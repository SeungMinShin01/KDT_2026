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
    : second % 3600 <= 0 //0시간이하 -> 00
      ? "00"
      : second % 3600 > 0 && second % 3600 < 100 && second % 3600 > 9// 1시간 이상이면서 두자리
        ? `${parseInt(second / 3600)}` //두자리
        : `0${parseInt(second / 3600)}`; //한자리

/* 
     second % 3600 > 0 && second % 3600 > 9// 1시간 이상이면서 두자리
     
     ## 99시간 이하여야한다. + 
*/
let miniute =
  second < 0
    ? null
    : second % 360 == 0 ? "00" //0분이하
    : second % 360 > 0 && second % 360 < 60   //1분이상 59분 이하
    ?  
      
    //   second <= 3540 && second / 60 > 9
//     ? `${parseFloat(second / 60)}`
//     : `0{parseFloat(second/60`;
/* 
    1분이상 59분이하
    60분이상 => 1시간
    3661 % 60 61 
    61 - 60 = 1
    3600 % 60 - 60 = 0
    36060 % 60 - 60 = 541?
    3660 % 60 % 60
    36061 % 360 =61
    (second % 360 ) - Parseint(second % 360) 
    -> 나머지 - 시간부분?
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
