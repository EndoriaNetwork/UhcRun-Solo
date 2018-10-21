package mc.endorianetwork.uhcrun;

import mc.endorianetwork.uhcrun.Events.EventsManagers;
import mc.endorianetwork.uhcrun.Game.UHCState;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.UUID;

public final class UhcRun extends JavaPlugin {

    public static UhcRun instance;

    public ArrayList<UUID> playerInGame = new ArrayList<>();

    @Override
    public void onEnable() {

        UHCState.setState(UHCState.WAIT);

        instance = this;
        EventsManagers.registerEvents(this);

    }

    @Override
    public void onDisable() {

    }

    public static UhcRun getInstance(){
        return instance;
    }
}
