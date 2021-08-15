package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Photo's type.
 */
public enum ImageType implements EnumParam {
    @SerializedName("s")
    S("s"),

    @SerializedName("m")
    M("m"),

    @SerializedName("x")
    X("x"),

    @SerializedName("l")
    L("l"),

    @SerializedName("o")
    O("o"),

    @SerializedName("p")
    P("p"),

    @SerializedName("q")
    Q("q"),

    @SerializedName("r")
    R("r"),

    @SerializedName("y")
    Y("y"),

    @SerializedName("z")
    Z("z"),

    @SerializedName("w")
    W("w");

    private final String value;

    ImageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}