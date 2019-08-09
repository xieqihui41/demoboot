/**
 *  Copyright(C) 2015 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.ChapterBean;
import com.example.demo.service.ChapterService;

/**
 * Descriptions
 *
 * @version 2019年7月10日
 * @author SUNTEC
 * @since JDK1.8
 *
 */
@RestController
public class ChapterController {
	@Autowired
	private ChapterService chapter;
	@GetMapping("/getCapter")
	public ChapterBean getCapterInfo() {
		return chapter.selectChapter(101);
	}
}
