/*
받아야할 값
이름, 운동 종류, 운동시간, 칼로리
const로 들어갈만한거 - 분당 칼로리? 
*/
const calorie = 8;
let name = prompt("사용자의 이름을 적어주세요");
let exercise = prompt("진행한 운동 종류를 적어주세요");
let exerciseTime = prompt("진행한 운동시간(분)을 적어주세요.");
let calorieBurn = exerciseTime * calorie;

console.log("[운동기록]");
console.log("이름");
console.log(name);
console.log("운동종류");
console.log(exercise);
console.log("운동시간");
console.log(exerciseTime);
console.log("칼로리 (1분당 8칼로리)");
console.log(calorieBurn);
