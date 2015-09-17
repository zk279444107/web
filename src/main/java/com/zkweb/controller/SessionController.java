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
	public String sessionTest(HttpServletRequest request){
		Map<String,String> map = new HashMap<String,String>();
		map.put("session", request.getSession().toString());
		return JSON.toJSONString(map);
	}
}
