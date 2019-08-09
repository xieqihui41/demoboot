/**
 *  Copyright(C) 2015 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package com.example.demo.service;

import com.example.demo.bean.ChapterBean;

/**
 * Descriptions
 *
 * @version 2019年7月10日
 * @author SUNTEC
 * @since JDK1.8
 *
 */
public interface ChapterService {
	/**
	 * 获取章节信息
	 * @param id
	 * @return
	 */
	ChapterBean selectChapter(int id);
}
