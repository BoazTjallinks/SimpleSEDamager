package nl.blltjallinks.simplethrowdamange;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class setThrowVelocity implements CommandExecutor {
    private SimpleThrowDamange plugin = SimpleThrowDamange.getPlugin(SimpleThrowDamange.class);

    // Checks if String is double
    private static boolean isDouble(String string) {
        try {
            Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()) {
            if (args.length == 1 && isDouble(args[0])) {
                plugin.setVelocity(Double.parseDouble(args[0]));
                sender.sendMessage(ChatColor.GREEN+"Success!");
            }
            else {
                sender.sendMessage(ChatColor.RED+"Sorry add a valid Number!");
            }
        }
        else {
            sender.sendMessage(ChatColor.RED+"Sorry you don't have permissions for this command!");
        }
        return false;
    }
}
