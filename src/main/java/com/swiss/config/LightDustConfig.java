package com.lightdust.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class LightDustConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.IntValue AMBIENT_RADIUS;
    public static final ForgeConfigSpec.IntValue AMBIENT_HARD_CAP; // New Config
    public static final ForgeConfigSpec.IntValue AMBIENT_BLOCK_CAP;
    public static final ForgeConfigSpec.DoubleValue AMBIENT_DUST_OPACITY;
    public static final ForgeConfigSpec.IntValue BREAK_PARTICLE_COUNT;
    public static final ForgeConfigSpec.DoubleValue BREAK_PARTICLE_SPEED;

    static {
        BUILDER.push("Light Dust Settings");

        AMBIENT_RADIUS = BUILDER.comment("Spawn Radius: How far away from the player (in blocks) dust will attempt to spawn.",
                                       "Keep this lower than Hard Cap.")
            .defineInRange("ambientRadius", 10, 1, 32);

        AMBIENT_HARD_CAP = BUILDER.comment("Hard Cap Radius: The absolute max distance dust can exist.",
                                         "Particles further than this are deleted instantly.",
                                         "MUST be larger than ambientRadius (recommended +2 or +3 blocks).")
            .defineInRange("ambientHardCapRadius", 12, 1, 48);

        AMBIENT_BLOCK_CAP = BUILDER.comment("Max dust particles allowed per single block.")
            .defineInRange("ambientBlockCap", 14, 1, 20);

        AMBIENT_DUST_OPACITY = BUILDER.comment("Base opacity for ambient dust (0.22 for vanilla, 0.45+ for shaders)")
            .defineInRange("ambientDustOpacity", 0.22, 0.0, 1.0);

        BREAK_PARTICLE_COUNT = BUILDER.comment("Number of dust particles spawned when a block is broken")
            .defineInRange("breakParticleCount", 12, 0, 50);

        BREAK_PARTICLE_SPEED = BUILDER.comment("How fast the dust shoots out from a broken block")
            .defineInRange("breakParticleSpeed", 0.1, 0.0, 1.0);

        BUILDER.pop();
        
        SPEC = BUILDER.build();
    }
}