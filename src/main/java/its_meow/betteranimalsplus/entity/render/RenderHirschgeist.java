package its_meow.betteranimalsplus.entity.render;

import javax.annotation.Nonnull;

import its_meow.betteranimalsplus.entity.miniboss.hirschgeist.EntityHirschgeist;
import its_meow.betteranimalsplus.entity.model.ModelHirschgeist;
import its_meow.betteranimalsplus.entity.model.ModelHirschgeistMain;
import its_meow.betteranimalsplus.registry.TextureRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderHirschgeist extends RenderLiving<EntityHirschgeist> {
	
	//LayerHirschgeistGhost layerRenderer;

	public RenderHirschgeist(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelHirschgeistMain(true), 1F);
		this.addLayer(new LayerHirschgeistGhost(this));
		//layerRenderer = new LayerHirschgeistGhost(this);
	}


	/**
	 * Allows the render to do state modifications necessary before the model is rendered.
	 */
	protected void preRenderCallback(EntityHirschgeist entitylivingbaseIn, float partialTickTime)
	{
		if(!entitylivingbaseIn.isDaytime()) {
			float scale = 2F;
			GlStateManager.scale(scale, scale, scale);
		}
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}


	public static final Factory FACTORY = new Factory();

	@Override
	public void doRender(EntityHirschgeist entity, double x, double y, double z, float f, float partialTicks) {	
		super.doRender(entity, x, y, z, f, partialTicks);
	}



	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityHirschgeist entity) {
		return TextureRegistry.hirschgeist;
	}

	public static class Factory implements IRenderFactory<EntityHirschgeist> {

		@Override
		public Render<? super EntityHirschgeist> createRenderFor(RenderManager manager) {
			return new RenderHirschgeist(manager);
		}

	}
}
