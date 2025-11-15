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
    public static final RegistryObject<Item> SILVERCOIN = ITEMS.register("silvercoin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUMCOIN = ITEMS.register("platinumcoin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITECOIN = ITEMS.register("netheritecoin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COIN_PURSE = ITEMS.register("coin_purse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);}
}
