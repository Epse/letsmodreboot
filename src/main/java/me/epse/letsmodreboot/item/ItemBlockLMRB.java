package me.epse.letsmodreboot.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockLMRB extends ItemBlock {
    public ItemBlockLMRB(Block block) {
        super(block);
        this.setRegistryName(block.getRegistryName());
        this.maxStackSize = 64;
    }
}
