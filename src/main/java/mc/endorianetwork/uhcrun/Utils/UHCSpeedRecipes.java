package mc.endorianetwork.uhcrun.Utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class UHCSpeedRecipes implements Listener {

    @EventHandler
    public void changeCraft(PrepareItemCraftEvent e){


        if(e.getInventory() instanceof CraftingInventory){

            CraftingInventory inv = (CraftingInventory)e.getInventory();

            switch(inv.getResult().getType()){


                case WOOD_PICKAXE:
                    ItemStack customResult = new ItemStack(Material.STONE_PICKAXE, 1);
                    ItemMeta customM = customResult.getItemMeta();
                    customM.setDisplayName("§ePioche en Pierre");
                    customM.addEnchant(Enchantment.DIG_SPEED, 2, true);
                    customM.addEnchant(Enchantment.DURABILITY, 3, true);
                    customResult.setItemMeta(customM);

                    inv.setResult(customResult);

                    break;

                case DIAMOND_PICKAXE:
                    ItemStack diamond = new ItemStack(Material.DIAMOND_PICKAXE, 1);
                    ItemMeta diamondM = diamond.getItemMeta();
                    diamondM.setDisplayName("§ePioche en diams");
                    diamondM.addEnchant(Enchantment.DIG_SPEED, 2, true);
                    diamondM.addEnchant(Enchantment.DURABILITY, 3, true);
                    diamond.setItemMeta(diamondM);

                    inv.setResult(diamond);
                    break;




                default:
                    break;

            }

        }


    }

}
