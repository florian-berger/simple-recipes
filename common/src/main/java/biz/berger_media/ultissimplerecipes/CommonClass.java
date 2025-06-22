package biz.berger_media.ultissimplerecipes;

import biz.berger_media.ultissimplerecipes.platform.Services;

public class CommonClass {

    public static void init() {
        if (Services.PLATFORM.isModLoaded("ultissimplerecipes")) {
            Constants.LOG.info("Loaded mod ultissimplerecipes in a {} {} environment", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
        } else {
            Constants.LOG.info("Don't know why, but ultissimplerecipes was not loaded ...");
        }
    }
}