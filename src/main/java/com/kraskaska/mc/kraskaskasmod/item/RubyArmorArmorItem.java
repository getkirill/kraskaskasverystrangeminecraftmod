
package com.kraskaska.mc.kraskaskasmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import com.kraskaska.mc.kraskaskasmod.KraskaskasModModElements;

@KraskaskasModModElements.ModElement.Tag
public class RubyArmorArmorItem extends KraskaskasModModElements.ModElement {
	@ObjectHolder("kraskaskas_mod:ruby_armor_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("kraskaskas_mod:ruby_armor_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("kraskaskas_mod:ruby_armor_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("kraskaskas_mod:ruby_armor_armor_boots")
	public static final Item boots = null;
	public RubyArmorArmorItem(KraskaskasModModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 150;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{20, 60, 50, 20}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 90;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "ruby_armor_armor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "kraskaskas_mod:textures/models/armor/rubyarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("ruby_armor_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "kraskaskas_mod:textures/models/armor/rubyarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("ruby_armor_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "kraskaskas_mod:textures/models/armor/rubyarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("ruby_armor_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "kraskaskas_mod:textures/models/armor/rubyarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("ruby_armor_armor_boots"));
	}
}
