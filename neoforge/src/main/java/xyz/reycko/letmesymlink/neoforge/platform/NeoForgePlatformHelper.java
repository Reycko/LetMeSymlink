package xyz.reycko.letmesymlink.neoforge.platform;

import xyz.reycko.letmesymlink.platform.services.IPlatformHelper;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        FMLLoader loader = FMLLoader.getCurrentOrNull();
        if ( loader != null )
            return !loader.isProduction();

        return false;
    }
}
