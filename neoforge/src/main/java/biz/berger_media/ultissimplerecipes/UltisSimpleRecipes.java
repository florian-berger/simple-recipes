package biz.berger_media.ultissimplerecipes;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class UltisSimpleRecipes {

    public UltisSimpleRecipes(IEventBus eventBus) {

        Constants.LOG.info("Initializing Ulti's Simple Recipes for NeoForge ...");
        CommonClass.init();

    }
}