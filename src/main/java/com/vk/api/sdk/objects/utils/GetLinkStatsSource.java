package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Source of scope
 */
public enum GetLinkStatsSource implements EnumParam {
    @SerializedName("vk_cc")
    VK_CC("vk_cc"),

    @SerializedName("vk_link")
    VK_LINK("vk_link");

    private final String value;

    GetLinkStatsSource(String value) {
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
