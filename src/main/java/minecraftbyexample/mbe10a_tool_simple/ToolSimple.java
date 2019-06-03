package minecraftbyexample.mbe10a_tool_simple;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.creativetab.CreativeTabs;

public class ToolSimple extends ItemPickaxe 
{
  public ToolSimple(ToolMaterial material) {
    super(material);
    this.setCreativeTab(CreativeTabs.MISC);
  }
  
}
