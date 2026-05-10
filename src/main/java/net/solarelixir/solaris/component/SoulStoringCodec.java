package net.solarelixir.solaris.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public final class SoulStoringCodec {
    private final int currentSoulsStored;
    private final boolean canStoreSouls;
    private final int maxSouls;

    public SoulStoringCodec(boolean canStoreSouls, int currentSoulsStored, int maxSouls) {
        this.canStoreSouls = canStoreSouls;
        this.currentSoulsStored = currentSoulsStored;
        this.maxSouls = 10000;
    }

    public boolean canStoreSouls() {
        return canStoreSouls;
    }
    public int getCurrentSoulsStored() {
        return currentSoulsStored;
    }

    public int getMaxSouls() {
        return maxSouls;
    }
    //-------------------------//

    public SoulStoringCodec addKill() {
        if (!canStoreSouls) return this;
        if (currentSoulsStored >= maxSouls) return this;
        return new SoulStoringCodec(canStoreSouls, currentSoulsStored + 1, maxSouls);
    }

    public static final Codec<SoulStoringCodec> SOUL_STORING_CODEC =
            RecordCodecBuilder.create(instance -> instance.group(
                    Codec.BOOL.fieldOf("can_store_souls").forGetter(SoulStoringCodec:: canStoreSouls),
                    Codec.INT.fieldOf("current_souls_stored").forGetter(SoulStoringCodec::getCurrentSoulsStored),
                    Codec.INT.fieldOf("max_souls").forGetter(SoulStoringCodec::getMaxSouls)
        ).apply(instance, SoulStoringCodec::new));
}

