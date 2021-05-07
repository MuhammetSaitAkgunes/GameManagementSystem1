package GameManagementSystem1;

import GameManagementSystem1.Concrete.AdapterManager;
import GameManagementSystem1.Concrete.GameSellManager;
import GameManagementSystem1.Concrete.GamerManager;
import GameManagementSystem1.Entities.Game;
import GameManagementSystem1.Entities.Gamer;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GameSellManager gameSeller = new GameSellManager();

        GamerManager gamerManager = new GamerManager(new AdapterManager());
        Gamer msa = new Gamer(1,"Muhammet",1999,new ArrayList());
        gamerManager.Add(new Gamer(3,"Sait",1985,new ArrayList()));
        gamerManager.Add(new Gamer(4,"Zahit",1995,new ArrayList()));
        gamerManager.Add(new Gamer(5,"Emre",1997,new ArrayList()));

        gamerManager.Listele();
        Game gta = new Game(1,"GTA V",200);
        Game max_payne = new Game(2,"Max Payne 1",20);
        gameSeller.sell(max_payne,msa);
        gameSeller.discount(gta,25);
        gameSeller.sell(gta,msa);

        gamerManager.OyunlarıListele(msa);

    }
}
