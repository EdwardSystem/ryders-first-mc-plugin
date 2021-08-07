package com.edwardsystems.rydersfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class RydersFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("ryders cool");
        getLogger().info("HELLO RYDER STOINLKS");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
