package com.wu_meng.twftweaks.item;

import com.wu_meng.twftweaks.TWFTweaks;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(TWFTweaks.MODID);

    public static final DeferredItem<Item> ASHES_INGOT =
            ITEMS.register("ashes_ingot", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HUNTER_KNIFE = ITEMS.register("hunter_knife",
            () -> new SwordItem(ModToolTiers.HUNTER_KNIFE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.HUNTER_KNIFE, 0, -2.0f))));

    public static final DeferredItem<Item> FROZEN_TILAPIA = ITEMS.register("frozen_tilapia",
            () -> new SwordItem(ModToolTiers.FROZEN_TILAPIA, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.FROZEN_TILAPIA, 0, -2.0f))));

    public static final DeferredItem<Item> DIAMOND_HUNTER_KNIFE = ITEMS.register("diamond_hunter_knife",
            () -> new SwordItem(ModToolTiers.DIAMOND_HUNTER_KNIFE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DIAMOND_HUNTER_KNIFE, 0, -2.0f))));

    public static final DeferredItem<Item> ASHES_AXE = ITEMS.register("ashes_axe",
            () -> new AxeItem(ModToolTiers.ASHES_AXE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ASHES_AXE, 0, -3.0f))));

    public static final DeferredItem<Item> ASHES_SHOVEL = ITEMS.register("ashes_shovel",
            () -> new ShovelItem(ModToolTiers.ASHES_SHOVEL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ASHES_SHOVEL, 0, -3.0f))));

    public static final DeferredItem<Item> ASHES_HOE = ITEMS.register("ashes_hoe",
            () -> new HoeItem(ModToolTiers.ASHES_HOE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ASHES_HOE, 0, 0f))));

    public static final DeferredItem<Item> ASHES_PICKAXE = ITEMS.register("ashes_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ASHES_PICKAXE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ASHES_PICKAXE, 0, -2.8f))));

    public static final DeferredItem<Item> ASHES_SWORD = ITEMS.register("ashes_sword",
            () -> new SwordItem(ModToolTiers.ASHES_SWORD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ASHES_SWORD, 0, -2.4f))));

    public static final DeferredItem<Item> SOUL_ASHES_SWORD = ITEMS.register("soul_ashes_sword",
            () -> new SwordItem(ModToolTiers.SOUL_ASHES_SWORD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SOUL_ASHES_SWORD, 0, -2.4f))));

    public static final DeferredItem<Item> EXO_SWORD = ITEMS.register("exo_sword",
            () -> new SwordItem(ModToolTiers.EXO_SWORD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.EXO_SWORD, 0, -2.4f))));

    public static final DeferredItem<Item> FLESH_SWORD = ITEMS.register("flesh_sword",
            () -> new SwordItem(ModToolTiers.FLESH_SWORD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.FLESH_SWORD, 0, -2.4f))));

    public static final DeferredItem<Item> FLESH_PICKAXE = ITEMS.register("flesh_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FLESH_PICKAXE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.FLESH_PICKAXE, 0, -2.8f))));

    public static final DeferredItem<Item> FLESH_AXE = ITEMS.register("flesh_axe",
            () -> new AxeItem(ModToolTiers.FLESH_AXE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.FLESH_AXE, 0, -3.0f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}