package aj.mod.preinit.registry;

import aj.mod.statics.ArmorList;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArmorRegister {
	
	public static void RegisterArmor(){
		
		GameRegistry.registerItem(ArmorList.loveHelmet, ArmorList.loveHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ArmorList.loveChestplate, ArmorList.loveChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ArmorList.loveLeggings, ArmorList.loveLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ArmorList.loveBoots, ArmorList.loveBoots.getUnlocalizedName().substring(5));
	}

}
