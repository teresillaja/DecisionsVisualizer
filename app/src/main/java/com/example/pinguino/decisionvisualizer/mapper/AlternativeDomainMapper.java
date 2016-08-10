package com.example.pinguino.decisionvisualizer.mapper;

import com.example.pinguino.decisionvisualizer.domain.AlternativeDomain;
import com.example.pinguino.decisionvisualizer.domain.PointsDomain;
import com.example.pinguino.decisionvisualizer.entities.AlternativeEntity;
import com.example.pinguino.decisionvisualizer.entities.PointsEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by teresaj on 08/08/16.
 */
public class AlternativeDomainMapper {

    private final PointsDomainMapper pointsDomainMapper;

    public AlternativeDomainMapper(PointsDomainMapper pointsDomainMapper) {
        this.pointsDomainMapper = pointsDomainMapper;
    }

    public AlternativeDomain mapToDomain(AlternativeEntity alternativeEntity) {
        if (alternativeEntity != null) {
            AlternativeDomain alternativeDomain = new AlternativeDomain();
            alternativeDomain.setDescription(alternativeEntity.getDescription());
            List<PointsDomain> consList = new ArrayList<>();
            List<PointsDomain> prosList = new ArrayList<>();
            for (PointsEntity pointsEntity : alternativeEntity.getConsEntityList()) {
                consList.add(pointsDomainMapper.mapToDomain(pointsEntity));
            }
            for (PointsEntity pointsEntity : alternativeEntity.getProsEntityList()) {
                prosList.add(pointsDomainMapper.mapToDomain(pointsEntity));
            }
            return alternativeDomain;
        }
        return null;
    }

    public AlternativeEntity maptToEntity(AlternativeDomain alternativeDomain) {
        if (alternativeDomain != null) {
            AlternativeEntity alternativeEntity = new AlternativeEntity();
            alternativeEntity.setDescription(alternativeDomain.getDescription());
            List<PointsEntity> consList = new ArrayList<>();
            List<PointsEntity> prosList = new ArrayList<>();
            for (PointsDomain pointsDomain : alternativeDomain.getConsEntityList()) {
                consList.add(pointsDomainMapper.mapToEntity(pointsDomain));
            }
            for (PointsDomain pointsDomain : alternativeDomain.getProsEntityList()) {
                prosList.add(pointsDomainMapper.mapToEntity(pointsDomain));
            }
            return alternativeEntity;
        }
        return null;
    }


}
