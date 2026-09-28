import { useState } from "react";

export default function UseRefExam1(props) {
  // 훅: 리액트에서 만든 다양한 함수들, 컴포넌트와 연관기능
  // useState, useEffect, useRef 등등
  const [stateNum, setStateNum] = useState(0); //state변수
  const refNUm = useRef(0); //ref변수
  let myNum = 0; //지역변수
  const plusState = () => {
    setStateNum(stateNum + 1);
  };
  const plusRef = () => {
    refNUm.current = refNUm.current + 1;
  };
  const plusMyNUm = () => {
    ++myNum;
  };
  return (
    <>
      <p> state : {stateNum}</p>
      <p> ref : {refNUm.current}</p>
      <p> myNum : {myNum}</p>
      <button onClick={plusState}>증가1</button>
      <button onClick={plusRef}>증가2</button>
      <button onClick={plusMyNUm}>증가3</button>
    </>
  );
}
