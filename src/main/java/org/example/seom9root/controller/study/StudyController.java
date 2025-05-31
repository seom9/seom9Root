package org.example.seom9root.controller.study;

import lombok.RequiredArgsConstructor;
import org.example.seom9root.dto.study.StudyUserDTO;
import org.example.seom9root.service.study.StudyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/study")
public class StudyController {
    
    private final StudyService studyService;
    
    @RequestMapping("/userList")
    public String userList(Model model) {
        List<StudyUserDTO> users = studyService.getStudyUsers();
        model.addAttribute("users", users); // 👈 뷰에 전달
        return "/study/list";
    }
}
