package com.github.xcfyl.drpc.core.proxy.jdk;

import com.github.xcfyl.drpc.core.proxy.ProxyFactory;
import io.netty.channel.ChannelFuture;

import java.lang.reflect.Proxy;

/**
 * 基于jdk动态代理模式的代理工厂
 *
 * @author 西城风雨楼
 * @date create at 2023/6/22 11:16
 */
public class JdkProxyFactory implements ProxyFactory {
    private final ChannelFuture channelFuture;

    public JdkProxyFactory(ChannelFuture channelFuture) {
        this.channelFuture = channelFuture;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getProxy(Class<T> clazz) throws Throwable {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class<?>[]{clazz}, new RpcInvocationHandler(clazz, channelFuture));
    }
}
