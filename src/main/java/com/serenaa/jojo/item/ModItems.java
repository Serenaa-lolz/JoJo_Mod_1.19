package com.serenaa.jojo.item;

import com.serenaa.jojo.JoJo;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JoJo.MOD_ID);

    public  static final RegistryObject<Item> CIRCLE = ITEMS.register("circle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JOJO_TAB)));
    public  static final RegistryObject<Item> WHITE_CIRCLE = ITEMS.register("white_circle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JOJO_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
