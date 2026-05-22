package net.solarelixir.solaris.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum TreelingVariant {
    DEFAULT(0),
    STRIPPED(1)
    ;

    private static final TreelingVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(TreelingVariant::getId)).toArray(TreelingVariant[]::new);
    private final int id;

    TreelingVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static TreelingVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
