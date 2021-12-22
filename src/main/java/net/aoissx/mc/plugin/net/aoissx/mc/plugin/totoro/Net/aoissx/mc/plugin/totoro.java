package net.aoissx.mc.plugin.net.aoissx.mc.plugin.totoro.Net.aoissx.mc.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class totoro extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Start Totoro Plugin");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Stop Totoro Plugin...");
    }
}
