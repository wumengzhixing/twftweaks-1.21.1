package com.wu_meng.twftweaks.datagen;

import com.wu_meng.twftweaks.TWFTweaks;
import com.wu_meng.twftweaks.block.ModBlocks;
import com.wu_meng.twftweaks.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider {
    public ModZhCnLangProvider(PackOutput output) {
        super(output, TWFTweaks.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.HUNTER_KNIFE.get(), "猎人匕首");
        add(ModItems.FROZEN_TILAPIA.get(), "冻罗非鱼");
        add(ModItems.DIAMOND_HUNTER_KNIFE.get(), "钻石猎人匕首");
        add(ModItems.ASHES_AXE.get(), "灰烬斧");
        add(ModItems.ASHES_SHOVEL.get(), "灰烬锹");
        add(ModItems.ASHES_HOE.get(), "灰烬锄");
        add(ModItems.ASHES_PICKAXE.get(), "灰烬镐");
        add(ModItems.ASHES_SWORD.get(), "灰烬剑");
        add(ModItems.SOUL_ASHES_SWORD.get(), "魂烬剑");
        add(ModItems.EXO_SWORD.get(), "Exo剑");
        add(ModItems.FLESH_SWORD.get(), "血肉剑");
        add(ModItems.FLESH_PICKAXE.get(), "血肉镐");
        add(ModItems.FLESH_AXE.get(), "血肉斧");
        add(ModItems.ASHES_INGOT.get(), "灰烬锭");

        add(ModBlocks.CASH_REGISTER_OPENED.get(), "被搜刮的收银台");
        add(ModBlocks.BEACON_RECEIVER_MODULE.get(), "信号接收模块");

        add("itemGroup.twftweaks_tab", "冬境调整");
    }
}