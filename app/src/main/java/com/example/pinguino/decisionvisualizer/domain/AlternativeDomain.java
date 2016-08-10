package com.example.pinguino.decisionvisualizer.domain;

import java.util.List;

/**
 * Created by teresaj on 08/08/16.
 */
public class AlternativeDomain {
    String description;
    List<PointsDomain> consEntityList;
    List<PointsDomain> prosEntityList;

    public AlternativeDomain() {
    }

    public AlternativeDomain(List<PointsDomain> consEntityList, List<PointsDomain> prosEntityList, String description) {
        this.consEntityList = consEntityList;
        this.prosEntityList = prosEntityList;
        this.description = description;
    }

    public List<PointsDomain> getConsEntityList() {
        return consEntityList;
    }

    public void setConsEntityList(List<PointsDomain> consEntityList) {
        this.consEntityList = consEntityList;
    }

    public List<PointsDomain> getProsEntityList() {
        return prosEntityList;
    }

    public void setProsEntityList(List<PointsDomain> prosEntityList) {
        this.prosEntityList = prosEntityList;
    }


    public int getHeartPoints() {
        int x = 0;
        for (PointsDomain pointsDomain : prosEntityList) {
            x += pointsDomain.getHeartPoints();
        }
        for (PointsDomain pointsDomain : consEntityList) {
            x -= pointsDomain.getHeartPoints();
        }
        return x;
    }

    public int getConsMindPoints() {
        int x = 0;
        for (PointsDomain pointsDomain : prosEntityList) {
            x += pointsDomain.getMindPoints();
        }
        for (PointsDomain pointsDomain : consEntityList) {
            x -= pointsDomain.getMindPoints();
        }
        return x;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

