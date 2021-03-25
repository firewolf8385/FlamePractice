package me.firewolf8385.flamepractice;

import me.firewolf8385.flamepractice.utils.gui.GUIListeners;
import me.firewolf8385.flamepractice.utils.scoreboard.ScoreboardUpdate;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlamePractice extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new GUIListeners(), this);
        new ScoreboardUpdate().runTaskTimer(this, 20L, 20L);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}