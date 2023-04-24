package aj.mod.block;

import java.util.Random;

import aj.mod.statics.BlocksList;
import aj.mod.statics.ItemsList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class CyanOre extends Block{

    public CyanOre(Material material) {
        super(material);

        this.setHardness(4.5F);
        this.setHarvestLevel("pickaxe", 2);


    }
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_){
        return this == BlocksList.cyanOre ? ItemsList.cyanItem : Item.getItemFromBlock(this);
    }

    private final Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, this.rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == BlocksList.cyanOre)
            {
                j1 = MathHelper.getRandomIntegerInRange(this.rand, 0, 1);
            }

            return j1;
        }
        return 0;
    }
}
