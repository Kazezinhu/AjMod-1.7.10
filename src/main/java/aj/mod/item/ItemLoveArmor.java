package aj.mod.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemLoveArmor extends ItemArmor {

	public ItemLoveArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		
		if(this.armorType == 2){
			return "aj:textures/models/armor/love_layer_2.png";
		}
		
		return "aj:textures/models/armor/love_layer_1.png";
	}
}
