package me.epse.letsmodreboot.item;

import me.epse.letsmodreboot.LetsModReboot;
import net.minecraft.util.ResourceLocation;

public class CoordinateBook extends ItemLMRB {
    private final String name = "ItemCoordinateBook";
    public CoordinateBook() {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(new ResourceLocation(LetsModReboot.MOD_ID, name));
    }
    public String getName() {
        return name;
    }
}
