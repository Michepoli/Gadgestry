package com.devdyna.gadgestry.common.register.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import java.util.List;

import com.devdyna.gadgestry.Gadgestry;
import com.devdyna.gadgestry.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

public class TierTool {

    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    Tags.Blocks.NEEDS_AQUAMARINE_TOOL, () -> Ingredient.of(BasicItem.AQUAMARINE.get())),
            new ResourceLocation(Gadgestry.MODID, "sapphire"), List.of(Tiers.NETHERITE), List.of());
}