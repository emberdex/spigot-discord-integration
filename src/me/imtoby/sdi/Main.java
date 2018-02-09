package me.imtoby.sdi;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("Starting the Discord integration...");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Stopping the Discord integration...");
    }

}
