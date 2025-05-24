package org.example.seom9root.repository.study;

import org.example.seom9root.domain.study.StudyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends JpaRepository<StudyUser, Long> {
}
