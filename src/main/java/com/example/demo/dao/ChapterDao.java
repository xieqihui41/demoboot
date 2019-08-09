/**
 *  Copyright(C) 2015 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.bean.ChapterBean;

/**
 * Descriptions
 *
 * @version 2019年7月10日
 * @author SUNTEC
 * @since JDK1.8
 *
 */
@Mapper
public interface ChapterDao {
	//@Select(" select title from tb_chapter b where  b.book_id = #{id} limit 1")
	ChapterBean selectChapter(int id);
}
