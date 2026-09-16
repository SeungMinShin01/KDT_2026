// [day04]

import { BrowserRouter } from "react-router-dom";
import App from "../day04/App";
// 2. 최초 렌더링 되는 컴포넌트 앞뒤로 라우터 컴포넌트 감싼다.
create.render(
  <BrowserRouter>
    <App />
  </BrowserRouter>,
);
