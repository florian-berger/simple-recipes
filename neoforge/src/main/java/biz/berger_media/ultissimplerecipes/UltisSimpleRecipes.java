package biz.berger_media.ultissimplerecipes;

import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class UltisSimpleRecipes {

    public UltisSimpleRecipes() {
        Constants.LOG.info("Initializing Ulti's Simple Recipes for NeoForge ...");
        CommonClass.init();
    }
}