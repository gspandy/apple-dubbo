package com.appleframework.dubbo.config;

import java.util.Properties;

import com.appleframework.config.core.event.ConfigListener;
import com.appleframework.dubbo.cache.config.DubboCacheConfig;

/**
 * Hello world!
 *
 */
public class DubboEventListener implements ConfigListener {

	private static String KEY_CACHE_ENABLE = "dubbo.cache.enable";

	private static String KEY_CACHE_OBJECT = "dubbo.cache.object";
	
	@Override
	public void receiveConfigInfo(Properties props) {
		Object cacheEnable = props.get(KEY_CACHE_ENABLE);
		if (null != cacheEnable) {
			DubboCacheConfig.setCacheEnable(Boolean.valueOf(cacheEnable.toString()));
		}
		Object cacheObject = props.get(KEY_CACHE_OBJECT);
		if (null != cacheObject) {
			DubboCacheConfig.setCacheObject(Boolean.valueOf(cacheObject.toString()));
		}
	}

}