package aj.mod.preinit.registry;

import aj.mod.statics.ItemsList;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemsRegister {

    public static void RegisterItems(){

        GameRegistry.registerItem(ItemsList.itemLove, ItemsList.itemLove.getUnlocalizedName().substring(5));

        GameRegistry.registerItem(ItemsList.lovePickaxe, ItemsList.lovePickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ItemsList.loveAxe, ItemsList.loveAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ItemsList.loveShovel, ItemsList.loveShovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ItemsList.loveHoe, ItemsList.loveHoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ItemsList.loveVar, ItemsList.loveVar.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ItemsList.loveStick, ItemsList.loveStick.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ItemsList.loveSword, ItemsList.loveSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ItemsList.loveArrow, ItemsList.loveArrow.getUnlocalizedName().substring(5));

        GameRegistry.registerItem(ItemsList.cyanSword, ItemsList.cyanSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ItemsList.cyanItem, ItemsList.cyanItem.getUnlocalizedName().substring(5));
    }

}
