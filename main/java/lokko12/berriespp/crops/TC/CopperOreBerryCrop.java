package lokko12.berriespp.crops.TC;
import ic2.api.crops.CropCard;
import ic2.api.crops.ICropTile;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import tconstruct.world.TinkerWorld;

public class CopperOreBerryCrop extends BasicTinkerBerryCrop {
			
		
			public CopperOreBerryCrop ()
			{
				super();
			}

			@Override
			public String name() {
				return "CopperOreBerry";
			}
		       
			@Override
			public int tier() {
		        return 5;
		    }
		    @Override
		    public ItemStack getGain(ICropTile crop) {
		    	if (crop.isBlockBelow("blockCopper") == true)
		    	{
		    		return new ItemStack(TinkerWorld.oreBerries, 6, 2);
		        }
		    	else return new ItemStack(TinkerWorld.oreBerries, 2, 2);
		    }
		    @Override
		    public int growthDuration(ICropTile crop) {
		        // Same growth stages as melons and pumpkins
		        if (crop.getSize() == 2) {
		            // Ripens "quickly"
		            return 3000;
		        } else {
		        	if (crop.getSize() == 3 && crop.isBlockBelow("blockCopper") == true)
		        	{ return 1500;
		        			}        	
		        else 
		        	{
		            // Takes a while to grow from seed
		            return 500;
		        }
		        }
		    }
		    
			@Override
			public String[] attributes() {
		        return new String[] {"Berry", "Copper", "Tendrilly", "Metal", "Shiny"};
			}

}

