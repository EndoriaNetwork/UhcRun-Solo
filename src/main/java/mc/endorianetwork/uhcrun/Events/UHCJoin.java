package mc.endorianetwork.uhcrun.Events;

import mc.endorianetwork.uhcrun.Game.UHCGame;
import mc.endorianetwork.uhcrun.Game.UHCState;
import mc.endorianetwork.uhcrun.UhcRun;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.UUID;


public class UHCJoin implements Listener {

    static int task;
    static int timer = 30;

    @EventHandler
    public void join(PlayerJoinEvent e){
        Player p = e.getPlayer();


        if(UHCState.isState(UHCState.WAIT)){


            if(!UhcRun.getInstance().playerInGame.contains(p.getUniqueId())){


                UhcRun.getInstance().playerInGame.add(p.getUniqueId());

                if(UhcRun.getInstance().playerInGame.size() == 1){


                    task = Bukkit.getScheduler().scheduleSyncRepeatingTask(UhcRun.getInstance(), new Runnable(){

                        @Override
                        public void run() {

                            timer--;
                            setLevel(timer);

                            if(timer == 15){

                                for(UUID uuid : UhcRun.getInstance().playerInGame){
                                    Player pl = Bukkit.getPlayer(uuid);
                                    pl.sendMessage("LE JEU COMMENCE DANS 15 SEC");
                                }


                            }

                            if(timer == 0){
                                Bukkit.getScheduler().cancelTask(task);
                                UHCGame.start();
                            }

                        }

                    },20,20);

                }


            }
        }else{
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage("Le jeu a commencé vous etes desormais un spectateur");
        }

    }


    public void setLevel(int timer){
        for(UUID uuid : UhcRun.getInstance().playerInGame){
            Player pl = Bukkit.getPlayer(uuid);
            pl.setLevel(timer);
        }
    }

    @EventHandler
    public void quit(PlayerQuitEvent e){


        Player p = e.getPlayer();

        UhcRun.getInstance().playerInGame.remove(p.getUniqueId());
    }

}