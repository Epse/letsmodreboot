package me.epse.letsmodreboot.block;

import me.epse.letsmodreboot.LetsModReboot;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class MarkerBlock extends Block {
    private static final String NAME = "BlockMarkerBlock";

    public MarkerBlock() {
        super(Material.ROCK);
        this.setRegistryName(new ResourceLocation(LetsModReboot.MOD_ID + NAME));
        this.setUnlocalizedName(NAME);
        this.setCreativeTab(CreativeTabs.DECORATIONS);
        this.setHardness(1.0F);
        this.setResistance(2000.0F);
        this.setLightLevel(0.4F);
        this.setHarvestLevel("pickaxe", 0);
        this.setHarvestLevel("axe", 0);
        this.setHarvestLevel("shovel", 0);
    }

    public static String getName() {
        return NAME;
    }
}
