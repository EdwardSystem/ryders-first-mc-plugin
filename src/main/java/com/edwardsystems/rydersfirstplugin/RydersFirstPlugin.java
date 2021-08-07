package com.edwardsystems.rydersfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class RydersFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("TEST WE R COOL");
        getLogger().info("HELLO RYDER STOINLKS");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
