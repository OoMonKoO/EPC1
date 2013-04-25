package epc1;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorEPC1 implements IWorldGenerator {
    /**
     * @Override public void generate(Random random, int chunkX, int chunkZ,
     *           World world, IChunkProvider chunkGenerator, IChunkProvider
     *           chunkProvider) {
     * 
     *           switch(world.provider.dimensionId){
     * 
     *           case -1: generateNether(world, random, chunkX *16, chunkZ *16);
     *           case 0: generateSurface(world, random, chunkX *16, chunkZ *16);
     *           case 1: generateEnd(world, random, chunkX *16, chunkZ *16);
     * 
     *           }
     * 
     *           }
     * 
     *           private void generateEnd(World world, Random random, int
     *           chunkX, int chunkZ) {
     * 
     * 
     *           }
     * 
     *           private void generateSurface(World world, Random random, int
     *           chunkX, int chunkZ) {
     * 
     *           for(int i = 0; i < 15; i++){ int xCoord = chunkX +
     *           random.nextInt(16); int yCoord = random.nextInt(64); int zCoord
     *           = chunkZ + random.nextInt(16);
     * 
     *           (new WorldGenMinable(new ItemStack(EPC1.oreChromit.blockID,
     *           5).itemID).generate(world, random, xCoord, yCoord, zCoord);
     * 
     * 
     * 
     *           }
     * 
     * 
     *           }
     * 
     *           private void generateNether(World world, Random random, int
     *           chunkX, int chunkZ) {
     * 
     * 
     *           }
     */
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if (!(chunkGenerator instanceof ChunkProviderHell)
                && !(chunkGenerator instanceof ChunkProviderEnd)) {

            for (int i = 0; i < 12; i++) {
                int randPosX = (chunkX * 16) + random.nextInt(16);
                int randPosY = random.nextInt(60);
                int randPosZ = (chunkZ * 16) + random.nextInt(16);
                new WorldGenMinable(EPC1.ChromitOre.blockID, 8)
                        .generate(world, random, randPosX, randPosY, randPosZ);

            }
        }
    }
}