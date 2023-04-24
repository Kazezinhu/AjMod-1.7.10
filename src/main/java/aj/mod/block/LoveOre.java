package aj.mod.block;

import java.util.Random;

import aj.mod.statics.BlocksList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class LoveOre extends Block {

	public LoveOre(Material material) {
		super(material);
		
		this.setHardness(4.5F);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == BlocksList.loveOre)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 1);
            }

            return j1;
        }
        return 0;
    }

}
