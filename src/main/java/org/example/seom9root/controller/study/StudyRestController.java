package org.example.seom9root.controller.study;

import lombok.RequiredArgsConstructor;
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

    final StudyService studyService;

    @PostMapping("/user/input")
    public ResponseEntity<?> input(@RequestBody List<StudyUserDTO> users) {

        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", users.size() + "명 등록 완료");

        return ResponseEntity.ok(result);
    }
}
