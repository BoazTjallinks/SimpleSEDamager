package nl.blltjallinks.simplethrowdamange;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleThrowDamange extends JavaPlugin {
    public double velocity = 1;

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new HitPlayerEvent(), this);
        this.getCommand("setThrowVelocity").setExecutor(new setThrowVelocity());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
