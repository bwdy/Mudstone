package wtf.bwdy.mudstone.mixin;

import net.minecraft.inventory.SimpleInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import wtf.bwdy.mudstone.MudstoneMod;

@Mixin(SimpleInventory.class)
abstract class SimpleInventoryMixin {
    @Redirect(method = "transfer", at = @At(value = "INVOKE", target = "Lnet/minecraft/inventory/SimpleInventory;getMaxCountPerStack()I"))
    private int redirectGetMaxCountPerStack(SimpleInventory callingInventory) {
        return MudstoneMod.getStackSizeforStackSize(callingInventory.getMaxCountPerStack());
    }
}
