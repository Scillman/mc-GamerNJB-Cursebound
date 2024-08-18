package com.gameidiots.cursebound;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;

public class CurseComponent {
    private CurseType curseType;

    public CurseType getCurseType() {
        return curseType;
    }

    public void setCurseType(CurseType curseType) {
        this.curseType = curseType;
    }

    // Save and load from NBT
    public void readNbt(NbtCompound nbt) {
        if (nbt.contains("CurseType")) {
            this.curseType = CurseType.valueOf(nbt.getString("CurseType"));
        }
    }

    public void writeNbt(NbtCompound nbt) {
        if (curseType != null) {
            nbt.putString("CurseType", curseType.name());
        }
    }
}
