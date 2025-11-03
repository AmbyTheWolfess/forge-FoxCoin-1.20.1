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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLDCOIN.get()))
                    .title(Component.translatable("creativetab.foxcoin_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COPPERCOIN.get());
                        output.accept(ModItems.GOLDCOIN.get());
                        output.accept(ModItems.SILVERCOIN.get());
                        output.accept(ModItems.PLATINUMCOIN.get());
                        output.accept(ModItems.NETHERITECOIN.get());

                        output.accept(ModBlocks.SILVER_BLOCK.get());
                    } ))

                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
