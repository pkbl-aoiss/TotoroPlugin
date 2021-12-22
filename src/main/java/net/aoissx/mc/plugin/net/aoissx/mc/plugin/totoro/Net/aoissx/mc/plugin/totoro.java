package net.aoissx.mc.plugin.net.aoissx.mc.plugin.totoro.Net.aoissx.mc.plugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class totoro extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Start Totoro Plugin");

        // Event registration
        plugin = this;
        Bukkit.getServer().getPluginManager().registerEvents(new eventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Stop Totoro Plugin...");
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
