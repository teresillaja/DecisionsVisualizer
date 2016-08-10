package com.example.pinguino.decisionvisualizer.mapper;

import com.example.pinguino.decisionvisualizer.domain.PointsDomain;
import com.example.pinguino.decisionvisualizer.entities.PointsEntity;

/**
 * Created by teresaj on 09/08/16.
 */
public class PointsDomainMapper {

    public PointsDomain mapToDomain(PointsEntity pointsEntity) {
        if (pointsEntity != null) {
            PointsDomain pointsDomain = new PointsDomain();
            pointsDomain.setDescription(pointsEntity.getDescription());
            pointsDomain.setMindPoints(pointsEntity.getMindPoints());
            pointsDomain.setHeartPoints(pointsEntity.getHeartPoints());
        }
        return null;
    }

    public PointsEntity mapToEntity(PointsDomain pointsDomain){
        if(pointsDomain!=null){
            PointsEntity pointsEntity= new PointsEntity();
            pointsEntity.setDescription(pointsDomain.getDescription());
            pointsEntity.setHeartPoints(pointsDomain.getHeartPoints());
            pointsEntity.setMindPoints(pointsDomain.getMindPoints());
        }
        return null;
    }
}
