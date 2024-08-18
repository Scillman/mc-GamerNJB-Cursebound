package com.gameidiots.cursebound;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gameidiots.cursebound.registry.ModDamageTypes;
import com.gameidiots.cursebound.registry.ModStatusEffects;

import net.fabricmc.api.ModInitializer;

public class ModMain implements ModInitializer
{
    public static final String MOD_ID = "cursebound";
    public static final String MOD_NAME = "Cursebound";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onInitialize()
    {
        ModDamageTypes.register();
        ModStatusEffects.register();
    }
}
