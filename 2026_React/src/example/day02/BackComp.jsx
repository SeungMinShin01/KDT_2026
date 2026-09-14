const BackComp = ({ onMyEvent2 }) => {
  return (
    <>
      <li>
        <a
          href="/"
          onClick={(event) => {
            event.preventDefault();
            onMyEvent2("백엔드 클릭됨(자식전달)");
          }}
          백엔드
        ></a>
      </li>
      <ul>
        <li>Java</li>
        <li>Oracle</li>
        <li>JSP</li>
        <li>Spring Boot</li>
      </ul>
    </>
  );
};
export default BackComp;

/*
    a 마크업 사용시 주의할점, 104p
        - a 마크업은 HTTP GET 통신 마크업이라서 깜빡거림.
        - 리액트는 CSR(HTTP 통신1번) 이라서 깜빡거림 제거
        onClick - { (e) -> {e.preventDefault(); }}
    콜백함수 형식
        const plust = (x, y) => { return x+y }
        const cal = ( x ) => {
            console.log( x(3, 4) )
        }
        ------------------------------------------------
        cal(plus( 3, 5 ))  ==> 8
        cal(plus)          ==> 7
    onClick= {plus(3,4)} ==> 오류
    onClick={ (x, y) => return x+y } ==> 정상

    let a; 변수 정의 , a 변수 호출
    function a(){} 함수정의 , a() 함수 호출
    const a()=>{} 함수정의 , a() 함수 호출

    props란? 상위 컴포넌트로 부터 전달받은 속성들(객체)
    구조분해란? 객체내 속성들을 각각 변수로 분해
        { onMyEvent2 : () => {}} => { onMyEvnet2 }
         let onMyEvent = () => { }
*/
