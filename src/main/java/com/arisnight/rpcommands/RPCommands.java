package com.arisnight.rpcommands;

import com.arisnight.rpcommands.commands.DoCommand;
import com.arisnight.rpcommands.commands.MeCommand;
import com.arisnight.rpcommands.commands.TryCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class RPCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("me").setExecutor(new MeCommand());
        getCommand("do").setExecutor(new DoCommand());
        getCommand("try").setExecutor(new TryCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
