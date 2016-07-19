package me.epse.letsmodreboot.init;

import me.epse.letsmodreboot.block.MarkerBlock;
import me.epse.letsmodreboot.item.ItemBlockLMRB;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static MarkerBlock markerBlock;
    public static ItemBlockLMRB markerItemBlock;

    public static void init() {
        markerBlock = GameRegistry.register(new MarkerBlock());
        markerItemBlock = GameRegistry.register(new ItemBlockLMRB(markerBlock));
    }
}
