package xyz.reycko.letmesymlink;

import net.minecraft.network.chat.Component;
import xyz.reycko.letmesymlink.platform.Services;

public class CommonClass {
    public static void init() {
        Constants.LOG.debug("Reached common entrypoint in {}", Services.PLATFORM.getPlatformName());
    }
}
