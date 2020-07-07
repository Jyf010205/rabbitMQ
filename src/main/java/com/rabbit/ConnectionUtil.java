package com.rabbit;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/7/6 17:51
 */
public class ConnectionUtil {
    public static Connection getConnection() throws IOException, TimeoutException {
        //创建连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //主机地址;默认为 localhost
        connectionFactory.setHost("180.76.136.193");
        //连接端口;默认为 5672
        connectionFactory.setPort(5672);
        //虚拟主机名称;默认为 /
        connectionFactory.setVirtualHost("test");
        //连接用户名；默认为guest
        connectionFactory.setUsername("rabbit");
        //连接密码；默认为guest
        connectionFactory.setPassword("rabbit");
        //创建连接
        return connectionFactory.newConnection();
    }
}
