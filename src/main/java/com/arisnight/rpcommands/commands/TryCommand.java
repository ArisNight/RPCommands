package com.arisnight.rpcommands.commands;

import com.arisnight.rpcommands.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class TryCommand implements CommandExecutor {

    private final String format = "&d* &7%s %s [%s]"; //ArisNight_ написал этот плагин [Удачно]

    private final String success = "&aУдачно&7";
    private final String fail = "&cНеудачно&7";

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) return true;

        Player player = (Player) sender;

        if (!player.hasPermission("rpcommand.try")) {
            return true;
        }

        if (args.length == 0) {
            return true;
        }

        String message = String.join(" ", args);

        Random random = new Random();

        boolean result = random.nextBoolean();

        String finalMessage = "";

        if (result){
            finalMessage = String.format(format, player.getName(), message, success);
        } else {
            finalMessage = String.format(format, player.getName(), message, fail);
        }

        Utils.sendMessage(player, 10, finalMessage);

        return true;
    }
}
