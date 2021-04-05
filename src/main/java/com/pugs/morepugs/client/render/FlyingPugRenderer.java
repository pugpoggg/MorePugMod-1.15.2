package com.pugs.morepugs.client.render;

import com.pugs.morepugs.MorePugsMod;
import com.pugs.morepugs.client.model.FlyingPugModel;
import com.pugs.morepugs.entities.FlyingPug;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class FlyingPugRenderer extends MobRenderer<FlyingPug, FlyingPugModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(MorePugsMod.MOD_ID, "textures/entity/pug.png");

    public FlyingPugRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new FlyingPugModel(), 0.6F);
   }

    @Override
    public ResourceLocation getEntityTexture(FlyingPug entity) {
        return TEXTURE;
    }
}
