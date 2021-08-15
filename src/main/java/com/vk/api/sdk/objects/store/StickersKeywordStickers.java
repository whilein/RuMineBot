package com.vk.api.sdk.objects.store;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.Image;
import com.vk.api.sdk.objects.base.StickerAnimation;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * StickersKeywordStickers object
 */
public class StickersKeywordStickers implements Validable {
    /**
     * Sticker ID
     */
    @SerializedName("sticker_id")
    private Integer stickerId;

    /**
     * Pack ID
     */
    @SerializedName("product_id")
    private Integer productId;

    @SerializedName("images")
    private List<Image> images;

    @SerializedName("images_with_background")
    private List<Image> imagesWithBackground;

    /**
     * URL of sticker animation script
     */
    @SerializedName("animation_url")
    private URI animationUrl;

    /**
     * Array of sticker animation script objects
     */
    @SerializedName("animations")
    private List<StickerAnimation> animations;

    /**
     * Information whether the sticker is allowed
     */
    @SerializedName("is_allowed")
    private Boolean isAllowed;

    public Integer getStickerId() {
        return stickerId;
    }

    public StickersKeywordStickers setStickerId(Integer stickerId) {
        this.stickerId = stickerId;
        return this;
    }

    public Integer getProductId() {
        return productId;
    }

    public StickersKeywordStickers setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public StickersKeywordStickers setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    public List<Image> getImagesWithBackground() {
        return imagesWithBackground;
    }

    public StickersKeywordStickers setImagesWithBackground(List<Image> imagesWithBackground) {
        this.imagesWithBackground = imagesWithBackground;
        return this;
    }

    public URI getAnimationUrl() {
        return animationUrl;
    }

    public StickersKeywordStickers setAnimationUrl(URI animationUrl) {
        this.animationUrl = animationUrl;
        return this;
    }

    public List<StickerAnimation> getAnimations() {
        return animations;
    }

    public StickersKeywordStickers setAnimations(List<StickerAnimation> animations) {
        this.animations = animations;
        return this;
    }

    public Boolean getIsAllowed() {
        return isAllowed;
    }

    public StickersKeywordStickers setIsAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAllowed, images, animationUrl, productId, animations, imagesWithBackground, stickerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StickersKeywordStickers stickersKeywordStickers = (StickersKeywordStickers) o;
        return Objects.equals(stickerId, stickersKeywordStickers.stickerId) &&
                Objects.equals(images, stickersKeywordStickers.images) &&
                Objects.equals(animationUrl, stickersKeywordStickers.animationUrl) &&
                Objects.equals(productId, stickersKeywordStickers.productId) &&
                Objects.equals(animations, stickersKeywordStickers.animations) &&
                Objects.equals(isAllowed, stickersKeywordStickers.isAllowed) &&
                Objects.equals(imagesWithBackground, stickersKeywordStickers.imagesWithBackground);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StickersKeywordStickers{");
        sb.append("stickerId=").append(stickerId);
        sb.append(", images=").append(images);
        sb.append(", animationUrl=").append(animationUrl);
        sb.append(", productId=").append(productId);
        sb.append(", animations=").append(animations);
        sb.append(", isAllowed=").append(isAllowed);
        sb.append(", imagesWithBackground=").append(imagesWithBackground);
        sb.append('}');
        return sb.toString();
    }
}
