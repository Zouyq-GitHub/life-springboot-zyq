package com.zyq.service;

import com.zyq.dao.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {

    @Autowired
    IndexMapper indexMapper;

    public List index() {
        return indexMapper.index();
    }
}
