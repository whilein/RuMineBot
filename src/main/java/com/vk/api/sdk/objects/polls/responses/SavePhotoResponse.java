package com.vk.api.sdk.objects.polls.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.GradientPoint;
import com.vk.api.sdk.objects.base.Image;
import java.util.List;
import java.util.Objects;

/**
 * SavePhotoResponse object
 */
public class SavePhotoResponse implements Validable {
    /**
     * Gradient angle with 0 on positive X axis
     */
    @SerializedName("angle")
    private Integer angle;

    /**
     * Hex color code without #
     */
    @SerializedName("color")
    private String color;

    /**
     * Original height of pattern tile
     */
    @SerializedName("height")
    private Integer height;

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    /**
     * Pattern tiles
     */
    @SerializedName("images")
    private List<Image> images;

    /**
     * Gradient points
     */
    @SerializedName("points")
    private List<GradientPoint> points;

    @SerializedName("type")
    private SavePhotoResponseType type;

    /**
     * Original with of pattern tile
     */
    @SerializedName("width")
    private Integer width;

    public Integer getAngle() {
        return angle;
    }

    public SavePhotoResponse setAngle(Integer angle) {
        this.angle = angle;
        return this;
    }

    public String getColor() {
        return color;
    }

    public SavePhotoResponse setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public SavePhotoResponse setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public SavePhotoResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SavePhotoResponse setName(String name) {
        this.name = name;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public SavePhotoResponse setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    public List<GradientPoint> getPoints() {
        return points;
    }

    public SavePhotoResponse setPoints(List<GradientPoint> points) {
        this.points = points;
        return this;
    }

    public SavePhotoResponseType getType() {
        return type;
    }

    public SavePhotoResponse setType(SavePhotoResponseType type) {
        this.type = type;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public SavePhotoResponse setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(images, color, name, width, angle, id, type, height, points);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavePhotoResponse savePhotoResponse = (SavePhotoResponse) o;
        return Objects.equals(images, savePhotoResponse.images) &&
                Objects.equals(color, savePhotoResponse.color) &&
                Objects.equals(name, savePhotoResponse.name) &&
                Objects.equals(width, savePhotoResponse.width) &&
                Objects.equals(angle, savePhotoResponse.angle) &&
                Objects.equals(id, savePhotoResponse.id) &&
                Objects.equals(type, savePhotoResponse.type) &&
                Objects.equals(height, savePhotoResponse.height) &&
                Objects.equals(points, savePhotoResponse.points);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SavePhotoResponse{");
        sb.append("images=").append(images);
        sb.append(", color='").append(color).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", width=").append(width);
        sb.append(", angle=").append(angle);
        sb.append(", id=").append(id);
        sb.append(", type='").append(type).append("'");
        sb.append(", height=").append(height);
        sb.append(", points=").append(points);
        sb.append('}');
        return sb.toString();
    }
}
