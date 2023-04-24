package aj.mod.init;

import aj.mod.statics.*;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

    public static void InitRecipes(){

        GameRegistry.addRecipe(new ItemStack(ItemsList.itemLove, 9), new Object[]{"B",'B', BlocksList.blockLove});
        GameRegistry.addRecipe(new ItemStack(BlocksList.blockLove), new Object[]{"LLL","LLL","LLL", 'L', ItemsList.itemLove});
        GameRegistry.addRecipe(new ItemStack(ItemsList.lovePickaxe), new Object[]{"LLL", " S ", " S ", 'L', ItemsList.itemLove, 'S', ItemsList.loveStick});
        GameRegistry.addRecipe(new ItemStack(ItemsList.loveAxe), new Object[]{" LL", " SL", " S ", 'L', ItemsList.itemLove, 'S', ItemsList.loveStick});
        GameRegistry.addRecipe(new ItemStack(ItemsList.loveShovel), new Object[]{" L ", " S ", " S ", 'L', ItemsList.itemLove, 'S', ItemsList.loveStick});
        GameRegistry.addRecipe(new ItemStack(ItemsList.loveHoe), new Object[]{" LL", " S ", " S ", 'L', ItemsList.itemLove, 'S', ItemsList.loveStick});
        GameRegistry.addRecipe(new ItemStack(ItemsList.loveVar), new Object[]{"  L", " S ", "S  ", 'L', ItemsList.itemLove, 'S', ItemsList.loveStick});
        GameRegistry.addRecipe(new ItemStack(ItemsList.loveSword), new Object[]{" L ", " L ", " S ", 'L', ItemsList.itemLove, 'S', ItemsList.loveStick});
        GameRegistry.addRecipe(new ItemStack(ItemsList.loveStick), new Object[]{"L", "S", 'L', ItemsList.itemLove, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ArmorList.loveHelmet), new Object[]{"LLL", "L L", 'L', ItemsList.itemLove});
        GameRegistry.addRecipe(new ItemStack(ArmorList.loveChestplate), new Object[]{"L L", "LLL", "LLL", 'L', ItemsList.itemLove});
        GameRegistry.addRecipe(new ItemStack(ArmorList.loveBoots), new Object[]{"L L", "L L", 'L', ItemsList.itemLove});
        GameRegistry.addRecipe(new ItemStack(ArmorList.loveLeggings), new Object[]{"LLL", "L L", "L L", 'L', ItemsList.itemLove});
        GameRegistry.addRecipe(new ItemStack(ItemsList.loveArrow, 2), new Object[]{"SL", 'L', ItemsList.itemLove, 'S', ItemsList.loveStick});
        GameRegistry.addRecipe(new ItemStack(ItemsList.cyanSword), new Object[]{" C ", " C ", " S ", 'C', ItemsList.cyanItem, 'S', ItemsList.loveStick});
        GameRegistry.addRecipe(new ItemStack(BlocksList.cyanBlock), new Object[]{"CCC", "CCC", "CCC", 'C', ItemsList.cyanItem});
        GameRegistry.addRecipe(new ItemStack(ItemsList.cyanItem, 9), new Object[]{"C", 'C', BlocksList.cyanBlock});
    }

}
