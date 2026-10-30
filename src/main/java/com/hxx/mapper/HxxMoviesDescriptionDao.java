package com.hxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxx.entity.HxxMoviesDescriptionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 影视简介表
 * 
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
@Mapper
public interface HxxMoviesDescriptionDao extends BaseMapper<HxxMoviesDescriptionEntity> {
	
}
