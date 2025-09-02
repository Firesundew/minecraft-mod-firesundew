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

    //tranformium related items
    public static final RegistryObject<Item> TRANSFORMIUM_FRAGMENT = ITEMS.register("transformium_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRANSFORMIUM_ALLOY = ITEMS.register("transformium_alloy",
            () -> new Item(new Item.Properties()));

    //base model related items

    //Vurp related items

    //Purge related items


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
