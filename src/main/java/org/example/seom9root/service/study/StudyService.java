package org.example.seom9root.service.study;

import org.example.seom9root.dto.study.StudyUserDTO;

import java.util.List;

public interface StudyService {

    public int insertStudyUser(List<StudyUserDTO> users);
}
