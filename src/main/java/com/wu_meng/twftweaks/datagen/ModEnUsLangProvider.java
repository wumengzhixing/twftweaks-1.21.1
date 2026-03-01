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
        add(ModItems.HUNTER_KNIFE.get(), "Hunter Knife");
        add(ModItems.FROZEN_TILAPIA.get(), "Frozen Tilapia");
        add(ModItems.DIAMOND_HUNTER_KNIFE.get(), "Diamond Hunter Knife");
        add(ModItems.ASHES_AXE.get(), "Ashes Axe");
        add(ModItems.ASHES_SHOVEL.get(), "Ashes Shovel");
        add(ModItems.ASHES_HOE.get(), "Ashes Hoe");
        add(ModItems.ASHES_PICKAXE.get(), "Ashes Pickaxe");
        add(ModItems.ASHES_SWORD.get(), "Ashes Sword");
        add(ModItems.SOUL_ASHES_SWORD.get(), "Soul Ashes Sword");
        add(ModItems.EXO_SWORD.get(), "Exo Sword");
        add(ModItems.FLESH_SWORD.get(), "Flesh Sword");
        add(ModItems.FLESH_PICKAXE.get(), "Flesh Pickaxe");
        add(ModItems.FLESH_AXE.get(), "Flesh Axe");
        add(ModItems.ASHES_INGOT.get(), "ASNES Ingot");

        add(ModBlocks.CASH_REGISTER_OPENED.get(), "Cash Register Opened");
        add(ModBlocks.BEACON_RECEIVER_MODULE.get(), "Beacon Receiver Module");

        add("itemGroup.twftweaks_tab", "TWFTweaks Tab");
    }
}