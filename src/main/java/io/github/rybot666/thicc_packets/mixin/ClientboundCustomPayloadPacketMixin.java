package io.github.rybot666.thicc_packets.mixin;

import io.github.rybot666.thicc_packets.ThiccPackets;
import net.minecraft.network.protocol.game.ClientboundCustomPayloadPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ClientboundCustomPayloadPacket.class)
public class ClientboundCustomPayloadPacketMixin {
    @ModifyConstant(
            method = "<init>(Lnet/minecraft/network/FriendlyByteBuf;)V",
            constant = @Constant(intValue = 1048576)
    )
    private int thiccpackets_modifySizeLimitOne(int original) {
        return ThiccPackets.PACKET_SIZE_CAP;
    }

    @ModifyConstant(
            method = "<init>(Lnet/minecraft/resources/ResourceLocation;Lnet/minecraft/network/FriendlyByteBuf;)V",
            constant = @Constant(intValue = 1048576)
    )
    private int thiccpackets_modifySizeLimitTwo(int original) {
        return ThiccPackets.PACKET_SIZE_CAP;
    }


}
