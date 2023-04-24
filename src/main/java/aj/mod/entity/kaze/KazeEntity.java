package aj.mod.entity.kaze;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import aj.mod.AjMod;
import cpw.mods.fml.common.registry.EntityRegistry;

public class KazeEntity {

    public static void mainRegistry(){
        registerEntity();
    }

    public static void registerEntity(){
        createEntity(KazeMob.class, "kaze", 0x00fffc, 0x58ff31);
    }

    public static void createEntity(Class ec, String nm, int soC, int spC){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(ec, nm, randomId);
        EntityRegistry.registerModEntity(ec, nm, randomId, AjMod.modInstance, 32, 1, true);
        EntityRegistry.addSpawn(KazeMob.class, 3, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest);
        createEgg(randomId, soC, spC);
    }

    private static void createEgg(int randomId, int soC, int spC){

        EntityList.entityEggs.put(randomId, new EntityList.EntityEggInfo(randomId, soC, spC));
    }



}
