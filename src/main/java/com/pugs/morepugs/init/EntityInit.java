package com.pugs.morepugs.init;

import com.pugs.morepugs.MorePugsMod;
import com.pugs.morepugs.entities.FlyingPug;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, MorePugsMod.MOD_ID);
    
    public static RegistryObject<EntityType<FlyingPug>> PUG = ENTITY_TYPES.register(
            "pug", () -> EntityType.Builder.create(FlyingPug::new, EntityClassification.CREATURE)
            .size(0.3F, 0.5F).build(MorePugsMod.MOD_ID + ":pug"));
}
