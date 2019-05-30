package com.liutao.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.liutao.util.SysUtil.getToken;

@Controller
@RequestMapping("")
public class Index {

    @GetMapping("")
    public String index(String pathName, Model model) {
        return getToken(pathName, model);
    }

    @GetMapping("liutaozhenbang")
    public String liutaozhenbang() {
        return "";
    }

}