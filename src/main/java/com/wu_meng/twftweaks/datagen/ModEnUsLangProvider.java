package com.wu_meng.twftweaks.datagen;

import com.wu_meng.twftweaks.TWFTweaks;
import com.wu_meng.twftweaks.block.ModBlocks;
import com.wu_meng.twftweaks.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider {
    public ModEnUsLangProvider(PackOutput output) {
        super(output, TWFTweaks.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.ASHES_SWORD.get(), "ASNES Sword");
        add(ModItems.ASHES_SHOVEL.get(), "ASNES Shovel");
        add(ModItems.ASHES_AXE.get(), "ASNES Axe");
        add(ModItems.ASHES_PICKAXE.get(), "ASNES Pickaxe");
        add(ModItems.ASHES_HOE.get(), "ASNES Hoe");
        add(ModItems.ASHES_INGOT.get(), "ASNES Ingot");

        add(ModBlocks.CASH_REGISTER_OPENED.get(), "Cash Register Opened");
        add(ModBlocks.BEACON_RECEIVER_MODULE.get(), "Beacon Receiver Module");

        add("itemGroup.twftweaks_tab", "TWFTweaks Tab");
    }
}