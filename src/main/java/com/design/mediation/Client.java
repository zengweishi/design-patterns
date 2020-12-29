package com.design.mediation;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 15:13
 * @Description:中介模式
 */
public class Client {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        ChatRoom chatRoom = new ChatRoom("room");
        user1.login(chatRoom);
        user2.login(chatRoom);
        user3.login(chatRoom);
        user1.talk("我是user1，我有话说...");
    }
}
