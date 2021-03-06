package dev.lazze.basics.events;

import dev.lazze.basics.Main;
import dev.lazze.basics.utils.Color;
import net.md_5.bungee.api.plugin.*;
import net.md_5.bungee.api.event.*;
import net.md_5.bungee.api.connection.*;
import net.md_5.bungee.event.*;

public class MaintenanceEventB implements Listener
{
    private Main plugin;
    
    public MaintenanceEventB(Main plugin) {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void postLogin(PostLoginEvent event) {
        ProxiedPlayer player = event.getPlayer();
        if (Main.configuration.getBoolean("maintenance.whitelisted") && !player.hasPermission(Main.configuration.getString("permission.staff"))) {
            player.disconnect(Color.translate(Main.configuration.getString("maintenance.kick-message").replace("{nl}", "\n")));
        }
    }
}
