package com.zyq.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexMapper {
    List index();
}
