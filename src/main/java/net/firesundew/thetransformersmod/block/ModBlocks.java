package net.firesundew.thetransformersmod.block;

import net.firesundew.thetransformersmod.TransformerMod;
import net.firesundew.thetransformersmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TransformerMod.MODID);

    //block register

    //Transformium related
    public static final RegistryObject<Block> BLOCK_OF_TRANSFORMIUM = registerBlock("block_of_transformium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> BLOCK_OF_TRANSFORMIUM_ALLOY = registerBlock("block_of_transformium_alloy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> TRANSFORMIUM_ORE = registerBlock("transformium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    //energon blocks
    public static final RegistryObject<Block> BLOCK_OF_ENERGON = registerBlock("block_of_energon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> RAW_ENERGON_BLOCK = registerBlock("raw_energon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)));

    //flux blocks
    public static final RegistryObject<Block> BLOCK_OF_CRUDE_FLUX_ALLOY = registerBlock("block_of_crude_flux_alloy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_OF_REFINED_FLUX_ALLOY = registerBlock("block_of_refined_flux_alloy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)));



    //helper method
    private static  <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //helper method
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //eventbus register
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
