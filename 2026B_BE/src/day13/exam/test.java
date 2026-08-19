package day13.exam;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class test {

    static final int CELL = 12; // 좌석 한 칸 폭

    // 사람 실루엣 (2줄짜리)
    static final String[] PERSON = { "⢀⣠⣄⡀", "⠈⠻⠟⠁" };
    static final String[] EMPTY = { "◌", " " };

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Seat[] seats = {
                new Seat(1, true, "EATING"),
                new Seat(2, true, "READY"),
                new Seat(3, true, "WAITING"),
                new Seat(4, false, null),
                new Seat(5, false, null)
        };
        Deque<String> logs = new ArrayDeque<>(List.of(
                "[12:51:45] SEAT 2: 음식이 서빙되었습니다.",
                "[12:52:00] SEAT 4: 식사 완료 후 퇴장했습니다.",
                "[12:52:00] SEAT 3: 신규 손님이 입장했습니다."));

        render(seats, logs);
    }

    public static void render(Seat[] seats, Deque<String> logs) {
        System.out.println("=".repeat(70));
        System.out.println("  [ RESTAURANT DB MONITOR ]  |  STATUS: UPDATED");
        System.out.println("=".repeat(70));
        System.out.println("  [ LONG TABLE #01 ]");
        System.out.println("  ┌" + "─".repeat(CELL * 5) + "┐");

        // 사람 그림: 줄(2) x 좌석(5) 이중 for
        for (int line = 0; line < PERSON.length; line++) {
            StringBuilder sb = new StringBuilder("  │");
            for (int i = 0; i < seats.length; i++) {
                String art = seats[i].isOccupied() ? PERSON[line] : EMPTY[line];
                sb.append(pad(art, CELL));
            }
            sb.append("│");
            System.out.println(sb);
        }

        // 좌석 번호 줄
        StringBuilder no = new StringBuilder("  │");
        for (int i = 0; i < seats.length; i++) {
            no.append(pad("[SEAT " + (i + 1) + "]", CELL));
        }
        System.out.println(no.append("│"));

        // 상태 라벨 줄
        StringBuilder st = new StringBuilder("  │");
        for (int i = 0; i < seats.length; i++) {
            st.append(pad(label(seats[i]), CELL));
        }
        System.out.println(st.append("│"));

        System.out.println("  └" + "─".repeat(CELL * 5) + "┘");

        // 이벤트 로그
        System.out.println("  [ RECENT EVENT LOGS ]");
        for (String log : logs) {
            System.out.println("  * " + log);
        }
        System.out.println("=".repeat(70));
        System.out.println("  * 이벤트 발생 시에만 화면이 자동으로 갱신됩니다.");
        System.out.println("=".repeat(70));
    }

    static String label(Seat s) {
        if (!s.isOccupied())
            return "( - )";
        return switch (s.getMealStatus()) {
            case "WAITING" -> "[대기중]";
            case "COOKING" -> "[조리중]";
            case "READY" -> "[서빙완]";
            case "EATING" -> "[식사중]";
            default -> "[ ? ]";
        };
    }

    // 한글 2칸 계산 포함 가운데 정렬
    static String pad(String s, int cell) {
        int w = 0;
        for (char c : s.toCharArray())
            w += (c >= 0xAC00 && c <= 0xD7A3) ? 2 : 1;
        int p = cell - w;
        if (p <= 0)
            return s;
        return " ".repeat(p / 2) + s + " ".repeat(p - p / 2);
    }
}

// 파일 맨 아래에 붙는 보조 클래스 (public 아님 - 한 파일에 둘 수 있음)
class Seat {
    private int seatNo;
    private boolean occupied;
    private String mealStatus;

    public Seat(int seatNo, boolean occupied, String mealStatus) {
        this.seatNo = seatNo;
        this.occupied = occupied;
        this.mealStatus = mealStatus;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public String getMealStatus() {
        return mealStatus;
    }
}