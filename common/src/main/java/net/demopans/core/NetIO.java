package net.demopans.core;

import dev.architectury.event.CompoundEventResult;
import dev.architectury.event.EventResult;
import dev.architectury.event.events.client.ClientChatEvent;

import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.server.IntegratedServer;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

public class NetIO {
    /**
     * stored
     * public class Message{
     *         public Message(FriendlyByteBuf buf){
     *
     *         }
     *
     *         public Message(){
     *
     *         }
     *
     *         public void encode(FriendlyByteBuf buf){
     *
     *         }
     *
     *         public void apply(Supplier<NetworkManager.PacketContext> contextSupplier){
     *
     *         }
     *     }
     */

    public static boolean lock;
    public static String address;

    public static CompoundEventResult<Component> inputEnv(ChatType.Bound bound, Component serverTxt){
        // check and fetch server
        if (Minecraft.getInstance().isSingleplayer()) return CompoundEventResult.pass();

        ClientPacketListener a = Minecraft.getInstance().getConnection();
        ServerData b = Minecraft.getInstance().getCurrentServer();
        return CompoundEventResult.pass(); // continue on
    }


    private static EventResult outputEnv(String s, Component component) {

        return EventResult.pass();
    }

    /**
     * main func, try to run async
     */
    public static void register(){
        ClientChatEvent.RECEIVED.register(NetIO::inputEnv);
        ClientChatEvent.SEND.register(NetIO::outputEnv);
    }

}
