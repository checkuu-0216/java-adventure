package Immutable.dungeon;

import Immutable.ImmutableMain;
import Immutable.emtity.Adventure;
import Immutable.emtity.Artifact;

public class Dungeon {
    //변수
    Labyrinth labyrinth;

    //던전 조립설명서 == 생성자
    public Dungeon(Labyrinth labyrinth) {
        this.labyrinth = labyrinth;
    }

    //메서드
    public Artifact enterDungeon(Adventure sassak) {
        Artifact artifact = labyrinth.navigate(sassak);
//        artifact.data += ImmutableMain.UNKOWN_FORCE;
        return artifact;
    }
}
