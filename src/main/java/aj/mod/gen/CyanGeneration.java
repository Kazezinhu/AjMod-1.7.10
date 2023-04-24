package aj.mod.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import aj.mod.statics.BlocksList;
import cpw.mods.fml.common.IWorldGenerator;

public class CyanGeneration implements IWorldGenerator {

    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
            case -1:
                this.generateNether(world, rand, chunkX * 16, chunkZ * 16);
            case 0:
                this.generateSurface(world, rand, chunkX * 16, chunkZ * 16);
            case 1:
                this.generateEnd(world, rand, chunkX * 16, chunkZ * 16);
        }
        // TODO Auto-generated method stub

    }

    private void generateEnd(World world, Random rand, int i, int j) {
        // TODO Auto-generated method stub

    }

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        // TODO Auto-generated method stub
        for (int i = 0; i<5; i++){
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(22);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(BlocksList.cyanOre, 7)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    }

    private void generateNether(World world, Random rand, int i, int j) {
        // TODO Auto-generated method stub

    }

}
