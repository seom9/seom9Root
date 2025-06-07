package org.example.seom9root.repository.study;

import org.example.seom9root.domain.study.StudyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyRepository extends JpaRepository<StudyUser, Long> {
    @Query("SELECT u FROM StudyUser u LEFT JOIN FETCH u.studyChecks")
    List<StudyUser> findAllStudyUsers();
}
