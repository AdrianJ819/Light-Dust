# Light Dust

Light Dust is a lightweight, client-side mod that adds floating dust to illuminated areas. Light Dust is built with interactive physics and high-performance optimization in mind.

## Features

*   **Atmospheric Lighting:** Dust particles naturally spawn in areas with a light level of 6 or higher.
*   **Physics Interactions:** Dust reacts to player movement, combat, and items. Swinging a sword or raising a shield pushes particles away.
*   **Dust Movement:** Particles have smooth fade-in/out animations, turbulence, and settling physics to look 'natural'.
*   **Configurable:** You can configure most of the things in this mod, expect more config options to come.

## Configuration

All values are adjustable in `config/lightdust-client.toml`.

### General Settings

*   `ambientRadius` (Default: `10`): How far away from the player (in blocks) dust will attempt to spawn. Keep this lower than the Hard Cap.
*   `ambientHardCapRadius` (Default: `13`): The absolute maximum distance dust can exist. Particles further than this are deleted instantly to prevent buildup.
*   `ambientBlockCap` (Default: `14`): The maximum density of dust allowed in a single block.
*   `ambientDustOpacity` (Default: `0.22`): Base opacity for ambient dust. (Recommended: `0.22` for Vanilla, `0.45+` if using Shaders).

### Block Break Settings

*   `breakParticleCount` (Default: `12`): Number of extra dust particles spawned when a block is broken.
*   `breakParticleSpeed` (Default: `0.1`): How fast the dust shoots out from a broken block.

## Q&A

**Q: Does this work with true dark mods?**

**A:** Yes. It should work with them. However, you may need to change the opacity of the dust.

**Q: Does this work with Shaders?**

**A:** Yes. However, shaders often change how transparency renders. If the dust looks too invisible, increase `ambientDustOpacity` in the config (try `0.45` or higher).

**Q: Will this cause lag in big modpacks?**

**A:** It is designed specifically to not cause lag. In the case that it does, the configs have some options to make it less intense.

**Q: Can I change the color of the dust?**

**A:** Currently, the dust color is calculated dynamically based on the light level of the block it spawns in (brighter light = brighter dust). Manual color overrides are not currently supported but may be added in the future.

**Q: How do I disable the Block Break particles?**

**A:** Set `breakParticleCount` to `0` in the config.
