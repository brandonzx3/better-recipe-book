package me.brandonzx3.brb;

import org.lwjgl.glfw.GLFW;

import me.brandonzx3.brb.gui.Screen;
import me.brandonzx3.brb.gui.Gui;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;

public class Brb implements ClientModInitializer {

    private static KeyBinding openGui = KeyBindingHelper.registerKeyBinding(new KeyBinding("Open Gui", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Y, "Better Recipe Book"));

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(this::OnClientTick);
    }
    
    private void OnClientTick(MinecraftClient client) {
        PlayerEntity player = client.player;

        if(player == null) return;

        if(openGui.wasPressed()) {
            client.openScreen(new Screen(new Gui()));
        }
    }
}
