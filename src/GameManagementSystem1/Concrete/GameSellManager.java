package GameManagementSystem1.Concrete;

import GameManagementSystem1.Abstract.GameSellService;
import GameManagementSystem1.Entities.Game;
import GameManagementSystem1.Entities.Gamer;

public class GameSellManager implements GameSellService {
    @Override
    public void sell(Game game, Gamer gamer) {
        gamer.getGames().add(game.getName());
        System.out.println("Ürün satıldı : " + game.getName() +" "+game.getUnitPrice());
    }

    @Override
    public void discount(Game game, int discountValue) {
        game.setDiscount(discountValue);
        game.setUnitPrice(game.getUnitPrice() - (game.getUnitPrice() * game.getDiscount() / 100));
    }

}
