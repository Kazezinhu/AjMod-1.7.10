package aj.mod.preinit.init;

import net.minecraft.block.material.Material;
import aj.mod.AjMod;
import aj.mod.statics.BlocksList;
import aj.mod.block.BlockLove;
import aj.mod.block.CyanBlock;
import aj.mod.block.CyanOre;
import aj.mod.block.LoveOre;

public class BlockInit {
	
	public static void InitBlock(){
	//Love
	BlocksList.blockLove = new BlockLove(Material.rock).setBlockName("BlockLove").setBlockTextureName("aj:blocklove").setCreativeTab(AjMod.tabAjMod);
	BlocksList.loveOre = new LoveOre(Material.iron).setBlockName("LoveOre").setBlockTextureName("aj:loveore").setCreativeTab(AjMod.tabAjMod);
	//Cyan
	BlocksList.cyanOre = new CyanOre(Material.iron).setBlockName("CyanOre").setBlockTextureName("aj:cyanore").setCreativeTab(AjMod.tabAjMod);
	BlocksList.cyanBlock = new CyanBlock(Material.iron).setBlockName("CyanBlock").setBlockTextureName("aj:cyanblock").setCreativeTab(AjMod.tabAjMod);
	}

}
