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

    public static final DeferredItem<Item> ASHES_SWORD = ITEMS.register("ashes_sword",
            () -> new SwordItem(ModToolTiers.ASHES, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ASHES, 2, 3))));
    public static final DeferredItem<Item> ASHES_PICKAXE = ITEMS.register("ashes_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ASHES, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ASHES, 1, 2))));
    public static final DeferredItem<Item> ASHES_SHOVEL = ITEMS.register("ashes_shovel",
            () -> new ShovelItem(ModToolTiers.ASHES, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ASHES, 2, 3))));
    public static final DeferredItem<Item> ASHES_AXE = ITEMS.register("ashes_axe",
            () -> new AxeItem(ModToolTiers.ASHES, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ASHES, 2, 3))));
    public static final DeferredItem<Item> ASHES_HOE = ITEMS.register("ashes_hoe",
            () -> new HoeItem(ModToolTiers.ASHES, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ASHES, 2, 3))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}