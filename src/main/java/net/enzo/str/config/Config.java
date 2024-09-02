package net.enzo.str.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config {
    public static boolean isShift = true;

    public static void letsConfigurate(File file) {
        Configuration conf = new Configuration(file);

        try {
            conf.load();

            isShift = conf.get("General", "Hold SHIFT", isShift, "Set if player need to hol SHIFT for show the rarities").getBoolean(true);

        } catch (Exception e) {
            System.out.println("Can't find my config! (See the Rarities)");
            e.printStackTrace();
        } finally {
            conf.save();
        }
    }
}
