package com.github.Ringoame196

import org.bukkit.Material

class Ore {
    fun appropriate(item: Material, block: Material): Boolean {
        return when (block) {
            Material.DIAMOND_ORE -> ironPickaxe(item)
            Material.DEEPSLATE_DIAMOND_ORE -> ironPickaxe(item)
            Material.GOLD_ORE -> ironPickaxe(item)
            Material.DEEPSLATE_GOLD_ORE -> ironPickaxe(item)
            Material.REDSTONE_ORE -> ironPickaxe(item)
            Material.DEEPSLATE_REDSTONE_ORE -> ironPickaxe(item)
            Material.EMERALD_ORE -> ironPickaxe(item)
            Material.DEEPSLATE_EMERALD_ORE -> ironPickaxe(item)
            Material.IRON_ORE -> stonePickaxe(item)
            Material.DEEPSLATE_IRON_ORE -> stonePickaxe(item)
            Material.COPPER_ORE -> stonePickaxe(item)
            Material.DEEPSLATE_COPPER_ORE -> stonePickaxe(item)
            else -> true
        }
    }
    fun stonePickaxe(item: Material): Boolean {
        return when (item) {
            Material.STONE_PICKAXE -> false
            Material.GOLDEN_PICKAXE -> false
            else -> true
        }
    }
    fun ironPickaxe(item: Material): Boolean {
        return when (item) {
            Material.WOODEN_PICKAXE -> false
            else -> stonePickaxe(item)
        }
    }
}
