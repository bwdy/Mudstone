package wtf.bwdy.mudstone.mixin;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Item.class)
public interface ItemMaxCountAccessor {
    @Accessor("maxCount")
    public int getMaxCount();
    @Accessor("maxCount")
    public void setMaxCount(int maxCount);
}

