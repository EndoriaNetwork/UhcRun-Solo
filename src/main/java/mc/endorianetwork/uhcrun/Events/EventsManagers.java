package mc.endorianetwork.uhcrun.Events;

import mc.endorianetwork.uhcrun.UhcRun;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventsManagers {

    public static void registerEvents(UhcRun pl){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new UHCJoin(), pl);
        pm.registerEvents(new UHCNoFall(), pl);

    }
}
