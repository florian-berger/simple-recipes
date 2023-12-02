package biz.berger_media.ultissimplerecipes;

import net.fabricmc.api.ModInitializer;

public class UltisSimpleRecipes implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Initializing Ulti's Simple Recipes for Fabric ...");
        CommonClass.init();
    }
}
