package equals;

import java.util.Objects;

public class EqualsMain {
    //클래스 선언
    static class Adventurer { //생성자 있으나 비어있기때문ㅇ ㅔ생략
        //중괄호 안부분을 스코프라한다
        //이름
        String name = "임채규";
        int age = 30;
        int food = 0;

        //1. 식량 조회
//        반환자료형 메서드이름 () {}
        int getFood() {
            return food;
        }

        //2. 식량 추가
        void addFood(int amount) {
            food = food + amount;
        }

        //탐험 메소드
        void explore() {
            System.out.println("::: 시작 - 탐험을 시작합니다. :::");
            doSomething();
            System.out.println("::: 종료 = 탐험을 종료 합니다. :::");
        }

        void doSomething() {
            if (food <= 0) {
                System.out.println("움직일 수 없습니다....(현재 식량 개수: " + food + "개)");
            } else {
                food = food - 1;
                System.out.println("탐험 중...(남은 식량 개수: " + food + "개)");
            }
        }

        Map createMap(String terrain, int size) {
            if (food > 0) {
                food = food - 1;
                System.out.println("지도를 만드는 중 ... (남은 식량 개수: " + food + "개)");
                return new Map(terrain, size);
            }
            System.out.println("움직일 수 없습니다 ... (현재 실량 개수: " + food + "개)");
            return null;
        }
    }

    static class Map {
        //지형
        String terrain;
        //지도 크기
        int size;

        //생성자 : 조립 설명서
        Map(String terrain, int size) {
            this.terrain = terrain;
            this.size = size;
        }

        boolean equals(Map map) {
            return this.terrain == map.terrain;
        }

    }

    public static void main(String[] args) {
        //식량 주머니 3개 만들기
        int a = 1;
        int b = 1;
        int c = 1;
        //모험가 객체 소환 == 초기화 == 생성 == 인스턴스화
        Adventurer saeSSak = new Adventurer();
        saeSSak.addFood(a + b + c);

        Map mapA = saeSSak.createMap("forest", 10);
        Map mapB = saeSSak.createMap("forest", 1);
        Map mapC = saeSSak.createMap("desert", 10);

        boolean ret = (mapA.equals(mapB));
        boolean ret2 = (a == b);
        System.out.println("지도 비교 결과 : " + ret);
        System.out.println("식량 비교 결과 : " + ret2);
    }
}