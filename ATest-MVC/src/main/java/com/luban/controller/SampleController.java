/*******************************************************************************************
 * (C) COPYRIGHT IBM Corporation 2009, 2010, 2011, 2012
 * All Rights Reserved. 
 *
 * Licensed Materials-Property of IBM																				
 ******************************************************************************************/
package com.luban.controller;

import com.luban.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guangqingzhong
 *
 */
@Controller
public class SampleController {

	 @RequestMapping("/jsp/sample")
	 public String getSampleJsp() {
		 return "SampleJsp";
	 }
	 
	 @RequestMapping("/config/sample.config")
	 public String getSampleConfig() {
		 return "SampleConfig.config";
	 }
	 
	 
	 @RequestMapping("/swf/sample.swf")
	 public String getSampleSwf() {
		 return "SampleSwf.swf";
	 }

	 @RequestMapping("/user/get")
	 @ResponseBody
	 public User getUser(){

	 	return null;
	 }
	 
}
