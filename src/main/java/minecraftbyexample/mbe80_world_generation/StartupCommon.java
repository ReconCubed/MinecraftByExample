package minecraftbyexample.mbe80_world_generation;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 *  See MinecraftByExample class for more information
 */
public class StartupCommon
{

  public static void preInitCommon()
  {
    // 0 runs first; higher numbers run later
    GameRegistry.registerWorldGenerator(new OreSpawner(), 0);
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
