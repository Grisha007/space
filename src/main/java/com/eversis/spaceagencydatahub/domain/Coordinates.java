package com.eversis.spaceagencydatahub.domain;

import java.math.BigDecimal;

public class Coordinates {
    private BigDecimal firstCoordinate;
    private BigDecimal secondCoordinate;
    private BigDecimal thirdCoordinate;
    private BigDecimal fourthCoordinate;

    public Coordinates(BigDecimal firstCoordinate, BigDecimal secondCoordinate, BigDecimal thirdCoordinate, BigDecimal fourthCoordinate) {
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        this.fourthCoordinate = fourthCoordinate;
    }

    public BigDecimal getFirstCoordinate() {
        return firstCoordinate;
    }

    public BigDecimal getSecondCoordinate() {
        return secondCoordinate;
    }

    public BigDecimal getThirdCoordinate() {
        return thirdCoordinate;
    }

    public BigDecimal getFourthCoordinate() {
        return fourthCoordinate;
    }
}
