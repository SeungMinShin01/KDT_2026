/*
    1. 컴포넌트명.jsx 파일 생성한다.
    2. export defualt Function 컴포넌트명( props ){ }
        export defualt : 내보내기, 다른 파일에서 import 할 수 있도록
            - 만약에 내부에서 사용하는 컴포넌트 생략
        컴포넌트명: 첫글자 무조건 대문자로 시작
    3. { } 안에 return 에서는 JSX 문법가능. 그외 JS 문자
        return 에서는 2줄이상 입력시(<> </>)묶는다.
*/

export default function Component1(props) {
  // 본문
  return (
    <>
      <Header></Header>
      <div> 메인페이지 </div>
      <Footer></Footer>
    </>
  );
}
function Header(props) {
  // 헤더
  return <div> 헤더구역 </div>;
}

function Footer(props) {
  // 푸터
  return <div> 푸터구역 </div>;
}
