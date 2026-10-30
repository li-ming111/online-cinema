package com.hxx.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hxx.entity.HxxSubjectEntity;
import com.hxx.service.HxxSubjectService;
import com.hxx.utils.R;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/movies/hxxsubject")
public class HxxSubjectController {
    @Autowired
    private HxxSubjectService hxxSubjectService;

    //添加影片分类
    @PostMapping("addSubject")
    public R addSubject(MultipartFile file){
        //1 获取上传的excel文件 MultipartFile
        //返回错误提示信息
        hxxSubjectService.batchImport(file,hxxSubjectService);
        //判断返回集合是否为空
        return R.ok();
    }

    /**
     * 获取所有一级分类
     */
    @GetMapping("getFirstSubject")
    public R getFirstSubject(){
        QueryWrapper<HxxSubjectEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id",0);
        return R.ok().data("items",hxxSubjectService.list(wrapper));
    }

    @GetMapping("getSecondSubject/{id}")
    public R getSecondSubject(@PathVariable long id){
        QueryWrapper<HxxSubjectEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id",id);
        return R.ok().data("items",hxxSubjectService.list(wrapper));
    }
}