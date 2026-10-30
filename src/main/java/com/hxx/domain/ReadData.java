package com.hxx.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ReadData {
    @ExcelProperty(index = 0)
    private Integer sid;
    
    @ExcelProperty(index = 1)
    private String sname;    
}