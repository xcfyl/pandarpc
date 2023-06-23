package com.github.xcfyl.drpc.core.registry;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * 需要向注册中心写入的数据
 *
 * @author 西城风雨楼
 * @date create at 2023/6/22 20:53
 */
@ToString
public class RegistryData {
    /**
     * 应用名称
     */
    private String applicationName;
    /**
     * 机器的ip地址
     */
    private String ip;
    /**
     * 所监听的端口
     */
    private Integer port;
    /**
     * 服务名称
     */
    private String serviceName;
    /**
     * 注册数据的扩展数据
     */
    private Map<String, Object> attr;

    public RegistryData() {
        attr = new HashMap<>();
    }

    public Integer getPort() {
        return port;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getIp() {
        return ip;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public Map<String, Object> getAttr() {
        return attr;
    }

    public void setAttr(Map<String, Object> attr) {
        this.attr = attr;
    }
}
