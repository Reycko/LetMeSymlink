package xyz.reycko.letmesymlink.mixin;

import net.minecraft.world.level.validation.DirectoryValidator;
import net.minecraft.world.level.validation.ForbiddenSymlinkInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.nio.file.Path;
import java.util.List;

@Mixin(DirectoryValidator.class)
public class MixinDirectoryValidator {

    @Inject( at = @At( "HEAD" ), method = "validateSymlink(Ljava/nio/file/Path;Ljava/util/List;)V", cancellable = true)
    public void validateSymlink(Path pDirectory, List<ForbiddenSymlinkInfo> pEntries, CallbackInfo ci ) {
        ci.cancel();
    }
}
