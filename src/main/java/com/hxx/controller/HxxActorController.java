package com.hxx.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hxx.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hxx.entity.HxxActorEntity;
import com.hxx.service.HxxActorService;
/**
 * 演员表
 *
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
@RestController
@RequestMapping("/movies/hxxactor")
public class HxxActorController {
    @Autowired
    private HxxActorService hxxActorService;

    //分页查询
    @GetMapping("/pageList")
    public R list(Page<HxxActorEntity> page){
        hxxActorService.queryPage(page,null);
        return R.ok().data("rows",page.getRecords()).data("total",page.getTotal());
    }

    //保存
    @PostMapping("/save")
    public R save(@RequestBody HxxActorEntity actorEntity){
        hxxActorService.save(actorEntity);
        return R.ok();
    }

    //修改
    @PutMapping("/update")
    public R update(@RequestBody HxxActorEntity actorEntity){
        hxxActorService.updateById(actorEntity);
        return R.ok();
    }

    //删除
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable String id){
        hxxActorService.removeById(id);
        return R.ok();
    }
}




























