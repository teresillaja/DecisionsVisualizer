package com.example.pinguino.decisionvisualizer.mapper;

import com.example.pinguino.decisionvisualizer.domain.AlternativeDomain;
import com.example.pinguino.decisionvisualizer.domain.DecisionDomain;
import com.example.pinguino.decisionvisualizer.entities.AlternativeEntity;
import com.example.pinguino.decisionvisualizer.entities.DecisionEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by teresaj on 08/08/16.
 */
public class DecisionDomainMapper {

    final AlternativeDomainMapper alternativeDomainMapper;

    public DecisionDomainMapper(AlternativeDomainMapper alternativeDomainMapper) {
        this.alternativeDomainMapper = alternativeDomainMapper;
    }

    public DecisionDomain mapToDomain(DecisionEntity decisionEntity) {
        if (decisionEntity != null) {
            DecisionDomain decisionDomain = new DecisionDomain();
            decisionDomain.setId(decisionEntity.getId());
            decisionDomain.setDescription(decisionEntity.getDescription());
            decisionDomain.setDeadLine(new Date(decisionEntity.getDeadLine()));
            decisionDomain.setDecisionEvaluation(decisionEntity.getDecisionEvaluation());
            decisionDomain.setDecisionTaken(alternativeDomainMapper.mapToDomain(decisionEntity.getDecisionTaken()));
            decisionDomain.setDecisionTakenRandomly(alternativeDomainMapper.mapToDomain(decisionEntity.getDecisionTakenRandomly()));
            List<AlternativeDomain> alternativeDomainList = new ArrayList<>();
            for (AlternativeEntity alternativeEntity : decisionEntity.getAlternatives()) {
                alternativeDomainList.add(alternativeDomainMapper.mapToDomain(alternativeEntity));
            }
        }
        return null;
    }

    public DecisionEntity mapToEntity(DecisionDomain decisionDomain) {
        if (decisionDomain != null) {
            DecisionEntity decisionEntity = new DecisionEntity();
            decisionEntity.setId(decisionDomain.getId());
            decisionEntity.setDescription(decisionDomain.getDescription());
            decisionEntity.setDeadLine(decisionDomain.getDeadLine().getTime());
            decisionEntity.setDecisionEvaluation(decisionDomain.getDecisionEvaluation());
            decisionEntity.setDecisionTaken(alternativeDomainMapper.maptToEntity(decisionDomain.getDecisionTaken()));
            decisionEntity.setDecisionTakenRandomly(alternativeDomainMapper.maptToEntity(decisionDomain.getDecisionTakenRandomly()));
            List<AlternativeEntity> alternativeEntities = new ArrayList<>();
            for (AlternativeDomain alternativeDomain : decisionDomain.getAlternatives()) {
                alternativeEntities.add(alternativeDomainMapper.maptToEntity(alternativeDomain));
            }
            return decisionEntity;
        }
        return null;
    }
}
