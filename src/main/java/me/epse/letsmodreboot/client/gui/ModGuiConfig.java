package me.epse.letsmodreboot.client.gui;

import me.epse.letsmodreboot.LetsModReboot;
import me.epse.letsmodreboot.handler.ConfigHandler;
import me.epse.letsmodreboot.utility.MarkupString;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig (GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                LetsModReboot.MOD_ID,
                false,
                false,
                MarkupString.colour(MarkupString.bold("Play with mods, your way."), MarkupString.Colour.DARK_BLUE));
        titleLine2 = GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString());
    }

    @Override
    public void initGui()
    {
        // You can add buttons and initialize fields here
        super.initGui();
    }


    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        // You can do things like create animations, draw additional elements, etc. here
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        // You can process any additional buttons you may have added here
        super.actionPerformed(button);
    }
}
