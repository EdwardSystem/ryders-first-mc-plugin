package com.edwardsystems.rydersfirstplugin;

import com.edwardsystems.rydersfirstplugin.commands.RydersFirstPluginCommands;
import com.edwardsystems.rydersfirstplugin.events.RydersFirstPluginEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class RydersFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        RydersFirstPluginCommands commands = new RydersFirstPluginCommands();
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new RydersFirstPluginEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[RydersFirstPlugin] Successful boot. Standby.");
        // heal and feed commands executor
        getCommand("heal").setExecutor(new RydersFirstPluginCommands());
        getCommand("feed").setExecutor(new RydersFirstPluginCommands());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[RydersFirstPlugin] Successful shutdown. Goodbye.");
    }
}
