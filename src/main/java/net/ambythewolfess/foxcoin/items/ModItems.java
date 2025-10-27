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
            DeferredRegister.create(ForgeRegistries.ITEMS, FoxCoin.MOD_ID);

    public static final RegistryObject<Item> COPPERCOIN = ITEMS.register("coppercoin",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDCOIN = ITEMS.register("goldcoin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);}
}
