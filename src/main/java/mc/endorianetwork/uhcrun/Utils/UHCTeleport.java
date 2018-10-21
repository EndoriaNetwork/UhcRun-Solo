package mc.endorianetwork.uhcrun.Utils;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.Random;

public class UHCTeleport {

    public static void tpRandom(Player p) {

        Random r = new Random();

        int x = r.nextInt(3000);
        int y = 128;
        int z = - r.nextInt(3000);
        World world = p.getWorld();

        Location randomLoc = new Location(world, x,y,z);

        p.teleport(randomLoc);
    }
}
