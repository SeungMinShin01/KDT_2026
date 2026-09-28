function ArticleWrite(props) {
  return (
    <article>
      <form
        onSubmit={(e) => {
          e.preventDefault();
          let title = e.target.title.value;
          let writer = e.target.write.value;
          let contents = e.target.contents.value;
          props.writeAction(title, writer, contents);
        }}
      >
        <table id="boardTable">
          <tbody>
            <tr>
              <th>작성자</th>
              <td>
                <input type="text" name="write" />
              </td>
            </tr>
            <tr>
              <th>제목</th>
              <td>
                <input type="text" name="title" />
              </td>
            </tr>
            <tr>
              <th>내용</th>
              <td>
                <textarea name="contents" cols="22" rows="3"></textarea>
              </td>
            </tr>
          </tbody>
        </table>
        <input type="submit" value="전송" />
      </form>
    </article>
  );
}

export default ArticleWrite;
