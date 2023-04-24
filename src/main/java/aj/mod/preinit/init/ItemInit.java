package aj.mod.preinit.init;

import net.minecraft.item.ItemFood;
import aj.mod.AjMod;
import aj.mod.item.ItemCyan;
import aj.mod.item.ItemCyanSword;
import aj.mod.item.ItemLoveArrow;
import aj.mod.item.ItemLoveAxe;
import aj.mod.item.ItemLoveHoe;
import aj.mod.item.ItemLovePickaxe;
import aj.mod.item.ItemLoveShovel;
import aj.mod.item.ItemLoveStick;
import aj.mod.item.ItemLoveSword;
import aj.mod.item.ItemLoveVar;
import aj.mod.statics.ItemsList;
import aj.mod.statics.MaterialsList;

public class ItemInit {

    public static void InitItems(){

        ItemsList.lovePickaxe = new ItemLovePickaxe(MaterialsList.loveToolMaterial).setUnlocalizedName("PickaxeLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:lovepickaxe");
        ItemsList.loveAxe = new ItemLoveAxe(MaterialsList.loveToolMaterial).setUnlocalizedName("AxeLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:loveaxe");
        ItemsList.loveShovel = new ItemLoveShovel(MaterialsList.loveToolMaterial).setUnlocalizedName("ShovelLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:loveshovel");
        ItemsList.loveHoe = new ItemLoveHoe(MaterialsList.loveToolMaterial).setUnlocalizedName("HoeLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:lovehoe");
        ItemsList.loveVar = new ItemLoveVar().setUnlocalizedName("VarLove").setCreativeTab(AjMod.tabAjMod);
        ItemsList.loveArrow = new ItemLoveArrow().setUnlocalizedName("ArrowLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:lovearrow");
        ItemsList.loveSword = new ItemLoveSword(MaterialsList.loveToolMaterial).setUnlocalizedName("SwordLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:loveswordd");
        ItemsList.loveStick = new ItemLoveStick().setUnlocalizedName("StickLove").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:lovestick");
        ItemsList.itemLove = new ItemFood(2, 1.0F, true).setUnlocalizedName("ItemLove").setTextureName("aj:itemlove").setCreativeTab(AjMod.tabAjMod);
        // X * 0.5 =
        ItemsList.cyanSword = new ItemCyanSword(MaterialsList.cyanToolMaterial).setUnlocalizedName("CyanSword").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:cyansword");
        ItemsList.cyanItem = new ItemCyan().setUnlocalizedName("CyanItem").setCreativeTab(AjMod.tabAjMod).setTextureName("aj:cyanitem");
    }
}
