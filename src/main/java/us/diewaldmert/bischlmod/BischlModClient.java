package us.diewaldmert.bischlmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import us.diewaldmert.bischlmod.entity.ModEntities;
import us.diewaldmert.bischlmod.entity.client.ModModelLayers;
import us.diewaldmert.bischlmod.entity.client.BischlModel;
import us.diewaldmert.bischlmod.entity.client.BischlRenderer;

public class BischlModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.BISCHL, BischlRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BISCHL, BischlModel::getTexturedModelData);

    }
}
