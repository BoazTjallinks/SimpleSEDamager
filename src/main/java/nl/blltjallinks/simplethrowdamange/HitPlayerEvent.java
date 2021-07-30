package nl.blltjallinks.simplethrowdamange;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.plugin.Plugin;

public class HitPlayerEvent implements Listener {
    private SimpleThrowDamange plugin = SimpleThrowDamange.getPlugin(SimpleThrowDamange.class);
    @EventHandler
    public void onPlayerHit(ProjectileHitEvent e) {
        // Give the hit entity kb damage

        if (e.getHitEntity() != null) {
            if (e.getHitEntity().getType().equals(EntityType.PLAYER) && e.getEntity().getType().equals(EntityType.SNOWBALL) || e.getEntity().getType().equals(EntityType.EGG)) {

                Player player = (Player) e.getHitEntity();
                Entity Shooter = (Entity) e.getEntity().getShooter();

                player.setVelocity(Shooter.getLocation().getDirection().multiply(plugin.velocity));
                player.setHealth(player.getHealth() - 0.0001);
            }
        }
    }
}
