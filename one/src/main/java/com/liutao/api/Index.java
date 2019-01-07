package com.liutao.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/main")
public class Index {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("loginName", "admin");
        model.addAttribute("loginId", "27");
        return "index";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> paramMap) {
        paramMap.put("name", "刘涛");
        paramMap.put("age", 28);
        return "success";
    }

}