package io.github.rybot666.thicc_packets.mixin;

import io.github.rybot666.thicc_packets.ThiccPackets;
import net.minecraft.network.CompressionDecoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CompressionDecoder.class)
public class CompressionDecoderMixin {
    @ModifyConstant(
            method = "decode",
            constant = @Constant(intValue = 8388608)
    )
    private int thiccpackets_modifyDecodeLimit(int original) {
        return ThiccPackets.PACKET_SIZE_CAP;
    }
}
