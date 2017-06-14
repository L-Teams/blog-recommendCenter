package com.lteam.log.enty;

import java.util.Date;

/**
 * @Description:日志实体
 * @author guicheng.huang
 * @date: 2017年6月14日 下午1:15:54
 * @version V0.0.1
 */
public class LogEnty {

	private String userId;
	
	private String blogId;
	
	private UserBehavivorType logType;
	 
	private String logContent;
	
	private Date createTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public UserBehavivorType getLogType() {
		return logType;
	}

	public void setLogType(UserBehavivorType logType) {
		this.logType = logType;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "LogEnty [userId=" + userId + ", blogId=" + blogId
				+ ", logType=" + logType + ", logContent=" + logContent
				+ ", createTime=" + createTime + "]";
	}
	
}
