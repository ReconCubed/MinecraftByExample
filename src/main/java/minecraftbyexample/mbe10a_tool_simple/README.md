# MBE10_TOOL_SIMPLE

This section demonstrates how to create a simple tool by extending and modifying a pickaxe.  In general this is the easiest way to create a new tool, i.e. to subclass an existing tool that is similar to what you want.  For example if you wanted to add a mace you might subclass it from ItemSword. 

## Key concepts for tools
* Blocks have an associated hardness which affects the mining speed.  Typical hardness is 0.5 for dirt up to 2000 for obsidian.  Some blocks are invulnerable (unbreakable) such as command block or BlockBarrier.  The block hardness is usually set when constructing the block, using .setHardness() or .setUnbreakable().
* Items can be tagged with one or more ToolClasses such as “axe”, “pickaxe”, “shovel”.  Vanilla items have at most one ToolClass, but custom items subclassed from ItemTool can have multiple ToolClasses.  You can set item ToolClasses using Item.setHarvestLevel(ToolClass).
* Each Block is particularly susceptible to one of the ToolClasses (eg wood is susceptible to “axe”, dirt susceptible to “shovel”).  When mined using an ItemTool which has a ToolClass that matches the Block, the digging speed is multiplied by the “EfficiencyOnProperMaterial” of the tool.  For example, chopping wood with an iron axe has a 6.0x factor speedup compared with using a pickaxe.  The ToolClass of the Block is set using Block.setHarvestLevel(ToolClass).  The EfficiencyOnProperMaterial is determined by specifying the Item.ToolMaterial in the ItemTool constructor.
* Each Block also has differing resistance to tools depending on what the tool is made of (the ToolMaterial), i.e.  wood, stone, gold, iron, or diamond.  This resistance of the Block is called its harvest level, which ranges from 0 for wood to 3 for diamond. If the harvest level of the tool is less than the harvest level of the block, it mines much more slowly and also doesn’t harvest any items when the block finally breaks.  The harvest level of the Item is set using Item.setHarvestLevel(ToolClass, level), and likewise the harvest level of the Block is set using Block.setHarvestLevel(ToolClass, level).  Different IBlockState can be assigned different harvest levels if desired.
* In addition to ToolClass, ItemTools also have a set of blocks that they are “effective” on (i.e. can mine very quickly).  These “EFFECTIVE_ON“ blocks are specified in the ItemTool constructor as a Set.
* When broken, a block is "harvested" if the appropriate tool is used.  Harvesting spawns a random number of items specific to the block type.  If a tool with a "silk harvest" enchantment is used, it will change the type of items dropped - for example a stone block will yield a stone block items instead of cobblestone item.
  
The pieces you need to understand are located in:

* `Startup`
* `ToolSimple`
* `resources\assets\minecraftbyexample\lang\en_US.lang` -- for the displayed name of the item
* `resources\assets\minecraftbyexample\models\item\mbe10a_tool_simple` -- for the model used to render the item
* `resources\assets\minecraftbyexample\textures\items\mbe10a_tool_simple_icon.png` -- texture used for the item.

The tool will appear in the misc tab in the creative inventory.

For further background information see:
[http://greyminecraftcoder.blogspot.com/015/01/mining-blocks-with-tools.html](http://greyminecraftcoder.blogspot.com/015/01/mining-blocks-with-tools.html)
