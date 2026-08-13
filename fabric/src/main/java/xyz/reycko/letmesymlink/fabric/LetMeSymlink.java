package xyz.reycko.letmesymlink.fabric;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import xyz.reycko.letmesymlink.CommonClass;
import xyz.reycko.letmesymlink.Constants;

public class LetMeSymlink implements ModInitializer {

    @Override
    @Environment( EnvType.CLIENT )
    public void onInitialize() {
        /* shortest line of code in Fabric history */
        Constants.LOG.info("Running on Fabric: {}", FabricLoader.getInstance().getModContainer("fabricloader").get().getMetadata().getVersion().getFriendlyString());

        CommonClass.init();
    }
}
