package com.gameidiots.cursebound;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;

public class CurseManager {
    public static void applyCurse(PlayerEntity player, StatusEffect effect) {
        StatusEffectInstance curseEffect = new StatusEffectInstance(effect, Integer.MAX_VALUE); // Use maximum duration
        player.addStatusEffect(curseEffect);
    }
}
