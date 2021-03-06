package its_meow.betteranimalsplus.entity.render;

import javax.annotation.Nonnull;

import its_meow.betteranimalsplus.entity.EntityBear;
import its_meow.betteranimalsplus.entity.EntityBearNeutral;
import its_meow.betteranimalsplus.entity.EntityBearNeutralKermode;
import its_meow.betteranimalsplus.entity.model.ModelBear;
import its_meow.betteranimalsplus.registry.TextureRegistry;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderKermodeBear extends RenderLiving<EntityBearNeutralKermode> {


	public RenderKermodeBear(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelBear(), 1F);
	}



	public static final Factory FACTORY = new Factory();




	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityBearNeutralKermode entity) {
		return TextureRegistry.bear_kermode;
	}
	
	public static class Factory implements IRenderFactory<EntityBearNeutralKermode> {
		
		@Override
		public Render<? super EntityBearNeutralKermode> createRenderFor(RenderManager manager) {
			return new RenderKermodeBear(manager);
		}
		
	}

}
