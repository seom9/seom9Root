package org.example.seom9root.dto.study;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.example.seom9root.common.Common;
import org.example.seom9root.domain.study.StudyCheck;
import org.example.seom9root.domain.study.StudyUser;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class StudyUserDTO {

    private Long id;

    private String name;

    private String gitHub;

    private int careerYear;

    private String jobTitle;

    private boolean todayCheck;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;

    public static StudyUserDTO fromEntity(StudyUser studyUser) {
        boolean todayChecked = studyUser.getStudyChecks().stream()
                .anyMatch(StudyCheck::isTodayCheck);

        return StudyUserDTO.builder()
                .id(studyUser.getId())
                .name(studyUser.getName())
                .gitHub(studyUser.getGitHub())
                .careerYear(studyUser.getCareerYear())
                .jobTitle(studyUser.getJobTitle())
                .todayCheck(todayChecked)
                .createdAt(studyUser.getCreatedAt())
                .updatedAt(studyUser.getUpdatedAt())
                .deletedAt(studyUser.getDeletedAt())
                .build();
    }

    public StudyUser toInsertEntity() {
        return StudyUser.builder()
                .name(this.name)
                .gitHub(this.gitHub)
                .careerYear(this.careerYear)
                .jobTitle(this.jobTitle)
                .createdAt(LocalDateTime.now())
                .build();
    }

    public StudyUser toEntity() {
        return StudyUser.builder()
                .name(this.name)
                .gitHub(this.gitHub)
                .careerYear(this.careerYear)
                .jobTitle(this.jobTitle)
                .createdAt(this.createdAt)
                .updatedAt(this.updatedAt)
                .deletedAt(this.deletedAt)
                .build();
    }



}
