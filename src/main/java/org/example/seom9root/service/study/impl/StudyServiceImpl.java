package org.example.seom9root.service.study.impl;

import lombok.RequiredArgsConstructor;
import org.example.seom9root.domain.study.StudyCheck;
import org.example.seom9root.domain.study.StudyUser;
import org.example.seom9root.dto.study.StudyUserDTO;
import org.example.seom9root.repository.study.StudyCheckRepository;
import org.example.seom9root.repository.study.StudyRepository;
import org.example.seom9root.service.study.StudyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudyServiceImpl implements StudyService {

    private final StudyRepository studyRepository;
    private final StudyCheckRepository studyCheckRepository;

    @Override
    public void insertStudyUser(List<StudyUserDTO> users) {
        for (StudyUserDTO dto : users) {
            StudyUser entity = studyRepository.save(dto.toInsertEntity());
        }
    }

    @Override
    public List<StudyUserDTO> getStudyUsers() {
        return studyRepository.findAll().stream()
                .map(StudyUserDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void insetStudyChecked(List<Long> studyChecked) {
        for (Long id : studyChecked) {
            studyCheckRepository.save(StudyCheck.toEntity(id));
        }
    }

    @Override
    public List<StudyUserDTO> getStudyUsersWithChecked() {
        return studyRepository.findAllStudyUsers().stream()
                .map(StudyUserDTO::fromEntity)
                .collect(Collectors.toList());

    }
}
