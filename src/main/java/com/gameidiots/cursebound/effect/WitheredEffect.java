package com.gameidiots.cursebound.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;

public class WitheredEffect extends StatusEffect {
    private static final DamageSource WITHER_DAMAGE_SOURCE = new DamageSource("wither") {
        @Override
        public boolean isInstant() {
            return false;
        }

        @Override
        public boolean isBypassingArmor() {
            return true;
        }
    };

    public WitheredEffect() {
        super(StatusEffectCategory.HARMFUL, 0x7F7F7F); // Color in RGB
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.getWorld().isClient) return false;

        // Check if the entity is a player
        if (entity instanceof PlayerEntity player) {
            // Apply damage to the entity, with the damage source set as the player
            entity.damage(WITHER_DAMAGE_SOURCE, 1.0F); // Adjust damage as needed
        }

        return true;
    }
}
