package org.example.seom9root.service.study.impl;

import lombok.RequiredArgsConstructor;
import org.example.seom9root.domain.study.StudyUser;
import org.example.seom9root.dto.study.StudyUserDTO;
import org.example.seom9root.repository.study.StudyRepository;
import org.example.seom9root.service.study.StudyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudyServiceImpl implements StudyService {

    private final StudyRepository studyRepository;

    @Override
    public int insertStudyUser(List<StudyUserDTO> users) {
        int cnt = 0;
        for (StudyUserDTO dto : users) {
            StudyUser entity = studyRepository.save(dto.toEntity());
            if (entity.getId() != null) { // 저장된 경우
                cnt++;
            }
        }
        return cnt;
    }
}
