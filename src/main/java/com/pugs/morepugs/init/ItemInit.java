package com.pugs.morepugs.init;

import com.pugs.morepugs.MorePugsMod;
import com.pugs.morepugs.common.items.PugSpawnEgg;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MorePugsMod.MOD_ID);

	public static final RegistryObject<Item> PUG_SPAWN_EGG = ITEMS.register("pug_spawn_egg",
			() -> new PugSpawnEgg(new Item.Properties().group(PugzGroup.pugzregister),
					() -> EntityInit.PUG.get()));
	
    // a new creative tab
    public static class PugzGroup extends ItemGroup {
        public static final PugzGroup pugzregister = new PugzGroup(ItemGroup.GROUPS.length, "pugzmod");
        private PugzGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(PUG_SPAWN_EGG.get());
        }
    }
			
}
