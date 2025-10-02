package net.ambythewolfess.foxcoin.items;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoxCoin.MOD_ID)

    public static final RegistryObject<Item> COPPERCOIN = ITEMS.register("copper coin",
            ()-> new Item(new Item.Properties()));

    public static void resister(IEventBus eventBus){
        ITEMS.register(IEventBus);
    }
}
