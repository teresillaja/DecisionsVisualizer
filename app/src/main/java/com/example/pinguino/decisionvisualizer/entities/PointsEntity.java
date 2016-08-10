package com.example.pinguino.decisionvisualizer.entities;

import com.example.pinguino.decisionvisualizer.database.DecisionDatabase;
import com.raizlabs.android.dbflow.annotation.Table;

import org.parceler.Parcel;

/**
 * Created by teresaj on 09/08/16.
 */
@Table(database = DecisionDatabase.class)
@Parcel(analyze = {PointsEntity.class})   // add Parceler annotation here
public class PointsEntity {
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
