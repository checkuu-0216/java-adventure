package Immutable;

import Immutable.dungeon.Chamber;
import Immutable.dungeon.Dungeon;
import Immutable.dungeon.Labyrinth;
import Immutable.emtity.Adventure;
import Immutable.emtity.Artifact;

public class ImmutableMain {

    public static int UNKOWN_FORCE = 1;

    public static void main(String[] args) {

        //던전 소환 == 인스턴스화
        Chamber chamber = new Chamber();
        Labyrinth labyrinth = new Labyrinth(chamber);
        Dungeon dungeon = new Dungeon(labyrinth);

        //모험가
        Adventure sassak = new Adventure();
        Artifact artifact = dungeon.enterDungeon(sassak);

        System.out.println("유물 데이터 확인 : " + artifact.data);

//        final int a = 1;

        //stringPool 공부하기
        //리터럴 선언 방식
        String strA = "world";
        String strB= "world";
        String strC = new String("world");
        String strD = new String("world");

        System.out.println(strA == strB);
        System.out.println(strC == strD);
        System.out.println(strB == strC);

//        concat 공부하기
        String newStr =strA.concat(strB);
        System.out.println(newStr);

    }
}
