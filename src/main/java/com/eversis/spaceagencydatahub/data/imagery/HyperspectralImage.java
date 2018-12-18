package com.eversis.spaceagencydatahub.data.imagery;

public class HyperspectralImage implements ImageryType {
    @Override
    public String imageryType() {
        return "Image type: Hyperspectral";
    }
}
