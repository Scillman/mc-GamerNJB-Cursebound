package com.gameidiots.cursebound;

import com.gameidiots.cursebound.effect.WitheredEffect;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;

public class CurseCommands {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("applycurse")
            .then(CommandManager.argument("curseName", StringArgumentType.string())
                .executes(context -> {
                    String curseName = StringArgumentType.getString(context, "curseName");
                    ServerPlayerEntity player = context.getSource().getPlayer();
                    
                    if (curseName.equals("withered")) {
                        CurseManager.applyCurse(player, Cursebound.WITHERED);
                    }
                    
                    return 1;
                })
            )
        );
    }
}
