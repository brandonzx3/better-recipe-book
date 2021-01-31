package me.brandonzx3.brb.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import net.minecraft.text.LiteralText;

public class Gui extends LightweightGuiDescription {
    public Gui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(256, 200);

        WButton button = new WButton(new LiteralText("test"));
        root.add(button, 0, 0, 2, 3);

        root.validate(this);
    }
}
