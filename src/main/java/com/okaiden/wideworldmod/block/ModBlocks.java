package com.okaiden.wideworldmod.block;

import com.okaiden.wideworldmod.WideWorldMod;
import com.okaiden.wideworldmod.block.custom.ModFlammableShojiBlock;
import com.okaiden.wideworldmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WideWorldMod.MOD_ID);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> OAK_LOG_FENCE = registerBlock("oak_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OAK_WOOD_FENCE = registerBlock("oak_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_FENCE = registerBlock("stripped_oak_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_OAK_WOOD_FENCE = registerBlock("stripped_oak_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_LOG_FENCE = registerBlock("spruce_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_FENCE = registerBlock("stripped_spruce_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_FENCE = registerBlock("stripped_spruce_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_LOG_FENCE = registerBlock("birch_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_FENCE = registerBlock("stripped_birch_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_FENCE = registerBlock("stripped_birch_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_LOG_FENCE = registerBlock("jungle_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_FENCE = registerBlock("stripped_jungle_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_FENCE = registerBlock("stripped_jungle_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_LOG_FENCE = registerBlock("acacia_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_FENCE = registerBlock("stripped_acacia_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_FENCE = registerBlock("stripped_acacia_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_LOG_FENCE = registerBlock("dark_oak_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_FENCE = registerBlock("stripped_dark_oak_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_FENCE = registerBlock("stripped_dark_oak_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MANGROVE_LOG_FENCE = registerBlock("mangrove_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_FENCE = registerBlock("stripped_mangrove_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_WOOD_FENCE = registerBlock("stripped_mangrove_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_LOG_FENCE = registerBlock("cherry_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_FENCE = registerBlock("stripped_cherry_log_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_FENCE = registerBlock("stripped_cherry_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CRIMSON_STEM_FENCE = registerBlock("crimson_stem_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CRIMSON_HYPHAE_FENCE = registerBlock("crimson_hyphae_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_FENCE = registerBlock("stripped_crimson_stem_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_FENCE = registerBlock("stripped_crimson_hyphae_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WARPED_STEM_FENCE = registerBlock("warped_stem_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WARPED_HYPHAE_FENCE = registerBlock("warped_hyphae_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_WARPED_STEM_FENCE = registerBlock("stripped_warped_stem_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_LOG.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_FENCE = registerBlock("stripped_warped_hyphae_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.STRIPPED_OAK_WOOD.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> OAK_SHOJI_BLOCK = registerBlock("oak_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> SPRUCE_SHOJI_BLOCK = registerBlock("spruce_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> BIRCH_SHOJI_BLOCK = registerBlock("birch_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> JUNGLE_SHOJI_BLOCK = registerBlock("jungle_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> ACACIA_SHOJI_BLOCK = registerBlock("acacia_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> DARK_OAK_SHOJI_BLOCK = registerBlock("dark_oak_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> MANGROVE_SHOJI_BLOCK = registerBlock("mangrove_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> CHERRY_SHOJI_BLOCK = registerBlock("cherry_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> CRIMSON_SHOJI_BLOCK = registerBlock("crimson_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> WARPED_SHOJI_BLOCK = registerBlock("warped_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> BAMBOO_SHOJI_BLOCK = registerBlock("bamboo_shoji_block", () ->
            new ModFlammableShojiBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD).isSuffocating(ModBlocks::never)));
    public static final RegistryObject<Block> OAK_SHOJI_PANE = registerBlock("oak_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> SPRUCE_SHOJI_PANE = registerBlock("spruce_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> BIRCH_SHOJI_PANE = registerBlock("birch_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> JUNGLE_SHOJI_PANE = registerBlock("jungle_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> ACACIA_SHOJI_PANE = registerBlock("acacia_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> DARK_OAK_SHOJI_PANE = registerBlock("dark_oak_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> MANGROVE_SHOJI_PANE = registerBlock("mangrove_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> CHERRY_SHOJI_PANE = registerBlock("cherry_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> CRIMSON_SHOJI_PANE = registerBlock("crimson_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> WARPED_SHOJI_PANE = registerBlock("warped_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> BAMBOO_SHOJI_PANE = registerBlock("bamboo_shoji_pane", () ->
            new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> SOUL_JACK_O_LANTERN = registerBlock("soul_jack_o_lantern", () ->
            new CarvedPumpkinBlock(BlockBehaviour.Properties.of(Material.VEGETABLE, MaterialColor.COLOR_ORANGE).strength(1.0F).sound(SoundType.WOOD).lightLevel(value -> 15)));

    private static boolean always(BlockState pState, BlockGetter pGetter, BlockPos pPos) {
        return true;
    }

    private static boolean never(BlockState pState, BlockGetter pGetter, BlockPos pPos) {
        return false;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
