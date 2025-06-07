package org.example.seom9root.service.study;

import org.example.seom9root.dto.study.StudyUserDTO;

import java.util.List;

public interface StudyService {

    public void insertStudyUser(List<StudyUserDTO> users);

    public List<StudyUserDTO> getStudyUsers();

    public void insetStudyChecked(List<Long> checkedIds);

    public List<StudyUserDTO> getStudyUsersWithChecked();
}
