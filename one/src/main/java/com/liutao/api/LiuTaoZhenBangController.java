package com.liutao.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/liu")
public class LiuTaoZhenBangController {

    @GetMapping("/tao")
    public String tao(){
        return "liutaozhenbang";
    }
}
