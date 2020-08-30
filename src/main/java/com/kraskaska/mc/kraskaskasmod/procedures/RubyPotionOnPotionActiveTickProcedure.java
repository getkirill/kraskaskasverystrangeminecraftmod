package com.kraskaska.mc.kraskaskasmod.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.kraskaska.mc.kraskaskasmod.KraskaskasModModElements;

@KraskaskasModModElements.ModElement.Tag
public class RubyPotionOnPotionActiveTickProcedure extends KraskaskasModModElements.ModElement {
	public RubyPotionOnPotionActiveTickProcedure(KraskaskasModModElements instance) {
		super(instance, 19);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RubyPotionOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).giveExperiencePoints((int) 1);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats()
					.setFoodLevel((int) (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) + 1));
	}
}
