package me.epse.letsmodreboot.item;

import me.epse.letsmodreboot.LetsModReboot;
import net.minecraft.util.ResourceLocation;

public class PocketCalculator extends ItemLMRB {
    private final String NAME = "ItemPocketCalculator";

    public PocketCalculator() {
        super();
        this.setUnlocalizedName(NAME);
        this.setRegistryName(new ResourceLocation(LetsModReboot.MOD_ID, NAME));
    }

    public String getNAME() {
        return NAME;
    }
}
