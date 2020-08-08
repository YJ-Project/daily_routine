package com.daily_routine.business.login.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface LoginMapper {
	public String getNow();
}
