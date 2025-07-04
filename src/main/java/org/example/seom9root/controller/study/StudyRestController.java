package org.example.seom9root.controller.study;

import lombok.RequiredArgsConstructor;
import org.example.seom9root.dto.common.ApiResponse;
import org.example.seom9root.dto.study.StudyUserDTO;
import org.example.seom9root.service.study.StudyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/study")
public class StudyRestController {

    private final StudyService studyService;

    @PostMapping("/user/input")
    public ResponseEntity<?> input(@RequestBody List<StudyUserDTO> users) {
        studyService.insertStudyUser(users);
        return ResponseEntity.ok(new ApiResponse(true, users.size() + "명 등록 완료"));
    }

    @PostMapping("/user/checked")
    public ResponseEntity<?> check(@RequestBody List<Long> checkedIds) {
        studyService.insetStudyChecked(checkedIds);
        return ResponseEntity.ok(new ApiResponse(true, "출석 체크 완료"));
    }
}
