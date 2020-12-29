package com.design.mediation;

import com.design.Strategy.Strategy;
import lombok.Data;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 14:54
 * @Description:模拟用户
 */
@Data
public class User {
    private String name;

    /**
     * 聊天室
     */
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public void login(ChatRoom chatRoom) {
        chatRoom.connect(this);
        this.chatRoom = chatRoom;
    }

    public void talk(String msg) {
        chatRoom.sendMessage(this, msg);
    }

    public void listen(User user, String msg) {
        System.out.println(name+"的对话框显示：");
        System.out.println(user.getName()+"说："+msg);
    }
}
