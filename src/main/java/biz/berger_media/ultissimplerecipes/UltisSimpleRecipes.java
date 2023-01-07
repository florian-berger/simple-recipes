package biz.berger_media.ultissimplerecipes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(UltisSimpleRecipes.MODID)
public class UltisSimpleRecipes {
    public static final String MODID = "ultissimplerecipes";

    public UltisSimpleRecipes() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
