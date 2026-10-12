// [필수] 1. 리액트 라이브러리 최초 렌더링(그리기) 하는 함수
import { createRoot } from "react-dom/client";
// [필수] 2. index.html 에서 root 마크업 가져오기 , #ID , .Class
const root = document.querySelector("#root");
// [필수] 3. 가져온 root 마크업을 createRoot 함수에 거죵허소 랜도랑
const create = createRoot(root);
// [선택] 최초로 화면을 그리기 할 컴포넌트 가져와서 렌더링
// 1. import 이용하여 컴포넌트 가져온다.
// import App from "./App.jsx";
// 2. 가져온 컴포넌트 렌더링하기
// create.render(<App> </App>);
// [day01]
// import MyMarkUp from "./example/day01/exam1.jsx";
// create.render(<MyMarkUp></MyMarkUp>);

// import Component1 from "./example/day01/exam2.jsx";
// create.render(<Component1></Component1>);

// import ProductManager from "./example/day02/practice2/ProductManager.jsx";
// create.render(<ProductManager />);

// [day04]
// import { BrowserRouter } from "react-router-dom"; // 1. 라우터 라이브러리 가져오기
// import App from "./example/day04/App";
// // 2. 최초 렌더링 되는 컴포넌트 앞뒤로 라우터컴포넌트 감싼다.
// create.render(
//     <BrowserRouter>
//         <App />
//     </BrowserRouter>
// )

// import App from "./example/practice3/App";
// create.render(
//     <BrowserRouter>
//         <App />
//     </BrowserRouter>
// )

// [day05]
// import App from "./example/day05/App";
// import { BrowserRouter } from "react-router-dom";
// create.render(
//     <BrowserRouter> { /* 최초 렌더링 컴포넌트 감싼다.*/ }
//         <App />
//     </BrowserRouter>
// )

// day06
// import App from "./example/day06/App";
// create.render(
//     <BrowserRouter> { /* 최초 렌더링 컴포넌트 감싼다.*/ }
//         <App />
//     </BrowserRouter>
// )

// day07
// import { BrowserRouter } from "react-router-dom";
// import App from "./example/day07/App";
// create.render(<BrowserRouter><App/></BrowserRouter>)

// day10
// import { BrowserRouter } from "react-router-dom";
// import App from "./example/day10/App";
// create.render(<BrowserRouter><App/></BrowserRouter>)

// day13
import { BrowserRouter } from "react-router-dom";
import App from "./example/day13/App";
create.render(
  <BrowserRouter>
    <App />
  </BrowserRouter>,
);
