package aj.mod.statics;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialsList {
	
	public static final Item.ToolMaterial loveToolMaterial = EnumHelper.addToolMaterial("loveToolMaterial", 6, 2000, 8.5F, 4F, 16);
	public static final Item.ToolMaterial cyanToolMaterial = EnumHelper.addToolMaterial("cyanToolMaterial", 4, 3800, 6.0F, 5F, 16);
	public static final ItemArmor.ArmorMaterial loveArmorMaterial = EnumHelper.addArmorMaterial("loveArmorMaterial", 3000, new int[]{3,8,6,4}, 30);

}
