package aj.mod;

import aj.mod.entity.aj.*;
import aj.mod.entity.kaze.*;
import aj.mod.gen.*;
import aj.mod.preinit.init.*;
import aj.mod.preinit.registry.*;
import aj.mod.proxy.CommonProxy;
import aj.mod.init.*;
import aj.mod.statics.ItemsList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "aj", name = "Aj Mod", version = "0.5.2")
public class AjMod {

    private static final String modid = "aj";
    @Instance(modid)
    public static AjMod modInstance;

    @SidedProxy(modId = modid,clientSide = "aj.mod.proxy.ClientProxy", serverSide = "aj.mod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //Item/Block init and registering
        //Config handling
        ItemInit.InitItems();
        BlockInit.InitBlock();
        ArmorInit.InitArmor();

        ArmorRegister.RegisterArmor();
        BlocksRegister.RegisterBlocks();
        ItemsRegister.RegisterItems();

        AjWorld.mainRegistry();
        AjEntity.mainRegistry();
        KazeEntity.mainRegistry();

        proxy.registerPreInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        //Proxy, TIleENtity, entity, GUI and Packet Registering
        Recipes.InitRecipes();
        Smelts.InitSmelts();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

    public static CreativeTabs tabAjMod = new CreativeTabs("tabAjMod"){
        @Override
        public Item getTabIconItem(){
            return new ItemStack(ItemsList.itemLove).getItem();
        }
    };
}