package us.diewaldmert.bischlmod.item;

import us.diewaldmert.bischlmod.BischlMod;
import us.diewaldmert.bischlmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(BischlMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModItems.BE_MUSIC_DISC);
                        entries.add(ModItems.FIGURE_09_MUSIC_DISC);
                        entries.add(ModItems.COG_MUSIC_DISC);

                        entries.add(ModItems.BISCHL_SPAWN_EGG);

                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(Items.DIAMOND);
                    }).build());


    public static void registerItemGroups() {
        BischlMod.LOGGER.info("Registering Item Groups for " + BischlMod.MOD_ID);
    }
}
