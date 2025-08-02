package example.examplemod.block

import example.examplemod.WineAndBEER
import example.examplemod.item.ModItems
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.ForgeRegistries.BLOCKS
import net.minecraftforge.registries.RegistryObject
import thedarkcolour.kotlinforforge.forge.registerObject
import java.util.function.Supplier

object ModBlocks {
    val REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WineAndBEER.ID)
    val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WineAndBEER.ID)
    // the returned ObjectHolderDelegate can be used as a property delegate
    // this is automatically registered by the deferred registry at the correct times

    val CRUSHING_TUB by REGISTRY.registerObject("crushing_tub") {
        Block(BlockBehaviour.Properties.of().lightLevel { 15 }.strength(3.0f))
        Block(Block.byItem())
    }





}