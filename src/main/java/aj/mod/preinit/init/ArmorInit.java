package aj.mod.preinit.init;

import aj.mod.AjMod;
import aj.mod.item.ItemLoveArmor;
import aj.mod.statics.ArmorList;
import aj.mod.statics.MaterialsList;

public class ArmorInit {
	
	public static void InitArmor(){
	
		ArmorList.loveHelmet = new ItemLoveArmor(MaterialsList.loveArmorMaterial, 0, 0).setUnlocalizedName("HelmetLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:lovehelmet");
		ArmorList.loveChestplate = new ItemLoveArmor(MaterialsList.loveArmorMaterial, 0, 1).setUnlocalizedName("ChestplateLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:lovechestplate");
		ArmorList.loveLeggings = new ItemLoveArmor(MaterialsList.loveArmorMaterial, 0, 2).setUnlocalizedName("LeggingsLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:loveleggings");
		ArmorList.loveBoots = new ItemLoveArmor(MaterialsList.loveArmorMaterial, 0, 3).setUnlocalizedName("BootsLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:loveboots");
	}

}
