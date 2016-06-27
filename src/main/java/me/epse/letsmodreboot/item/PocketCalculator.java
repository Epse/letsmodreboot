package me.epse.letsmodreboot.item;

import me.epse.letsmodreboot.LetsModReboot;
import net.minecraft.util.ResourceLocation;

public class PocketCalculator extends ItemLMRB {
    private final String name = "ItemPocketCalculator";
    public PocketCalculator() {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(new ResourceLocation(LetsModReboot.MOD_ID, name));
    }
    public String getName() {
        return name;
    }
}
