package xyz.reycko.letmesymlink.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import xyz.reycko.letmesymlink.CommonClass;
import xyz.reycko.letmesymlink.Constants;

@Mod(Constants.MOD_ID)
public class LetMeSymlink {

    public LetMeSymlink(IEventBus eventBus) {


        var neoforgeMod = ModList.get().getMods()
                                        .stream().filter(m -> m.getModId().equals( "neoforge" ) )
                                        .findFirst();
        if ( neoforgeMod.isPresent() ) {
            Constants.LOG.info( "Running on NeoForge: {}", neoforgeMod.get().getVersion().toString() );
        }

        CommonClass.init();
    }
}
