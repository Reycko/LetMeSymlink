package xyz.reycko.letmesymlink.forge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLLoader;
import xyz.reycko.letmesymlink.CommonClass;
import xyz.reycko.letmesymlink.Constants;

@Mod(Constants.MOD_ID)
public class LetMeSymlink {
    public LetMeSymlink() {
        Constants.LOG.info("Running on Forge: {}", FMLLoader.versionInfo().mcAndForgeVersion());

        CommonClass.init();
    }
}
