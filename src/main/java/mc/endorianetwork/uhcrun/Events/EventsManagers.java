package mc.endorianetwork.uhcrun.Events;

import mc.endorianetwork.uhcrun.UhcRun;
import mc.endorianetwork.uhcrun.Utils.UHCBlocksDrops;
import mc.endorianetwork.uhcrun.Utils.UHCSkullRegen;
import mc.endorianetwork.uhcrun.Utils.UHCSpeedRecipes;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventsManagers {

    public static void registerEvents(UhcRun pl){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new UHCJoin(), pl);
        pm.registerEvents(new UHCNoFall(), pl);
        pm.registerEvents(new UHCSpeedRecipes(), pl);
        pm.registerEvents(new UHCSkullRegen(), pl);
        pm.registerEvents(new UHCBlocksDrops(), pl);

    }
}
