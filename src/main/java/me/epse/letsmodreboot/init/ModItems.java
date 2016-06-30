package me.epse.letsmodreboot.init;

import me.epse.letsmodreboot.item.CoordinateBook;
import me.epse.letsmodreboot.item.ItemLMRB;
import me.epse.letsmodreboot.item.PocketCalculator;
import me.epse.letsmodreboot.utility.LogHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemLMRB pocketCalculator = new PocketCalculator();
    public static final ItemLMRB coordinateBook = new CoordinateBook();

    public static void init(){
        GameRegistry.register(pocketCalculator);
        GameRegistry.register(coordinateBook);
    }
}
