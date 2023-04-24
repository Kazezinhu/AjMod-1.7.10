package aj.mod.proxy;

import aj.mod.entity.aj.*;
import aj.mod.entity.kaze.*;
import aj.mod.render.*;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerPreInit() {

        RenderingRegistry.registerEntityRenderingHandler(AjMob.class, new RenderAjMob(new ModelBiped(), 0));
        RenderingRegistry.registerEntityRenderingHandler(KazeMob.class, new RenderKazeMob(new ModelBiped(), 0));
    }

}
