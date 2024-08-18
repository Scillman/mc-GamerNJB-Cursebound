package com.gameidiots.cursebound.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {
    
    @Shadow
    public abstract void addStatusEffect(StatusEffectInstance effect);

    @Shadow
    public abstract void removeStatusEffect(StatusEffect effect);
}
