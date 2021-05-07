package GameManagementSystem1.Abstract;

import GameManagementSystem1.Entities.Gamer;

public abstract class GamerCheckService {


    public boolean AgeCheck(Gamer gamer) {
        if (2021 - gamer.getBirthYear() >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
