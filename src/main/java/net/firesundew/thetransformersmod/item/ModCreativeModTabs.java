package net.firesundew.thetransformersmod.item;


import net.firesundew.thetransformersmod.TransformerMod;
import net.firesundew.thetransformersmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TransformerMod.MODID);

    public static final RegistryObject<CreativeModeTab> TRANSFORMERS_TAB = CREATIVE_MODE_TABS.register("transformers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TRANSFORMIUM_FRAGMENT.get()))
                    .title(Component.translatable("creativetab.transformers_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //transformium related items in creative tab
                        pOutput.accept(ModItems.TRANSFORMIUM_ALLOY.get());
                        pOutput.accept(ModItems.TRANSFORMIUM_ALLOY_NUGGET.get());
                        pOutput.accept((ModItems.TRANSFORMIUM_FRAGMENT.get()));
                        pOutput.accept((ModItems.TRANSFORMIUM_ALLOY_ROD.get()));
                        pOutput.accept((ModItems.RAW_TRANSFORMIUM.get()));

                        //flux related items for tab
                        pOutput.accept((ModItems.CRUDE_FLUX_ALLOY.get()));
                        pOutput.accept((ModItems.REFINED_FLUX_ALLOY.get()));
                        pOutput.accept((ModItems.CRUDE_ALLOY_WIRE.get()));
                        pOutput.accept((ModItems.REFINED_ALLOY_WIRE.get()));

                        //energon related items for tab
                        pOutput.accept((ModItems.RAW_ENERGON.get()));
                        pOutput.accept((ModItems.ENERGON_DUST.get()));
                        pOutput.accept((ModItems.ENERGON_ALLOY.get()));
                        pOutput.accept((ModItems.ENERGON_ALLOY_NUGGET.get()));

                        //circuits for tab
                        pOutput.accept((ModItems.BASIC_CIRCUIT.get()));
                        pOutput.accept((ModItems.IMPROVED_CIRCUIT.get()));
                        pOutput.accept((ModItems.ADVANCED_CIRCUIT.get()));

                        //base items in tab
                        pOutput.accept((ModItems.PROTOFORM_HEAD.get()));
                        pOutput.accept((ModItems.OPTIC_SENSOR.get()));
                        pOutput.accept((ModItems.WHEEL.get()));
                        pOutput.accept((ModItems.TANK_BARREL.get()));
                        pOutput.accept((ModItems.TANK_TURRET_BASE.get()));
                        pOutput.accept((ModItems.TANK_TURRET.get()));
                        pOutput.accept((ModItems.TANK_TRACK.get()));
                        pOutput.accept((ModItems.STANDARD_ENGINE.get()));
                        pOutput.accept((ModItems.JET_TURBINE.get()));
                        pOutput.accept((ModItems.JET_THRUSTER.get()));

                        //vurp items in tab
                        pOutput.accept((ModItems.VURP_TORSO_BASE.get()));
                        pOutput.accept((ModItems.VURPS_FACEMASK.get()));
                        pOutput.accept((ModItems.VURPS_GAUNTLET.get()));
                        pOutput.accept((ModItems.VURPS_GREAVE.get()));
                        pOutput.accept((ModItems.VURPS_SHOULDER_PAD.get()));

                        //purge items in tab
                        pOutput.accept((ModItems.PURGE_TORSO_BASE.get()));
                        pOutput.accept((ModItems.PURGES_GAUNTLET.get()));
                        pOutput.accept((ModItems.PURGES_GREAVE.get()));
                        pOutput.accept((ModItems.PURGES_PAULDRON.get()));

                        //subwoofer items in tab
                        pOutput.accept((ModItems.SUBWOOFER_TORSO_BASE.get()));
                        pOutput.accept((ModItems.SUBWOOFERS_GAUNTLET.get()));
                        pOutput.accept((ModItems.SUBWOOFERS_GREAVE.get()));
                        pOutput.accept((ModItems.SUBWOOFERS_SHOULDER_PAD.get()));
                        pOutput.accept((ModItems.SUBWOOFERS_VISOR.get()));

                        //skystrike items in tab
                        pOutput.accept((ModItems.SKYSTRIKE_TORSO_BASE.get()));
                        pOutput.accept((ModItems.SKYSTRIKES_GAUNTLET.get()));
                        pOutput.accept((ModItems.SKYSTRIKES_GREAVE.get()));
                        pOutput.accept((ModItems.SKYSTRIKES_SHOULDER_PAD.get()));
                        pOutput.accept((ModItems.SKYSTRIKES_WING.get()));

                        //cloudtrap items in tab
                        pOutput.accept((ModItems.CLOUDTRAP_TORSO_BASE.get()));
                        pOutput.accept((ModItems.CLOUDTRAPS_GAUNTLET.get()));
                        pOutput.accept((ModItems.CLOUDTRAPS_GREAVE.get()));
                        pOutput.accept((ModItems.CLOUDTRAPS_PAULDRON.get()));
                        pOutput.accept((ModItems.CLOUDTRAPS_VISOR.get()));
                        pOutput.accept((ModItems.CLOUDTRAPS_WING.get()));

                        //start of block output in creative tab
                        //transformium related blocks
                        pOutput.accept(ModBlocks.BLOCK_OF_TRANSFORMIUM.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_RAW_TRANSFORMIUM.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_TRANSFORMIUM_ALLOY.get());

                        pOutput.accept(ModBlocks.BLOCK_OF_ENERGON.get());
                        pOutput.accept(ModBlocks.RAW_ENERGON_BLOCK.get());

                        pOutput.accept(ModBlocks.BLOCK_OF_CRUDE_FLUX_ALLOY.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_REFINED_FLUX_ALLOY.get());

                        pOutput.accept(ModBlocks.TRANSFORMIUM_ORE.get());
                        pOutput.accept(ModBlocks.ENERGON_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TRANSFORMIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ENERGON_ORE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
