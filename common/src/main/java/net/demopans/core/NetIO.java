package net.demopans.core;

import dev.architectury.event.Event;
import dev.architectury.networking.NetworkManager;
import dev.architectury.event.events.client.ClientChatEvent;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.EntityEvent;

import java.util.function.Supplier;

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

    public static void determine(String serverTxt){

    }
}
