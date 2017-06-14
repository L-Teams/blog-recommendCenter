package com.lteam.util;

import com.google.gson.Gson;

/**
 * @Description:
 * @author guicheng.huang
 * @date: 2017年6月14日 下午1:33:58
 * @version V0.0.1
 */
public class GsonUtil {
	public static <T> T fromJson(String str, Class<T> clazz) {
		try {
			return new Gson().fromJson(str, clazz);
		} catch (Exception e) {}
		return null;
	}
	
	public static String toJson(Object obj) {
		return new Gson().toJson(obj);
	}

}
