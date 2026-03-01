package com.wu_meng.twftweaks.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public enum ModToolTiers implements Tier {


    HUNTER_KNIFE(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 65, 12.0f, 1.0f, 15,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/iron")))),
    FROZEN_TILAPIA(BlockTags.INCORRECT_FOR_IRON_TOOL, 1024, 18.0f, 1.0f, 15,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "raw_fishes/tropical_fish")))),
    DIAMOND_HUNTER_KNIFE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 570, 14.0f, 3.0f, 10,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/diamond")))),
    ASHES_AXE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 7.0f, 7.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/diabolium_ingot")))),
    ASHES_SHOVEL(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 6.0f, 7.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/diabolium_ingot")))),
    ASHES_HOE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 7.0f, 3.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/diabolium_ingot")))),
    ASHES_PICKAXE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 6.0f, 8.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/diabolium_ingot")))),
    ASHES_SWORD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 6.0f, 20.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/diabolium_ingot")))),
    SOUL_ASHES_SWORD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4500, 8.0f, 32.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/descent_splinter")))),
    EXO_SWORD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 12000, 10.0f, 54.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/exo_ingot")))),
    FLESH_SWORD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 8000, 10.0f, 42.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/flesh_ingot")))),
    FLESH_PICKAXE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6000, 7.0f, 7.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/flesh_ingot")))),
    FLESH_AXE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 7000, 7.0f, 7.0f, 30,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/flesh_ingot"))));


    // 以下原有代码不变
    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModToolTiers(TagKey<Block> incorrectBlocksForDrops, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() { return this.uses; }

    @Override
    public float getSpeed() { return this.speed; }

    @Override
    public float getAttackDamageBonus() { return this.damage; }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() { return this.incorrectBlocksForDrops; }

    @Override
    public int getEnchantmentValue() { return this.enchantmentValue; }

    @Override
    public Ingredient getRepairIngredient() { return this.repairIngredient.get(); }
}