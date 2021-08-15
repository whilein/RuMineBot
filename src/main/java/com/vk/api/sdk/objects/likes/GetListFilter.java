package com.vk.api.sdk.objects.likes;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Filters to apply: 'likes' — returns information about all users who liked the object (default), 'copies' — returns information only about users who told their friends about the object
 */
public enum GetListFilter implements EnumParam {
    @SerializedName("likes")
    LIKES("likes"),

    @SerializedName("copies")
    COPIES("copies");

    private final String value;

    GetListFilter(String value) {
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
