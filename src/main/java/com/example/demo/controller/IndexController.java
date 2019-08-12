/**
 *  Copyright(C) 2015 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Descriptions
 *
 * @version 2019年8月12日
 * @author SUNTEC
 * @since JDK1.8
 *
 */
//@RestController 返回数值
@Controller
public class IndexController {
	
	@GetMapping("index")
	public String index() {
		return "hello";
	}
}
