package day06.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Post[] posts = new Post[100];
        Scanner scan = new Scanner(System.in);

        for (;;) {
            System.out.println("======== My Community ========");
            System.out.println("1. 게시물 작성 2. 게시물 출력");
            System.out.println("==============================");
            System.out.print("번호>");

            int no = scan.nextInt();
            scan.nextLine();

            if (no == 1) {
                System.out.println("내용 입력 :");
                String content = scan.nextLine();
                System.out.println("작성자 입력 :");
                String writer = scan.nextLine();

                Post post = new Post(content, writer);
                boolean result = false;

                for (int i = 0; i < posts.length; i++) {
                    if (posts[i] == null) {
                        posts[i] = post;

                        result = true;
                        break;
                    }
                }

                if (result) {
                    System.out.println("[안내] 게시물 작성 성공");
                } else {
                    System.out.println("[안내] 게시물 작성 실패");
                }

            } else if (no == 2) {

                for (Post post : posts) {
                    if (post != null) {
                        System.out.printf("내용 : %s , 작성자 : %s \n", post.content, post.writer);
                    }
                }
            }

        }

    }

}

class Post {
    String content;
    String writer;

    public Post() {

    }

    public Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

}