package aj.mod.entity.aj;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import aj.mod.AjMod;
import cpw.mods.fml.common.registry.EntityRegistry;

public class AjEntity {

    public static void mainRegistry(){
        registerEntity();
    }

    public static void registerEntity(){
        createEntity(AjMob.class, "aj", 0x4dffff, 0x2318eb);
    }

    public static void createEntity(Class ec, String nm, int soC, int spC){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(ec, nm, randomId);
        EntityRegistry.registerModEntity(ec, nm, randomId, AjMod.modInstance, 32, 1, true);
        EntityRegistry.addSpawn(AjMob.class, 50, 1, 5, EnumCreatureType.creature, BiomeGenBase.plains);
        createEgg(randomId, soC, spC);
    }

    private static void createEgg(int randomId, int soC, int spC){

        EntityList.entityEggs.put(randomId, new EntityList.EntityEggInfo(randomId, soC, spC));
    }



}
