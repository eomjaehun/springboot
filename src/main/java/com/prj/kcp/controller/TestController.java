package com.prj.kcp.controller;

import java.util.ArrayList;
import java.util.List;

import com.prj.kcp.service.TestService;
import com.prj.kcp.vo.TestVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {    
	@Autowired
	TestService testService;

	@RequestMapping(value = "/test")
	public ModelAndView test() throws Exception {
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("name", "eom!!");
/*
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		mav.addObject("list", testList);
*/
		List<TestVo> list = testService.selectTest();
		mav.addObject("list", list);

		return mav;
	}
}
