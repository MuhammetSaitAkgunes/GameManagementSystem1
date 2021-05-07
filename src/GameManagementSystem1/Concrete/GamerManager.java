package GameManagementSystem1.Concrete;

import GameManagementSystem1.Abstract.GamerCheckService;
import GameManagementSystem1.Abstract.GamerService;
import GameManagementSystem1.Entities.Gamer;

import java.util.ArrayList;
import java.util.List;

public class GamerManager implements GamerService  {
    List<Gamer> gamerList = new ArrayList<>();

    GamerCheckService gamerCheckService;
    public GamerManager(GamerCheckService gamerCheckService){
        this.gamerCheckService=gamerCheckService;
    }


    @Override
    public void Add(Gamer gamer) {
        if (gamerCheckService.AgeCheck(gamer)){
            gamerList.add(gamer);
            System.out.println("gamer added : " + gamer.getName());
        }
        else{
            System.out.println("invalid gamer : " + gamer.getName());
        }
    }
    public void Listele(){
        System.out.println("---Gamer List---");
        int x = 1;
        for (var item : gamerList){
            System.out.println(x +"."+" "+ item.getName());
            x++;
        }
    }
    public void OyunlarıListele(Gamer gamer){
        System.out.println("Gamer : " + gamer.getName());
        for (var item : gamer.getGames()){
            System.out.println(item);
        }
    }
}
