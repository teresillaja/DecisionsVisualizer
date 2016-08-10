package com.example.pinguino.decisionvisualizer.domain;

/**
 * Created by teresaj on 09/08/16.
 */
public class PointsDomain {

    String description;
    short mindPoints;
    short heartPoints;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getMindPoints() {
        return mindPoints;
    }

    public void setMindPoints(short mindPoints) {
        this.mindPoints = mindPoints;
    }

    public short getHeartPoints() {
        return heartPoints;
    }

    public void setHeartPoints(short heartPoints) {
        this.heartPoints = heartPoints;
    }
}
