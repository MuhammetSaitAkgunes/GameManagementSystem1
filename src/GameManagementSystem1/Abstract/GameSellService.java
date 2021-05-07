package GameManagementSystem1.Abstract;

import GameManagementSystem1.Entities.Game;
import GameManagementSystem1.Entities.Gamer;

public interface GameSellService {
    void sell(Game game, Gamer gamer);
    void discount(Game game,int discountValue);
}
