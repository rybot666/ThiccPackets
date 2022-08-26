package io.github.rybot666.thicc_packets.mixin;

import io.github.rybot666.thicc_packets.ThiccPackets;
import net.minecraft.network.FriendlyByteBuf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FriendlyByteBuf.class)
public class FriendlyByteBufMixin {
    @ModifyConstant(
            method = "readNbt()Lnet/minecraft/nbt/CompoundTag;",
            constant = @Constant(longValue = 2097152L)
    )
    private long thiccpackets_modifyNbtLimit(long original) {
        return ThiccPackets.PACKET_SIZE_CAP;
    }
}
