package org.example.seom9root.domain.study;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Table(name = "study_check")
public class StudyCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_user_id", nullable = false)
    private StudyUser studyUser;

    private LocalDateTime createdAt;

    public boolean isTodayCheck() {
        return createdAt != null && createdAt.toLocalDate().isEqual(LocalDate.now());
    }

    public static StudyCheck toEntity(Long id) {
        StudyUser userRef = StudyUser.builder()
                .id(id)
                .build();

        return StudyCheck.builder()
                .studyUser(userRef)
                .createdAt(LocalDateTime.now())
                .build();
    }
}
