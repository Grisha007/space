package com.eversis.spaceagencydatahub.data.imagery;

public class MultispectralImage implements ImageryType {
    @Override
    public String imageryType() {
        return "Image type: Multispectral";
    }
}
