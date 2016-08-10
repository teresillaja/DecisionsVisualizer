package com.example.pinguino.decisionvisualizer.entities;

import com.example.pinguino.decisionvisualizer.database.DecisionDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by teresaj on 08/08/16.
 */
@Table(database = DecisionDatabase.class)
@Parcel(analyze = {AlternativeEntity.class})   // add Parceler annotation here
public class AlternativeEntity {
    String description;
    List<PointsEntity> consEntityList;
    List<PointsEntity> prosEntityList;
    @Column
    @PrimaryKey(autoincrement = true)
    private Integer id;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<PointsEntity> getProsEntityList() {
        return prosEntityList;
    }

    public void setProsEntityList(List<PointsEntity> prosEntityList) {
        this.prosEntityList = prosEntityList;
    }

    public List<PointsEntity> getConsEntityList() {
        return consEntityList;
    }

    public void setConsEntityList(List<PointsEntity> consEntityList) {
        this.consEntityList = consEntityList;
    }
}
