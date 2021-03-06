package com.javaniuniu.work;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @auther: javaniuniu
 * @date: 2020/6/7 2:31 PM
 */
public class MyConsumer2 {
    private final static String QUEUE_NAME = "work_queue";

    // 接收信息
    public static void main(String[] args) throws IOException, TimeoutException {
        // 1.创建链接
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("dubbo");
        connectionFactory.setPassword("123");
        connectionFactory.setVirtualHost("/dubbo");
        Connection connection = connectionFactory.newConnection();

        // 2.基于链接对象创建 Channel
        Channel channel = connection.createChannel();

        // 3. 创建消费者对象，并且写好处理的逻辑
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body);
                System.out.println("消费者2：接收到的信息是: "+message);

                // 手工确认模式，告知MQ服务器，消息已经被正确处理
                // multiple 表示是否批量确认
                // 为true，表示批量确认， 假设，envelope.getDeliveryTag() = 10 意味着 1-10 的信息都确认
                // 为false 则只确认 10
                channel.basicAck(envelope.getDeliveryTag(),false);
            }


        };

        // 4. 需要消费者监听队列
        // autoACK = true 自动确认模式
        // autoACK = false 自动确认模式（推荐）
        channel.basicConsume(QUEUE_NAME,false,consumer);



    }


}
