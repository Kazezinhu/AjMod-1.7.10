package aj.mod.entity.kaze;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import aj.mod.statics.ItemsList;

public class KazeMob extends EntityAgeable{

	public KazeMob(World parlWorld) {
		super(parlWorld);
		this.setSize(0.7F, 1.8F);
		this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(0, new EntityAIAvoidEntity(this, EntityCreeper.class, 8.0F, 0.6D, 0.6D));
		this.tasks.addTask(0, new EntityAIMoveIndoors(this));
		this.tasks.addTask(9, new EntityAIWander(this, 0.6D));
		this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAITempt(this, 1.1D, Items.cookie, false));
		
	}
	public boolean isAIEnabled(){
		return true;
	}

	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.00);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(SharedMonsterAttributes.knockbackResistance.getDefaultValue());
	}
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		// TODO Auto-generated method stub
		return new KazeMob(worldObj);
	}
	
	protected void entityInit(){
        super.entityInit();
        this.dataWatcher.addObject(22, Integer.valueOf(0));
    }
	
	protected boolean canDespawn(){
        return false;
    }
	
	protected String getHurtSound(){
        return "game.player.hurt";
    }
	
	protected String getDeathSound(){
        return "game.player.die";
    }
	
	public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return p_70877_1_ != null && p_70877_1_.getItem() == Items.cookie;
    }
	
	protected Item getDropItem()
    {
        return ItemsList.itemLove;
    }
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = 1;

        for (int k = 0; k < j; ++k)
        {
                this.dropItem(ItemsList.itemLove, 1);
        }
    }
}
