package com.liutao.util;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SysUtil {

    public static String getToken(String pathName, Model model) {
        model.addAttribute("name", "刘涛");
        model.addAttribute("sex", "男");
        model.addAttribute("age",
                Integer.parseInt(new SimpleDateFormat("yyyy").
                        format(new Date())) - 1993 + 1);
        model.addAttribute("work", "java开发工程师");
        return pathName != null ? pathName : "index";
    }
}
