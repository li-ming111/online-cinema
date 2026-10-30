package com.hxx.controller;

import com.hxx.utils.R;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/user")
public class HxxLoginController {

    private String hxxcode;
    //登录方法
    @GetMapping("/login/{code}")
    public R login(@PathVariable String code){
        if (hxxcode.equals(code)) {
            return R.ok().data("mobile","13936439780");
        }
        return R.error();
    }

    //登录信息
    @GetMapping("/send")
    public R send(){
        Random random = new Random();
        //生成4位随机数
        hxxcode = "";
        for (int index = 0; index < 4; index++) {
            hxxcode += random.nextInt(9);
        }
        return R.ok().data("msg",hxxcode);
    }
}















