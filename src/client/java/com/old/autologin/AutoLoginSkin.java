package com.old.autologin;

import com.old.autologin.gui.GuiOption;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public interface AutoLoginSkin {
	public GuiButton createButton(int id, int x, int y, int width, int height, String displayText);

	public default GuiButton createButton(int id, int x, int y, String displayText) {
		return createButton(id, x, y, 200, 20, displayText);
	}

	public void drawBackground(GuiOption<?> screenOption);

	public void drawWindow(GuiOption<?> screenOption, int x, int y, int width, int height, String title);

	public String getDisplayName();;
}
