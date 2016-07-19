package me.epse.letsmodreboot.proxy;

import me.epse.letsmodreboot.block.MarkerBlock;
import me.epse.letsmodreboot.init.ModBlocks;
import me.epse.letsmodreboot.init.ModItems;
import me.epse.letsmodreboot.item.CoordinateBook;
import me.epse.letsmodreboot.item.PocketCalculator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;

import static me.epse.letsmodreboot.LetsModReboot.MOD_ID;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderInformation() {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(ModItems.pocketCalculator, 0,
                new ModelResourceLocation(MOD_ID + ":" + ((PocketCalculator) ModItems.pocketCalculator).getNAME(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.coordinateBook, 0,
                new ModelResourceLocation(MOD_ID + ":" + ((CoordinateBook) ModItems.coordinateBook).getNAME(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.markerBlock),0, new ModelResourceLocation(ModBlocks.markerBlock.getRegistryName(), "normal"));
    }
}
