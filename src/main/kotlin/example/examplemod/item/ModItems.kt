package example.examplemod.item

import example.examplemod.WineAndBEER
import net.minecraft.client.renderer.item.ItemProperties
import net.minecraft.core.Registry
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.item.Item.Properties
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.Block
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import thedarkcolour.kotlinforforge.forge.registerObject

object ModItems {
    val REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WineAndBEER.ID)
    val GRAPE by REGISTRY.registerObject("grape") {
        Item(Item.Properties().food(FoodProperties.Builder()
            .nutrition(2)
            .build()))
    }

}