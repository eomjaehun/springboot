package com.prj.kcp.service;

import java.util.List;

import com.prj.kcp.mapper.TestMapper;
import com.prj.kcp.vo.TestVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
  
  @Autowired
  public TestMapper mapper;

  public List<TestVo> selectTest() {
      return mapper.selectTest();
  }
}