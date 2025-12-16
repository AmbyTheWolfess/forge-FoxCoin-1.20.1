package net.ambythewolfess.foxcoin.datagen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FoxCoin.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.COPPERCOIN);
        simpleItem(ModItems.SILVERCOIN);
        simpleItem(ModItems.ROSEGOLDCOIN);
        simpleItem(ModItems.GOLDCOIN);
        simpleItem(ModItems.PLATINUMCOIN);
        simpleItem(ModItems.NETHERITECOIN);

        simpleItem(ModItems.RAW_ROSEGOLD);
        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.RAW_PLATINUM);

        simpleItem(ModItems.ROSEGOLD_INGOT);
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.PLATINUM_INGOT);


    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {

        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(FoxCoin.MOD_ID, "item/" + item.getId().getPath()));

    }
}
