/**
 *  Copyright(C) 2015 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.ChapterBean;
import com.example.demo.dao.ChapterDao;
import com.example.demo.service.ChapterService;

/**
 * Descriptions
 *
 * @version 2019年7月10日
 * @author SUNTEC
 * @since JDK1.8
 *
 */
@Service
public class ChapterServiceImpl implements ChapterService{
	
	@Autowired
	private ChapterDao chapterDao;
	/* (non-Javadoc)
	 * @see com.example.demo.service.ChapterService#selectChapter(long)
	 */
	@Override
	public ChapterBean selectChapter(int id) {
		if(id>0)
		 return chapterDao.selectChapter(id);
		else return null;
	}

}
