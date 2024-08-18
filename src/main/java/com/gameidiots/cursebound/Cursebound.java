import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;

public class Cursebound implements ModInitializer {
    public static final StatusEffect WITHERED = new WitheredEffect();

    @Override
    public void onInitialize() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("cursebound", "withered"), WITHERED);
    }
}
