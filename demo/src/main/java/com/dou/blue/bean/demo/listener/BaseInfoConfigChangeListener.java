package com.dou.blue.bean.demo.listener;

import com.tencent.cloud.polaris.config.annotation.PolarisConfigKVFileChangeListener;
import com.tencent.cloud.polaris.config.listener.ConfigChangeEvent;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class BaseInfoConfigChangeListener {

    /**
     * 注意仅支持key-value形式的配置格式
     *
     * @param event instance of {@link ConfigChangeEvent}
     */
    @PolarisConfigKVFileChangeListener(interestedKeyPrefixes = "base")
    public void onChange(ConfigChangeEvent event) {
        Set<String> changedKeys = event.changedKeys();

        for (String changedKey : changedKeys) {
            System.out.printf("%s = %s \n", changedKey, event.getChange(changedKey));
        }
    }


}
