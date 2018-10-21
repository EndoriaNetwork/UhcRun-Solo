package mc.endorianetwork.uhcrun.Events;

import mc.endorianetwork.uhcrun.Game.UHCState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class UHCNoFall implements Listener {

    @EventHandler
    public void damagebyFall(EntityDamageEvent e){
        if(e.getCause() == EntityDamageEvent.DamageCause.FALL) {
            if(!UHCState.isState(UHCState.GAMEPVP)){
                e.setCancelled(true);
            }
        }
    }
}
