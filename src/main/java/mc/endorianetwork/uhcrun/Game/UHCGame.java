package mc.endorianetwork.uhcrun.Game;

import mc.endorianetwork.uhcrun.UhcRun;
import mc.endorianetwork.uhcrun.Utils.UHCTeleport;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.UUID;

public class UHCGame {

    public static void start(){

        UHCState.setState(UHCState.GAME);

        for(UUID uuid : UhcRun.getInstance().playerInGame){
            Player pl = Bukkit.getPlayer(uuid);
            pl.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 1));

            UHCTeleport.tpRandom(pl);
        }
    }
}
