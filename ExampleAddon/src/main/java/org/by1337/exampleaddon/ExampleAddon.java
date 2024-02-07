package org.by1337.exampleaddon;

import org.by1337.addonloader.Addon;
import org.by1337.addonloader.JavaAddon;

import java.io.File;
import java.util.Objects;

public class ExampleAddon extends JavaAddon {
    private static Addon instance;

    @Override
    public void onLoad() {
        setInstance(this);
    }

    @Override
    public void onEnable() {
        Objects.requireNonNull(getInstance());
        getLogger().info("enabled!");
        File config = new File(getDataFolder() + "/config.yml");
        if (!config.exists()){
            saveResource("config.yml", false);
        }
        config.delete();
        getDataFolder().delete();
    }

    @Override
    public void onDisable() {
        getLogger().info("disabled!");
        PingClass.ping();
    }

    public static Addon getInstance() {
        return instance;
    }

    public static void setInstance(Addon instance) {
        Objects.requireNonNull(instance);
        if (ExampleAddon.instance != null){
            throw new UnsupportedOperationException();
        }
        ExampleAddon.instance = instance;
    }
}
