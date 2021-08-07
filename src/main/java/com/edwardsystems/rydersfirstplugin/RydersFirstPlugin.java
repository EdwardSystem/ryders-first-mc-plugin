package com.edwardsystems.rydersfirstplugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class RydersFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[RydersFirstPlugin] Successful boot. Standby.");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[RydersFirstPlugin] Successful shutdown. Goodbye.");
    }
}
