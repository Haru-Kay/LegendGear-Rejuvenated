package com.haru.hexxit_misc.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class HexxitBlockLootTables extends BlockLootSubProvider {
    public HexxitBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return null;
        //return HexxitBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
