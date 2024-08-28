package com.devdyna.gadgestry.common;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

import com.devdyna.gadgestry.Gadgestry;
import com.devdyna.gadgestry.common.register.entities.npc.BaseVillager;
import com.devdyna.gadgestry.common.register.item.BasicItem;

@Mod.EventBusSubscriber(modid = Gadgestry.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        // if(event.getType() == VillagerProfession.FARMER) {
        //     Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

        //     // Level 1
        //     trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
        //             new ItemStack(Items.EMERALD, 2),
        //             new ItemStack(BasicItem.AQUAMARINE.get(), 12),
        //             10, 8, 0.02f));

        //     // Level 2
        //     trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
        //             new ItemStack(Items.EMERALD, 5),
        //             new ItemStack(BasicItem.AQUAMARINE.get(), 6),
        //             5, 9, 0.035f));

        //     // Level 3
        //     trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
        //             new ItemStack(Items.GOLD_INGOT, 8),
        //             new ItemStack(BasicItem.AQUAMARINE.get(), 2),
        //             2, 12, 0.075f));
        // }

        // if(event.getType() == VillagerProfession.LIBRARIAN) {
        //     Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        //     ItemStack enchantedBook = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.THORNS, 2));

        //     // Level 1
        //     trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
        //             new ItemStack(Items.EMERALD, 32),
        //             enchantedBook,
        //             2, 8, 0.02f));
        // }

        if(event.getType() == BaseVillager.ARCHEOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(BasicItem.AQUAMARINE.get(), 1),
                    16, 8, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    new ItemStack(BasicItem.AQUAMARINE.get(), 2),
                    5, 12, 0.02f));
        }
    }

//     @SubscribeEvent
//     public static void addCustomWanderingTrades(WandererTradesEvent event) {
//         List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
//         List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

//         genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
//                 new ItemStack(Items.EMERALD, 12),
//                 new ItemStack(ModItems.SAPPHIRE_BOOTS.get(), 1),
//                 3, 2, 0.2f));

//         rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
//                 new ItemStack(Items.EMERALD, 24),
//                 new ItemStack(ModItems.METAL_DETECTOR.get(), 1),
//                 2, 12, 0.15f));
//     }
}