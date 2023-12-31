package org.example.servlet.mapper;

import org.example.model.entity.SubjectEntity;
import org.example.servlet.dto.SubjectDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {MarkToStudentMapper.class, StudentMapper.class})
public interface SubjectMapper {
    SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);
    @Mapping(source = "markEntitiesList", target = "markDTOList")
    SubjectDTO toSubjectDTO(SubjectEntity SubjectEntity);

    @InheritInverseConfiguration
    SubjectEntity toSubjectEntity(SubjectDTO subjectDTO);

}
