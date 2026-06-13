package net.solarelixir.solaris.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum MushlingVariant {
    RED(0),
    BROWN(1),
    RED_SCARED(2),
    BROWN_SCARED(3)
    ;

    private static final MushlingVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(MushlingVariant::getId)).toArray(MushlingVariant[]::new);
    private final int id;

    MushlingVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static MushlingVariant byId(int id) {
        if (id < 0 || id >= BY_ID.length) return RED;
        return BY_ID[id];
    }
}
