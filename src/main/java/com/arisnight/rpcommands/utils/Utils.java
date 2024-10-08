package com.arisnight.rpcommands.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Utils {

    public static String color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    public static void sendMessage(Player player, int radius, String message){
        for (Player player1 : player.getLocation().getWorld().getPlayers()){
            if (player1.getLocation().distance(player.getLocation()) <= radius){
                player1.sendMessage(color(message));
            }
        }
    }

}
