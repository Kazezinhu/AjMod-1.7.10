package aj.mod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import aj.mod.entity.kaze.KazeEntity;

public class RenderKazeMob extends RendererLivingEntity{

    private static final ResourceLocation kazeTextures = new ResourceLocation("aj:textures/entity/kaze.png");
    private static final String __OBFID = "CL_00001020";

    public RenderKazeMob(ModelBase parlModelBase, float parl2)
    {
        super(parlModelBase, parl2);
    }

    protected ResourceLocation getEntityTexture(KazeEntity parlEntityKaze)
    {
        return kazeTextures;
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity parlEntity)
    {
        return kazeTextures;
    }
}
