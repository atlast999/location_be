package com.example.accessingdata.domain;

import java.io.Serializable;

public class Position implements Serializable {
    float xAxis;
    float yAxis;

    public Position(float xAxis, float yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public float getxAxis() {
        return xAxis;
    }

    public void setxAxis(float xAxis) {
        this.xAxis = xAxis;
    }

    public float getyAxis() {
        return yAxis;
    }

    public void setyAxis(float yAxis) {
        this.yAxis = yAxis;
    }
}
