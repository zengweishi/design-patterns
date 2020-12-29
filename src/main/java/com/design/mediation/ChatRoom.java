package com.design.mediation;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 14:55
 * @Description:模拟中介聊天室
 */
@Data
public class ChatRoom {
    /**
     * 聊天室名称
     */
    private String name;
    /**
     * 聊天室用户
     */
    private List<User> list = new ArrayList<User>();

    public ChatRoom(String name) {
        this.name = name;
    }

    public void connect(User user) {
        list.add(user);
        System.out.println("欢迎【" + user.getName() + "】加入chatroom");
    }

    /**
     * 发送消息
     */
    public void sendMessage(final User sendUser, final String msg) {
        list.stream()
                .filter(user -> !user.equals(sendUser)) //过滤发送者自己
                .forEach(toUser -> toUser.listen(sendUser,msg)); //把消息发送给其他人
    }
}
