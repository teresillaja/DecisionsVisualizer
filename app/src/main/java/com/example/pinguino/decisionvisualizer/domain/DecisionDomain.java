package com.example.pinguino.decisionvisualizer.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by teresaj on 08/08/16.
 */
public class DecisionDomain {
    private Integer id;
    Date deadLine;
    String description;
    List<AlternativeDomain> alternatives;
    AlternativeDomain decisionTaken;
    AlternativeDomain decisionTakenRandomly;
    short decisionEvaluation;


    public void setRandomAlternative(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public List<AlternativeDomain> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(List<AlternativeDomain> alternatives) {
        this.alternatives = alternatives;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AlternativeDomain getDecisionTaken() {
        return decisionTaken;
    }

    public void setDecisionTaken(AlternativeDomain decisionTaken) {
        this.decisionTaken = decisionTaken;
    }

    public AlternativeDomain getDecisionTakenRandomly() {
        return decisionTakenRandomly;
    }

    public void setDecisionTakenRandomly(AlternativeDomain decisionTakenRandomly) {
        this.decisionTakenRandomly = decisionTakenRandomly;
    }

    public short getDecisionEvaluation() {
        return decisionEvaluation;
    }

    public void setDecisionEvaluation(short decisionEvaluation) {
        this.decisionEvaluation = decisionEvaluation;
    }
}
