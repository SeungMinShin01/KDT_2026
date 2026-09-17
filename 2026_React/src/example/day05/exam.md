SQA( 싱글페이지 )
훅: useState , useEffect
컴포넌트: 함수이면서 return 1번 , return 에 html 존재
즉 html 최신화 하기 위해서는 함수를 재 실행 (재 렌더링)
재 렌더링 기준: state변경, props 변경
useEffect: 컴포넌트 생명주기, - 함수 실행될 때 == 마운트 useEffect( () => . []); - 함수 재실행될 때 == 업데이트 useEffect( () => {} ); // 거의 안씀. 무한루프 위험 - 함수가 사라질 때 == 언마운트 useEffect( () => {} , [state변수] )
