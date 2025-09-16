package net.firesundew.thetransformersmod.item;

import net.firesundew.thetransformersmod.TransformerMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //made registry for items in the mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TransformerMod.MODID);

    //ore and material related items

    //tranformium
    public static final RegistryObject<Item> TRANSFORMIUM_FRAGMENT = ITEMS.register("transformium_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRANSFORMIUM_ALLOY = ITEMS.register("transformium_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRANSFORMIUM_ALLOY_ROD = ITEMS.register("transformium_alloy_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRANSFORMIUM_ALLOY_NUGGET = ITEMS.register("transformium_alloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TRANSFORMIUM = ITEMS.register("raw_transformium",
            () -> new Item(new Item.Properties()));

    //Flux
    public static final RegistryObject<Item> CRUDE_FLUX_ALLOY = ITEMS.register("crude_flux_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUDE_ALLOY_WIRE = ITEMS.register("crude_alloy_wire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_FLUX_ALLOY = ITEMS.register("refined_flux_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_ALLOY_WIRE = ITEMS.register("refined_alloy_wire",
            () -> new Item(new Item.Properties()));

    //energon
    public static final RegistryObject<Item> ENERGON_ALLOY = ITEMS.register("energon_alloy",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> ENERGON_ALLOY_NUGGET = ITEMS.register("energon_alloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ENERGON = ITEMS.register( "raw_energon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENERGON_DUST = ITEMS.register("energon_dust",
            () -> new Item(new Item.Properties()));

    //circuit boards
    public static final RegistryObject<Item> BASIC_CIRCUIT = ITEMS.register("basic_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPROVED_CIRCUIT = ITEMS.register("improved_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADVANCED_CIRCUIT = ITEMS.register("advanced_circuit",
            () -> new Item(new Item.Properties()));

    //base model related items
    public static final RegistryObject<Item> PROTOFORM_HEAD = ITEMS.register("protoform_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPTIC_SENSOR = ITEMS.register("optic_sensor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHEEL = ITEMS.register("wheel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANK_BARREL = ITEMS.register("tank_barrel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANK_TURRET = ITEMS.register("tank_turret",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANK_TURRET_BASE = ITEMS.register("tank_turret_base",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANK_TRACK = ITEMS.register("tank_track",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STANDARD_ENGINE = ITEMS.register("standard_engine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JET_THRUSTER = ITEMS.register("jet_thruster",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JET_TURBINE = ITEMS.register("jet_turbine",
            () -> new Item(new Item.Properties()));

    //Vurp related items
    public static final RegistryObject<Item> VURP_TORSO_BASE = ITEMS.register("vurp_torso_base",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VURPS_FACEMASK = ITEMS.register("vurps_facemask",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VURPS_GAUNTLET = ITEMS.register("vurps_gauntlet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VURPS_GREAVE = ITEMS.register("vurps_greave",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VURPS_SHOULDER_PAD = ITEMS.register("vurps_shoulder_pad",
            () -> new Item(new Item.Properties()));

    //Purge related items
    public static final RegistryObject<Item> PURGE_TORSO_BASE = ITEMS.register("purge_torso_base",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURGES_GAUNTLET = ITEMS.register("purges_gauntlet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURGES_GREAVE = ITEMS.register("purges_greave",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURGES_PAULDRON = ITEMS.register("purges_pauldron",
            () -> new Item(new Item.Properties()));


    //Subwoofer related items
    public static final RegistryObject<Item> SUBWOOFER_TORSO_BASE = ITEMS.register("subwoofer_torso_base",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUBWOOFERS_GAUNTLET = ITEMS.register("subwoofers_gauntlet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUBWOOFERS_GREAVE = ITEMS.register("subwoofers_greave",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUBWOOFERS_SHOULDER_PAD = ITEMS.register("subwoofers_shoudler_pad",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUBWOOFERS_VISOR = ITEMS.register("subwoofers_visor",
            () -> new Item(new Item.Properties()));

    //SkyStrike related items
    public static final RegistryObject<Item> SKYSTRIKE_TORSO_BASE = ITEMS.register("skystrike_torso_base",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYSTRIKES_GAUNTLET = ITEMS.register("skystrikes_gauntlet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYSTRIKES_GREAVE = ITEMS.register("skystrikes_greave",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYSTRIKES_SHOULDER_PAD = ITEMS.register("skystrikes_shoulder_pad",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYSTRIKES_WING = ITEMS.register("skystrikes_wing",
            () -> new Item(new Item.Properties()));

    //cloudtrap related items
    public static final RegistryObject<Item> CLOUDTRAP_TORSO_BASE = ITEMS.register("cloudtrap_torso_base",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOUDTRAPS_GAUNTLET = ITEMS.register("cloudtraps_gauntlet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOUDTRAPS_GREAVE = ITEMS.register("cloudtraps_greave",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOUDTRAPS_PAULDRON = ITEMS.register("cloudtraps_pauldron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOUDTRAPS_VISOR = ITEMS.register("cloudtraps_visor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOUDTRAPS_WING = ITEMS.register("cloudtraps_wing",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
