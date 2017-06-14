package com.lteam.log.mq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lteam.log.enty.LogEnty;
import com.lteam.log.service.LogService;
import com.lteam.util.GsonUtil;

/**
 * @Description:mq接受来自应用的用户行为日志
 * @author guicheng.huang
 * @date: 2017年6月14日 上午10:23:27
 * @version V0.0.1
 */
@Service("logConsumer")
public class LogConsumer {
	
	@Autowired
	private LogService logService;
	
	public void onMessage(Object  obj) throws Exception {
		try {
			if (!(obj instanceof String)) {
			   return;
			}
			String message = (String) obj;
			List<LogEnty> log = GsonUtil.fromJson(message, new Type);
			logService.mergeBehaviorLogByUser(log);
		} catch (Exception e) {
			Thread.sleep(10000);
			throw new Exception();
		}
	}
}
