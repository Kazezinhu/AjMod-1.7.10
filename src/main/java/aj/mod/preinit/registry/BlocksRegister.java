package aj.mod.preinit.registry;

import aj.mod.statics.BlocksList;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksRegister {

	public static void RegisterBlocks(){
		//Love
		GameRegistry.registerBlock(BlocksList.blockLove, BlocksList.blockLove.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlocksList.loveOre, BlocksList.loveOre.getUnlocalizedName().substring(5));
		//Cyan
		GameRegistry.registerBlock(BlocksList.cyanOre, BlocksList.cyanOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlocksList.cyanBlock, BlocksList.cyanBlock.getUnlocalizedName().substring(5));
	}
}
