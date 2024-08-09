package Immutable.dungeon;

import Immutable.ImmutableMain;
import Immutable.emtity.Adventure;
import Immutable.emtity.Artifact;

public class Labyrinth {
    Chamber chamber;

    public Labyrinth(Chamber chamber) {
        this.chamber = chamber;
    }

    //메서드
    public Artifact navigate(Adventure sassak) {
        Artifact artifact = chamber.findArtifact(sassak);
//        artifact.data += ImmutableMain.UNKOWN_FORCE;
        return artifact;
    }
}
