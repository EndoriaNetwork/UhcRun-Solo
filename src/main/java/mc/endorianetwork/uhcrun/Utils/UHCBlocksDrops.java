package mc.endorianetwork.uhcrun.Utils;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Material.GRAVEL;
import static org.bukkit.Material.IRON_ORE;

public class UHCBlocksDrops implements Listener {

    @EventHandler
    public void breakBlock(BlockBreakEvent e){

        //CREER UNE VARIABLE LOCATION
        Location breakLoc = e.getBlock().getLocation();

        switch(e.getBlock().getType()){

            case IRON_ORE:
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
                breakLoc.getWorld().dropItemNaturally(breakLoc, new ItemStack(Material.IRON_INGOT, 2));
                break;

            case GRAVEL:
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
                breakLoc.getWorld().dropItemNaturally(breakLoc, new ItemStack(Material.ARROW, 2));
                break;


            case DIAMOND_ORE:
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
                breakLoc.getWorld().dropItemNaturally(breakLoc, new ItemStack(Material.DIAMOND, 2));
                break;

            case GOLD_ORE:
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
                breakLoc.getWorld().dropItemNaturally(breakLoc, new ItemStack(Material.GOLD_INGOT, 2));
                break;

            case COAL_ORE:
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
                breakLoc.getWorld().dropItemNaturally(breakLoc, new ItemStack(Material.TORCH, 4));
                break;



            default:
                break;

        }
    }
}
