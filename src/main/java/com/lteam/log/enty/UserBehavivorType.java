package com.lteam.log.enty;
/**
 * @Description:用户行为枚举
 *              领域 /电商/论坛/电影网站/书籍类网站/新闻类网站
 * @author guicheng.huang
 * @date: 2017年5月27日 上午9:57:07
 * @version V0.0.1
 */
public enum UserBehavivorType {

	//公共
	SEARCH, //用户查询
	LOOKTHROUGH, //用户浏览
	SCORE, //用户评分
	COLLECTION, //用户收藏
	UNCOLLECTION, //用户取消收藏
	COMMENT, //用户评论
	
	//电商
	ADDSHOPPINGCART, //用户添加购物车
	REMOVESHOPPINGCART, //用户移除购物车
	
	//论坛
	REPLY, //用户回复
	LIKE, //用户点击喜欢
	UNLIKE, //用户点击不喜欢
	RELAY, //用户转发
	
}
