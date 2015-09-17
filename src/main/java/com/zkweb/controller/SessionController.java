package com.zkweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
public class SessionController {
	@RequestMapping(value = "/test/session", method = RequestMethod.GET)
	@ResponseBody
	public String sessionTest(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("session", request.getSession().toString());
		map.put("key1", request.getSession().getId());
		map.put("key2", "汉字测试");
		Map<String, Object> map1 = new HashMap<String, Object>(map);
		map.put("key3", map1);
		return JSON.toJSONString(map);
	}
}
