package dev.nschmeller.spigot.blankplugin;

import dev.nschmeller.spigot.blankplugin.listeners.Listeners;

import org.bukkit.plugin.java.JavaPlugin;

// From https://www.youtube.com/watch?v=oHKcQ184aa8 by Dream
public class App extends JavaPlugin {
    private App instance;

    public App getInstance() {
        return instance;
    }

    // BlankPlugin hello world methods
    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("Hello, SpigotMC!");

        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        instance = null;

        getLogger().info("See you again, SpigotMC!");
    }

    
}
