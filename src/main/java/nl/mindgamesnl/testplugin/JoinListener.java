package nl.mindgamesnl.testplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        String name = event.getPlayer().getName();
        event.setJoinMessage("Er is een nieuwe speler bij gekomen! wat een prutser die " + name + "!");
    }

}
