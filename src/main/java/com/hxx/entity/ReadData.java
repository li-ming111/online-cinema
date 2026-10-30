package com.hxx.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReadData {
    //一级分类名称
    @ExcelProperty(index = 0)
    private String oneSubjectName;

    //二级分类名称
    @ExcelProperty(index = 1)
    private String twoSubjectName;
}
