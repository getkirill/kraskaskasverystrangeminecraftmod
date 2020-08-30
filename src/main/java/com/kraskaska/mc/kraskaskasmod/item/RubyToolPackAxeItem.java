
package com.kraskaska.mc.kraskaskasmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.kraskaska.mc.kraskaskasmod.KraskaskasModModElements;

@KraskaskasModModElements.ModElement.Tag
public class RubyToolPackAxeItem extends KraskaskasModModElements.ModElement {
	@ObjectHolder("kraskaskas_mod:ruby_tool_pack_axe")
	public static final Item block = null;
	public RubyToolPackAxeItem(KraskaskasModModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
		}.setRegistryName("ruby_tool_pack_axe"));
	}
}
