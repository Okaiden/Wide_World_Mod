package com.okaiden.wideworldmod.item;

import com.okaiden.wideworldmod.WideWorldMod;
import com.okaiden.wideworldmod.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WideWorldMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab WIDEWORLDMOD_BUILDING_BLOCKS;
    public static CreativeModeTab WIDEWORLDMOD_NATURAL_BLOCKS;
    public static CreativeModeTab WIDEWORLDMOD_FUNCTIONAL_BLOCKS;
    public static CreativeModeTab WIDEWORLDMOD_EQUIPMENT_AND_UTILITIES;
    public static CreativeModeTab WIDEWORLDMOD_FOOD_AND_DRINKS;
    public static CreativeModeTab WIDEWORLDMOD_INGREDIENTS;

    @SubscribeEvent
    public static void registerCreativeModeTab(CreativeModeTabEvent.Register event) {
        WIDEWORLDMOD_BUILDING_BLOCKS = event.registerCreativeModeTab(new ResourceLocation(WideWorldMod.MOD_ID, "wideworldmod_building_blocks"),
                builder -> builder.title(Component.translatable("creativemodetab.wideworldmod_building_blocks")).icon(() -> new ItemStack(ModBlocks.COBALT_BLOCK.get())).alignedRight()
                        .displayItems((params,output,e) -> {
                            output.accept(ModBlocks.OAK_LOG_FENCE.get());
                            output.accept(ModBlocks.OAK_WOOD_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_OAK_LOG_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_OAK_WOOD_FENCE.get());
                            output.accept(ModBlocks.SPRUCE_LOG_FENCE.get());
                            output.accept(ModBlocks.SPRUCE_WOOD_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_SPRUCE_LOG_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get());
                            output.accept(ModBlocks.BIRCH_LOG_FENCE.get());
                            output.accept(ModBlocks.BIRCH_WOOD_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_BIRCH_LOG_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_BIRCH_WOOD_FENCE.get());
                            output.accept(ModBlocks.JUNGLE_LOG_FENCE.get());
                            output.accept(ModBlocks.JUNGLE_WOOD_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_JUNGLE_LOG_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get());
                            output.accept(ModBlocks.ACACIA_LOG_FENCE.get());
                            output.accept(ModBlocks.ACACIA_WOOD_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_ACACIA_LOG_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_ACACIA_WOOD_FENCE.get());
                            output.accept(ModBlocks.DARK_OAK_LOG_FENCE.get());
                            output.accept(ModBlocks.DARK_OAK_WOOD_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_DARK_OAK_LOG_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get());
                            output.accept(ModBlocks.MANGROVE_LOG_FENCE.get());
                            output.accept(ModBlocks.MANGROVE_WOOD_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_MANGROVE_LOG_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get());
                            output.accept(ModBlocks.CHERRY_LOG_FENCE.get());
                            output.accept(ModBlocks.CHERRY_WOOD_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_CHERRY_LOG_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_CHERRY_WOOD_FENCE.get());
                            output.accept(ModBlocks.CRIMSON_STEM_FENCE.get());
                            output.accept(ModBlocks.CRIMSON_HYPHAE_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_CRIMSON_STEM_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get());
                            output.accept(ModBlocks.WARPED_STEM_FENCE.get());
                            output.accept(ModBlocks.WARPED_HYPHAE_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_WARPED_STEM_FENCE.get());
                            output.accept(ModBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get());

                            output.accept(ModBlocks.OAK_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.SPRUCE_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.BIRCH_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.JUNGLE_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.ACACIA_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.DARK_OAK_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.MANGROVE_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.CHERRY_SHOJI_PANE.get());
                            output.accept(ModBlocks.CRIMSON_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.WARPED_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.BAMBOO_SHOJI_BLOCK.get());
                            output.accept(ModBlocks.OAK_SHOJI_PANE.get());
                            output.accept(ModBlocks.SPRUCE_SHOJI_PANE.get());
                            output.accept(ModBlocks.BIRCH_SHOJI_PANE.get());
                            output.accept(ModBlocks.JUNGLE_SHOJI_PANE.get());
                            output.accept(ModBlocks.ACACIA_SHOJI_PANE.get());
                            output.accept(ModBlocks.DARK_OAK_SHOJI_PANE.get());
                            output.accept(ModBlocks.MANGROVE_SHOJI_PANE.get());
                            output.accept(ModBlocks.CHERRY_SHOJI_PANE.get());
                            output.accept(ModBlocks.CRIMSON_SHOJI_PANE.get());
                            output.accept(ModBlocks.WARPED_SHOJI_PANE.get());
                            output.accept(ModBlocks.BAMBOO_SHOJI_PANE.get());

                            output.accept(ModBlocks.SILVER_BLOCK.get());
                            output.accept(ModBlocks.COBALT_BLOCK.get());
                        }));
        WIDEWORLDMOD_NATURAL_BLOCKS = event.registerCreativeModeTab(new ResourceLocation(WideWorldMod.MOD_ID, "wideworldmod_natural_blocks"),
                builder -> builder.title(Component.translatable("creativemodetab.wideworldmod_natural_blocks")).icon(() -> new ItemStack(ModBlocks.COBALT_ORE.get())).alignedRight()
                        .displayItems((params,output,e) -> {
                            output.accept(ModBlocks.SILVER_ORE.get());
                            output.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                            output.accept(ModBlocks.COBALT_ORE.get());
                            output.accept(ModBlocks.DEEPSLATE_COBALT_ORE.get());
                            output.accept(ModBlocks.SOUL_JACK_O_LANTERN.get());
                        }));
        WIDEWORLDMOD_FUNCTIONAL_BLOCKS = event.registerCreativeModeTab(new ResourceLocation(WideWorldMod.MOD_ID, "wideworldmod_functional_blocks"),
                builder -> builder.title(Component.translatable("creativemodetab.wideworldmod_functional_blocks")).icon(() -> new ItemStack(ModBlocks.OAK_SHOJI_PANE.get())).alignedRight()
                        .displayItems((params,output,e) -> {
                            //output.accept(ModBlocks.WOODCUTTER.get());
                        }));
        WIDEWORLDMOD_EQUIPMENT_AND_UTILITIES = event.registerCreativeModeTab(new ResourceLocation(WideWorldMod.MOD_ID, "wideworldmod_equipment_and_utilities"),
                builder -> builder.title(Component.translatable("creativemodetab.wideworldmod_equipment_and_utilities")).icon(() -> new ItemStack(ModItems.COBALT_AXE.get())).alignedRight()
                        .displayItems((params,output,e) -> {
                            output.accept(ModItems.SILVER_SWORD.get());
                            output.accept(ModItems.SILVER_KATANA.get());
                            output.accept(ModItems.SILVER_SHOVEL.get());
                            output.accept(ModItems.SILVER_PICKAXE.get());
                            output.accept(ModItems.SILVER_AXE.get());
                            output.accept(ModItems.SILVER_HOE.get());
                            output.accept(ModItems.COBALT_SWORD.get());
                            output.accept(ModItems.COBALT_KATANA.get());
                            output.accept(ModItems.COBALT_SHOVEL.get());
                            output.accept(ModItems.COBALT_PICKAXE.get());
                            output.accept(ModItems.COBALT_AXE.get());
                            output.accept(ModItems.COBALT_HOE.get());
                            output.accept(ModItems.SILVER_HELMET.get());
                            output.accept(ModItems.SILVER_CHESTPLATE.get());
                            output.accept(ModItems.SILVER_LEGGINGS.get());
                            output.accept(ModItems.SILVER_BOOTS.get());
                            output.accept(ModItems.COBALT_HELMET.get());
                            output.accept(ModItems.COBALT_CHESTPLATE.get());
                            output.accept(ModItems.COBALT_LEGGINGS.get());
                            output.accept(ModItems.COBALT_BOOTS.get());
                        }));
        WIDEWORLDMOD_FOOD_AND_DRINKS = event.registerCreativeModeTab(new ResourceLocation(WideWorldMod.MOD_ID, "wideworldmod_food_and_drinks"),
                builder -> builder.title(Component.translatable("creativemodetab.wideworldmod_food_and_drinks")).icon(() -> new ItemStack(ModItems.GRAPE.get())).alignedRight()
                        .displayItems((params,output,e) -> {
                            output.accept(ModItems.ORANGE.get());
                            output.accept(ModItems.PEAR.get());
                            output.accept(ModItems.BANANA.get());
                            output.accept(ModItems.KIWI.get());
                            output.accept(ModItems.GRAPE.get());
                            output.accept(ModItems.BLUEBERRY.get());
                            output.accept(ModItems.LEMON.get());
                            output.accept(ModItems.CHERRY.get());
                        }));
        WIDEWORLDMOD_INGREDIENTS = event.registerCreativeModeTab(new ResourceLocation(WideWorldMod.MOD_ID, "wideworldmod_ingredients"),
                builder -> builder.title(Component.translatable("creativemodetab.wideworldmod_ingredients")).icon(() -> new ItemStack(ModItems.COBALT_INGOT.get())).alignedRight()
                        .displayItems((params,output,e) -> {
                            output.accept(ModItems.RAW_SILVER.get());
                            output.accept(ModItems.RAW_COBALT.get());
                            output.accept(ModItems.COPPER_NUGGET.get());
                            output.accept(ModItems.SILVER_NUGGET.get());
                            output.accept(ModItems.COBALT_NUGGET.get());
                            output.accept(ModItems.SILVER_INGOT.get());
                            output.accept(ModItems.COBALT_INGOT.get());
                        }));
    }

    // Wide World Creative Mode Tabs
    public static void addCreative(CreativeModeTabEvent.BuildContents event) {
        // Minecraft Creative Mode Tabs
        if (event.getTab() == CreativeModeTabs.COLORED_BLOCKS) {
        }

        if (event.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
        }

        if (event.getTab() == CreativeModeTabs.SPAWN_EGGS) {
        }
    }
}
