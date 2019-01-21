package com.liutao.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.liutao.util.SysUtil.getToken;

@Controller
@RequestMapping("/main")
public class LiuTaoZhenBangController {

    @GetMapping("/index")
    public String getPageByName(String pathName, Model model) {
        return getToken(pathName, model);
    }
}
