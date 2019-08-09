/**
 *  Copyright(C) 2015 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package com.example.demo.bean;

import java.util.List;

/**
 * Descriptions
 *
 * @version 2019年7月10日
 * @author SUNTEC
 * @since JDK1.8
 *
 */
public class ChapterBean {
	// 式样书编号
		private Long bookId;
		// 章节编号
		private Long id;
		// 章节内容
		private String content;
		
		private String chapterNo;
		private String title;
		private Long parentId;
		private String md5;
		private Integer nextFuncNo;
		private Integer version;
		private Long leftValue;
		private Long rightValue;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getChapterNo() {
			return chapterNo;
		}

		public void setChapterNo(String chapterNo) {
			this.chapterNo = chapterNo;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Long getParentId() {
			return parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public String getMd5() {
			return md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public Integer getNextFuncNo() {
			return nextFuncNo;
		}

		public void setNextFuncNo(Integer nextFuncNo) {
			this.nextFuncNo = nextFuncNo;
		}

		public Integer getVersion() {
			return version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}
		public Long getBookId() {
			return bookId;
		}
		public void setBookId(Long bookId) {
			this.bookId = bookId;
		}
		public Long getLeftValue() {
			return leftValue;
		}
		public void setLeftValue(Long leftValue) {
			this.leftValue = leftValue;
		}
		public Long getRightValue() {
			return rightValue;
		}
		public void setRightValue(Long rightValue) {
			this.rightValue = rightValue;
		}
}
