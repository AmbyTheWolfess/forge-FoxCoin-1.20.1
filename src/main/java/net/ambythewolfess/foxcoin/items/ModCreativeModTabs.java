package net.ambythewolfess.foxcoin.items;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Display;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoxCoin.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FOXCOIN_TAB = CREATIVE_MODE_TABS.register("foxcoin_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITECOIN.get()))
                    .title(Component.translatable("creativetab.foxcoin_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COPPERCOIN.get());
                        output.accept(ModItems.SILVERCOIN.get());
                        output.accept(ModItems.ROSEGOLDCOIN.get());
                        output.accept(ModItems.GOLDCOIN.get());
                        output.accept(ModItems.PLATINUMCOIN.get());
                        output.accept(ModItems.NETHERITECOIN.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.RAW_ROSEGOLD.get());
                        output.accept(ModItems.RAW_PLATINUM.get());
                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.PLATINUM_INGOT.get());
                        output.accept(ModItems.ROSEGOLD_INGOT.get());

                        output.accept(ModBlocks.SILVER_BLOCK.get());
                        output.accept(ModBlocks.PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.ROSEGOLD_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        output.accept(ModBlocks.RAW_ROSEGOLD_BLOCK.get());
                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.PLATINUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                    } ))

                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
