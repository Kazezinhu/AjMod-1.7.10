package aj.mod.init;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import aj.mod.statics.*;

public class Smelts {
	
	public static void InitSmelts(){
		
		GameRegistry.addSmelting(BlocksList.loveOre, new ItemStack(ItemsList.itemLove), 2F);
	}

}
