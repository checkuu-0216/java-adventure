import org.w3c.dom.ls.LSOutput;

public class Main {
    //클래스 선언
    static class Adventurer {
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
        void addFood (int amount) {
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
            }else {
                food = food -1;
                System.out.println("탐험 중...(남은 식량 개수: "+food+"개)");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Adventurer corb = new Adventurer();

         int food = corb.getFood();// 호출 : 식량 조회 메서드
        System.out.println("현재 식량 : " + food);//허출된 결과를 출력

        //호출2 : 식량 추가
        corb.addFood(2);
        //호출된 결과를 출력
        int updateFood = corb.getFood();
        System.out.println("업데이트된 식량 : " + updateFood);
        //탐험 진행
        corb.explore();
        corb.explore();
        corb.explore();
        int f = corb.getFood();
        System.out.println("------- 남은 식량 : " + f);
    }
}