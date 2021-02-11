package wtf.bwdy.mudstone;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import wtf.bwdy.mudstone.mixin.ItemMaxCountAccessor;

public class MudstoneMod implements ModInitializer {
	@Override
	public void onInitialize() {
		// stack size edits

		//objective one: set Item.maxCount
		for(Item i : Registry.ITEM){
			ItemMaxCountAccessor ii = (ItemMaxCountAccessor) i;
			ii.setMaxCount(getStackSizeforStackSize(ii.getMaxCount()));
		}

		System.out.println("BWDYPACK INITIALIZED");
	}

	public static int getStackSizeforStackSize(int oldStackSize){
		if(oldStackSize >= 63 && oldStackSize < 999) return 999;
		else if(oldStackSize > 1) return 99;
		return 1;
	}
}
