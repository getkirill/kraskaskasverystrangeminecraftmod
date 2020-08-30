package com.kraskaska.mc.kraskaskasmod.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.kraskaska.mc.kraskaskasmod.KraskaskasModModElements;

@KraskaskasModModElements.ModElement.Tag
public class RubyPotionPotionExpiresProcedure extends KraskaskasModModElements.ModElement {
	public RubyPotionPotionExpiresProcedure(KraskaskasModModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RubyPotionPotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.disableDamage = (false);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.allowFlying = (false);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
	}
}
