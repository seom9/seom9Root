package org.example.seom9root.controller.bamboo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
@RequiredArgsConstructor
@RequestMapping("/bamboo")
public class BambooController {

    @GetMapping("/login")
    public String login() {


        return "/bamboo/login";
    }


    @GetMapping("/insert")
    public String login(@RequestParam("code") String code) {

        

        return "/bamboo/insert";
    }
}
