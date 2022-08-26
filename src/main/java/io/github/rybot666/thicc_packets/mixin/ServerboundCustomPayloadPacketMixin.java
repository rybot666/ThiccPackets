package io.github.rybot666.thicc_packets.mixin;

import io.github.rybot666.thicc_packets.ThiccPackets;
import net.minecraft.network.protocol.game.ServerboundCustomPayloadPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerboundCustomPayloadPacket.class)
public class ServerboundCustomPayloadPacketMixin {
    @ModifyConstant(
            method = "<init>(Lnet/minecraft/network/FriendlyByteBuf;)V",
            constant = @Constant(intValue = 32767)
    )
    private int thiccpackets_modifySizeLimit(int original) {
        return ThiccPackets.PACKET_SIZE_CAP;
    }
}
