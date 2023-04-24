package aj.mod.render;

import aj.mod.entity.aj.AjEntity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderAjMob extends RendererLivingEntity{

    private static final ResourceLocation ajTextures = new ResourceLocation("aj:textures/entity/aj.png");
    private static final String __OBFID = "CL_00001020";

    public RenderAjMob(ModelBase parlModelBase, float parl2)
    {
        super(parlModelBase, parl2);
    }

    protected ResourceLocation getEntityTexture(AjEntity parlEntityAj)
    {
        return ajTextures;
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity parlEntity)
    {
        return ajTextures;
    }
}