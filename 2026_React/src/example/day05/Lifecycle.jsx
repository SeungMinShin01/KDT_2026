import { useEffect, useState } from "react";

function MoveBox(props) {
  const [position, setPosition] = useState(props.initPosition);
  const [leftCount, setLeftCount] = useState(1);
  const boxStyle = {
    backgroundColor: "red",
    position: "relative",
    textAlign: "center",
    width: "100px",
    height: "100px",
    margin: "10px",
    lineHeight: "100px",
    left: `${position}px`,
  };
  const moveLeft = () => {
    setPosition(() => position - 20);
    setLeftCount(() => leftCount + 1);
  };
  const moveRight = () => {
    setPosition(() => position + 20);
  };
  // ******* 생명주기 ************** //

  useEffect(() => {
    console.log("useEffect 실행 --> 마운트");
    return () => {
      console.log("useEffect 실행 --> 언마운트");
    };
    //});   // [1] 의존성 배열을 생략했을 때 : 1. 마운트 2. 업데이트 될때마다 실행
    // }, []);   // [2] 의존성 배열 공백일 때    : 1.
  }, [leftCount]);
  console.log("return 실행 --> 렌더링");
  return (
    <>
      <div style={boxStyle}>{leftCount}</div>
      <button onClick={moveLeft}>좌측이동</button>
      <button onClick={moveRight}>우측이동</button>
    </>
  );
}

export default function Lifecycle(props) {
  return (
    <>
      <MoveBox initPosition={50}></MoveBox>
    </>
  );
}
