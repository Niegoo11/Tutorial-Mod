package us.diewaldmert.bischlmod.block;

import us.diewaldmert.bischlmod.BischlMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import us.diewaldmert.bischlmod.sound.ModSounds;

public class ModBlocks {

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BischlMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BischlMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        BischlMod.LOGGER.info("Registering Mod Blocks for " + BischlMod.MOD_ID);
    }
}
