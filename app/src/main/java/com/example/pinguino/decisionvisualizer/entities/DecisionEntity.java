package com.example.pinguino.decisionvisualizer.entities;

import com.example.pinguino.decisionvisualizer.database.DecisionDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by teresaj on 08/08/16.
 */
@Table(database = DecisionDatabase.class)
@Parcel(analyze = {DecisionEntity.class})   // add Parceler annotation here
public class DecisionEntity extends BaseModel {
    @Column
    @PrimaryKey(autoincrement = true)
    private Integer id;
    long deadLine;
    String description;
    List<AlternativeEntity> alternatives;
    AlternativeEntity decisionTaken;
    AlternativeEntity decisionTakenRandomly;
    short decisionEvaluation;

    public long getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(long deadLine) {
        this.deadLine = deadLine;
    }

    public List<AlternativeEntity> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(List<AlternativeEntity> alternatives) {
        this.alternatives = alternatives;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AlternativeEntity getDecisionTaken() {
        return decisionTaken;
    }

    public void setDecisionTaken(AlternativeEntity decisionTaken) {
        this.decisionTaken = decisionTaken;
    }

    public AlternativeEntity getDecisionTakenRandomly() {
        return decisionTakenRandomly;
    }

    public void setDecisionTakenRandomly(AlternativeEntity decisionTakenRandomly) {
        this.decisionTakenRandomly = decisionTakenRandomly;
    }

    public short getDecisionEvaluation() {
        return decisionEvaluation;
    }

    public void setDecisionEvaluation(short decisionEvaluation) {
        this.decisionEvaluation = decisionEvaluation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
