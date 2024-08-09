package Immutable.dungeon;


import Immutable.emtity.Adventure;
import Immutable.emtity.Artifact;

public class Chamber {
    // 유물
    final Artifact artifact = new Artifact(1);

    //메서드
    public Artifact findArtifact(Adventure sassak) {
//    sassak.takeArtifact(artifact);
        return artifact;
    }
}
