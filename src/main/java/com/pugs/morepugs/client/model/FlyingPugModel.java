package com.pugs.morepugs.client.model;

import com.google.common.collect.ImmutableList;
import com.pugs.morepugs.entities.FlyingPug;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class FlyingPugModel extends EntityModel<FlyingPug> {
		   private final ModelRenderer head;
			private final ModelRenderer head_r1;
			private final ModelRenderer body;
			private final ModelRenderer body_rotation;
			private final ModelRenderer body_sub_1;
			private final ModelRenderer mane;
			private final ModelRenderer mane_rotation;
			private final ModelRenderer mane_sub_1;
			private final ModelRenderer legBackLeft;
			private final ModelRenderer legBackRight;
			private final ModelRenderer legFrontLeft;
			private final ModelRenderer legFrontRight;
			private final ModelRenderer tail;

		   public FlyingPugModel() {
				textureWidth = 64;
				textureHeight = 64;

				head = new ModelRenderer(this);
				head.setRotationPoint(0.5F, 24.5F, -5.0F);
				head.setTextureOffset(0, 34).addBox(2.75F, -14.75F, -4.25F, 1.0F, 4.0F, 4.0F, 0.0F, false);
				head.setTextureOffset(33, 20).addBox(-4.75F, -14.75F, -4.25F, 1.0F, 4.0F, 4.0F, 0.0F, false);
				head.setTextureOffset(0, 7).addBox(-3.0F, -12.0F, -7.0F, 5.0F, 4.0F, 1.0F, 0.0F, false);
				head.setTextureOffset(0, 20).addBox(-4.0F, -15.0F, -6.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);

				head_r1 = new ModelRenderer(this);
				head_r1.setRotationPoint(0.9F, -8.8114F, -7.446F);
				head.addChild(head_r1);
				setRotationAngle(head_r1, 1.0908F, 0.0F, 0.0F);
				head_r1.setTextureOffset(6, 0).addBox(-1.0F, 0.25F, -1.75F, 2.0F, 0.0F, 3.0F, 0.0F, false);

				body = new ModelRenderer(this);
				body.setRotationPoint(-4F, -7F, 11F); //0.0F, 14.0F, 2.0F
				

				body_rotation = new ModelRenderer(this);
				body_rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
				body.addChild(body_rotation);
				setRotationAngle(body_rotation, 0F, 0.0F, 0.0F);//1.5708F, 0.0F, 0.0F
				

				body_sub_1 = new ModelRenderer(this);
				body_sub_1.setRotationPoint(0.0F, -3.0F, -5.0F);
				body_rotation.addChild(body_sub_1);
				setRotationAngle(body_sub_1, 1.5708F, 0.0F, 0.0F);
				body_sub_1.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -8.0F, 8.0F, 7.0F, 13.0F, 0.0F, false);

				mane = new ModelRenderer(this);
				mane.setRotationPoint(1.0F, 14.0F, 2.0F);
				

				mane_rotation = new ModelRenderer(this);
				mane_rotation.setRotationPoint(-1.0F, 2.5F, -2.5F);
				mane.addChild(mane_rotation);
				setRotationAngle(mane_rotation, 1.5708F, 0.0F, 0.0F);
				

				mane_sub_1 = new ModelRenderer(this);
				mane_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
				mane_rotation.addChild(mane_sub_1);
				mane_sub_1.setTextureOffset(21, 0).addBox(-1.0F, -5.5F, 1.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);//-1.0F, -5.5F, 1.5F, 2.0F, 6.0F, 1.0F, 0.0F, false

				legBackLeft = new ModelRenderer(this);
				legBackLeft.setRotationPoint(2.5F, 16.0F, 7.0F);
				legBackLeft.setTextureOffset(0, 0).addBox(0.25F, 4.0F, -3.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);

				legBackRight = new ModelRenderer(this);
				legBackRight.setRotationPoint(-0.5F, 16.0F, 7.0F);
				legBackRight.setTextureOffset(21, 20).addBox(-1.25F, 4.0F, -3.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);

				legFrontLeft = new ModelRenderer(this);
				legFrontLeft.setRotationPoint(2.5F, 16.0F, -4.0F);
				legFrontLeft.setTextureOffset(29, 0).addBox(0.25F, 4.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);

				legFrontRight = new ModelRenderer(this);
				legFrontRight.setRotationPoint(-0.5F, 16.0F, -4.0F);
				legFrontRight.setTextureOffset(28, 28).addBox(-1.25F, 4.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);


				tail = new ModelRenderer(this);
				tail.setRotationPoint(1.0F, 12.2F, 10.0F);
				tail.setTextureOffset(0, 20).addBox(0.0F, 0.0F, -1.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
				tail.setTextureOffset(29, 7).addBox(0.0F, -0.25F, -4.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
				tail.setTextureOffset(0, 24).addBox(-1.0165F, 0.0143F, -3.2622F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			}


		  // private void setRotationAngle(ModelRenderer body_rotation2, float f, float g, float h) {
			// TODO Auto-generated method stub
			
		//}


		protected Iterable<ModelRenderer> getHeadParts() {
		      return ImmutableList.of(this.head);
		   }

		   protected Iterable<ModelRenderer> getBodyParts() {
		      return ImmutableList.of(this.body, this.legBackRight, this.legBackLeft, this.legFrontRight, this.legFrontLeft, this.tail, this.mane);
		   }

		   public void setLivingAnimations(FlyingPug entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		      //if (entityIn.isAngry()) {
		         //this.tail.rotateAngleY = 0.0F;
		      //} else {
		         //this.tail.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		      //}

		      if (entityIn.isSitting()) {
		         this.mane.setRotationPoint(-1.0F, 16.0F, -3.0F);
		         this.mane.rotateAngleX = 1.2566371F;
		         this.mane.rotateAngleY = 0.0F;
		         this.body.setRotationPoint(0.0F, 18.0F, 0.0F);
		         this.body.rotateAngleX = ((float)Math.PI / 4F);
		         this.tail.setRotationPoint(-1.0F, 21.0F, 6.0F);
		         this.legBackRight.setRotationPoint(-2.5F, 22.7F, 2.0F);
		         this.legBackRight.rotateAngleX = ((float)Math.PI * 1.5F);
		         this.legBackLeft.setRotationPoint(0.5F, 22.7F, 2.0F);
		         this.legBackLeft.rotateAngleX = ((float)Math.PI * 1.5F);
		         this.legFrontRight.rotateAngleX = 5.811947F;
		         this.legFrontRight.setRotationPoint(-2.49F, 17.0F, -4.0F);
		         this.legFrontLeft.rotateAngleX = 5.811947F;
		         this.legFrontLeft.setRotationPoint(0.51F, 17.0F, -4.0F);
		      } else {
		         this.body.setRotationPoint(0.0F, 14.0F, 2.0F);
		         this.body.rotateAngleX = ((float)Math.PI / 2F);
		         this.mane.setRotationPoint(-1.0F, 14.0F, -3.0F);
		         this.mane.rotateAngleX = this.body.rotateAngleX;
		         this.tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
		         this.legBackRight.setRotationPoint(-2.5F, 16.0F, 7.0F);
		         this.legBackLeft.setRotationPoint(0.5F, 16.0F, 7.0F);
		         this.legFrontRight.setRotationPoint(-2.5F, 16.0F, -4.0F);
		         this.legFrontLeft.setRotationPoint(0.5F, 16.0F, -4.0F);
		         this.legBackRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		         this.legBackLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		         this.legFrontRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		         this.legFrontLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount; 
		      }

		  	//@Override
			//public void setRotationAngles(FlyingPug entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		        //this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		       //this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		       //this.body.rotateAngleX = ((float)Math.PI / 2F);
		        //this.legBackRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		        //this.legBackLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		        //this.legFrontRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		        //this.legFrontLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		     //}
			}

			@Override
			public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
				head.render(matrixStack, buffer, packedLight, packedOverlay);
				body.render(matrixStack, buffer, packedLight, packedOverlay);
				mane.render(matrixStack, buffer, packedLight, packedOverlay);
				legBackLeft.render(matrixStack, buffer, packedLight, packedOverlay);
				legBackRight.render(matrixStack, buffer, packedLight, packedOverlay);
				legFrontLeft.render(matrixStack, buffer, packedLight, packedOverlay);
				legFrontRight.render(matrixStack, buffer, packedLight, packedOverlay);
				tail.render(matrixStack, buffer, packedLight, packedOverlay);
			}

			public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
				modelRenderer.rotateAngleX = x;
				modelRenderer.rotateAngleY = y;
				modelRenderer.rotateAngleZ = z;
			}


			@Override
			public void setRotationAngles(FlyingPug entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
					float netHeadYaw, float headPitch) {
				
			}
}