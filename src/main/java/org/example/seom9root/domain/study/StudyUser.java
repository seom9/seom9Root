package org.example.seom9root.domain.study;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Table(name = "study_user")
public class StudyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String gitHub;

    @Column(name = "career_year")
    private int careerYear;

    @Column(name = "job_title")
    private String jobTitle;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;

    @OneToMany(mappedBy = "studyUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudyCheck> studyChecks = new ArrayList<>();
}
