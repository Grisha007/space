package com.eversis.spaceagencydatahub.data.imagery;

public class PanchromaticImage implements ImageryType {
    @Override
    public String imageryType() {
        return "Image type: Panchromatic";
    }
}
