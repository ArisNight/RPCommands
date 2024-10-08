package com.arisnight.rpcommands.commands;

import com.arisnight.rpcommands.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DoCommand implements CommandExecutor {

    private final String format = "&e* &7%s &8(%s)"; // * Видео записывается (ArisNight_)

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) return true;

        Player player = (Player) sender;

        if (!player.hasPermission("rpcommand.do")) {
            return true;
        }

        if (args.length == 0) {
            return true;
        }

        String message = String.join(" ", args);

        String finalMessage = String.format(format, message, player.getName());

        Utils.sendMessage(player, 10, finalMessage);

        return true;
    }
}
