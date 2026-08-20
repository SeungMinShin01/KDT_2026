package day13.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class practice14 {
    static ArrayList<String> carList = new ArrayList<>();
    static String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("1.위치찾기 2.입차 3.출차 선택:");
            int ch = scan.nextInt();
            if (ch == 1) {
                System.out.println("번호 입력:");
                String carNumber = scan.next();
                int result = findCarLocation(carParkingList, carNumber);
                System.out.println(result);
            } // 위치찾기 구현1

            if (ch == 2) {
                System.out.println("위치 입력");
                String location = scan.next();
                System.out.println("차량번호 입력");
                String carNumber = scan.next();
                LocalDateTime localDate = LocalDateTime.now();
                String result1 = carCheckIn(carParkingList, location, carNumber, localDate);
                System.out.println(result1);
            } // 입차 구현
            if (ch == 3) {
                System.out.println("출차할 차량번호 입력:");
                String carNumber = scan.next();
                carCheckOut(carParkingList, carNumber);

            } // 출차 구현
        }

    }

    static void listSplit(String carParkingList) {
        carList.clear();
        String[] split = carParkingList.split("\n");
        for (int i = 0; i < split.length; i++) {
            String list = split[i];
            String[] list2 = list.split(",");
            for (String line : list2) {
                carList.add(line);
            }
        }

    }

    static int findCarLocation(String carParkingList, String carNumber) {
        listSplit(carParkingList);
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).equals(carNumber)) {
                return Integer.parseInt(carList.get(i - 1));
            }
        }
        return -1;
    };

    static String carCheckIn(String carParkingList2, String location, String carNumber, LocalDateTime dateTime) {
        listSplit(carParkingList);
        for (int i = 0; i < carList.size(); i++) {
            String list = carList.get(i);
            if (location.equals(list)) {
                return location + "번호에는 중복 주차할 수 없습니다.";
            }

        }
        // 포매터 StringBuilder
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String nowTime = dateTime.format(formatter);
        carParkingList += "\n" + location + "," + carNumber + "," + nowTime;

        // carList.add(nowTime);
        return location;

    }

    static int carCheckOut(String carParkingList, String carNumber) {

        listSplit(carParkingList);

        for (int i = 0; i < carList.size(); i++) {
            String carNum = carList.get(i);
            if (carNum.equals(carNumber)) {
                int year = Integer.parseInt(carList.get(i + 1).substring(0, 4));
                int month = Integer.parseInt(carList.get(i + 1).substring(4, 6));
                int day = Integer.parseInt(carList.get(i + 1).substring(6, 8));
                int hur = Integer.parseInt(carList.get(i + 1).substring(8, 10));
                int min = Integer.parseInt(carList.get(i + 1).substring(10, 12));

                LocalDateTime inTime = LocalDateTime.of(year, month, day, hur, min);
                LocalDateTime now = LocalDateTime.now();

                int inTotalDays = (inTime.getYear() * 365) + inTime.getDayOfYear();
                int nowTotalDays = (now.getYear() * 365) + now.getDayOfYear();
                int diffDays = nowTotalDays - inTotalDays;

                int inMinutesOfDay = (inTime.getHour() * 60) + inTime.getMinute();
                int nowMinutesOfDay = (now.getHour() * 60) + now.getMinute();

                int totalMinutes = (diffDays * 24 * 60) + (nowMinutesOfDay - inMinutesOfDay);
                if (totalMinutes < 0)
                    totalMinutes = 0;

                int days = totalMinutes / (24 * 60);
                int remainMinutes = totalMinutes % (24 * 60);
                int remainFee = 0;
                if (remainMinutes > 30) {
                    int billableMinutes = remainMinutes - 30;
                    remainFee = ((billableMinutes + 9) / 10) * 1000;
                }
                if (remainFee > 20000) {
                    remainFee = 20000;
                }
                int totalFee = (days * 20000) + remainFee;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                System.out.println(inTime.format(formatter));

                System.out.println("====== 출차 안내 ======");
                System.out.println("차량번호: " + carNumber);
                System.out.println("입차시간: " + inTime.format(formatter));
                System.out.println("출차시간: " + now.format(formatter));
                System.out.println("주차시간: " + totalMinutes + "분 (" + days + "일 " + remainMinutes + "분)");
                System.out.println("주차요금: " + totalFee + "원");
                System.out.println("=====================");

                return totalFee;
            }
        }
        return -1;
    }
}

/*
 * [ 문자열 실습 ] 타워 주차 관리 시스템 데이터 처리
 * 1. 문제 개요
 * 주차장 관제 시스템에서 관리 중인 차량 데이터(carParkingList)는 단일 String으로 관리되고 있습니다.
 * 이 데이터를 기반으로 입차, 출차, 내 차량 위치 찾기 기능을 구현하세요.
 * 단) 새로운 클래스 만들지 않습니다.
 * 
 * 2. 데이터 규격
 * 데이터 구분자:
 * 행(객체/차량) 구분: 줄바꿈 문자 (\n)
 * 열(속성) 구분: 쉼표 (,)
 * 컬럼 순서: 위치번호,차량번호,날짜시간(YYYYMMDDhhmm)
 * 
 * 초기 데이터 예시:
 * String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227";
 * 
 * 3. 구현 요구사항
 * 다음 세 기능 구현하세요.
 * ① 차량 위치 찾기 (findCarLocation)
 * 기능: 차량 번호를 입력받아 현재 주차된 위치 번호를 반환합니다.
 * 입력: carNumber (찾을 차량번호)
 * 출력/반환:
 * 차량이 존재할 경우: 주차 위치 번호 (예: "3")
 * 차량이 없을 경우: "미등록 차량" 또는 -1 반환
 * 
 * ② 입차 처리
 * 기능: 새로운 차량의 주차 정보를 기존 데이터에 추가합니다.
 * 조건:
 * 이미 주차되어 있는 위치 번호에는 중복 주차할 수 없습니다
 * 입력: location (위치번호), carNumber (차량번호), dateTime (입차일시)
 * 출력/반환:
 * 차량이 입차한 경우 : 주차 위치 번호 (예: "3")
 * 차량이 입차가 없을 경우: 위치 번호에는 중복 주차할 수 없습니다. (위치 중복 시 입차 불가 메시지 출력)
 * 
 * ③ 출차 처리
 * 기능: 출차할 차량 번호를 입력받아 해당 차량의 행을 carParkingList에서 삭제합니다.
 * 입력: carNumber (출차할 차량번호)
 * 반환: 해당 차량이 제거되고 줄바꿈이 올바르게 정리된 갱신된 carParkingList 문자열
 * 기본 정책: 최초 30분 무료추가 요금: 30분 초과 시, 10분당 1,000원 (10분 단위 절상/올림 계산)
 * 예: 31분 ~ 40분 주차 -> 1,000원
 * 예: 41분 ~ 50분 주차 -> 2,000원
 * 일일 최대 요금: 24시간(1일)당 최대 20,000원여러 날에 걸쳐 주차한 경우,
 * 각 일자 단위로 계산 후 합산하거나 총 일수×20,000원 + 잔여시간 요금(최대 20,000원)을 적용합니다.
 * 
 */