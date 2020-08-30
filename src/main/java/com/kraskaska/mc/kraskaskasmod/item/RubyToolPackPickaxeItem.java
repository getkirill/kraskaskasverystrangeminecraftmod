
package com.kraskaska.mc.kraskaskasmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.kraskaska.mc.kraskaskasmod.KraskaskasModModElements;

@KraskaskasModModElements.ModElement.Tag
public class RubyToolPackPickaxeItem extends KraskaskasModModElements.ModElement {
	@ObjectHolder("kraskaskas_mod:ruby_tool_pack_pickaxe")
	public static final Item block = null;
	public RubyToolPackPickaxeItem(KraskaskasModModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ruby_tool_pack_pickaxe"));
	}
}
