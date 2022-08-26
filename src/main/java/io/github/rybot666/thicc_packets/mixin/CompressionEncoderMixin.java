package io.github.rybot666.thicc_packets.mixin;

import io.github.rybot666.thicc_packets.ThiccPackets;
import net.minecraft.network.CompressionEncoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CompressionEncoder.class)
public class CompressionEncoderMixin {
    @ModifyConstant(
            method = "encode(Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;Lio/netty/buffer/ByteBuf;)V",
            constant = @Constant(intValue = 2097152)
    )
    private int thiccpackets_modifySizeLimit(int original) {
        return ThiccPackets.PACKET_SIZE_CAP;
    }
}
