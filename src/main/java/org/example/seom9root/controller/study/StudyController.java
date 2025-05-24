package org.example.seom9root.controller.study;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/study")
public class StudyController {

    @RequestMapping("/userList")
    public String userList() {

        return "/study/list";
    }
}
