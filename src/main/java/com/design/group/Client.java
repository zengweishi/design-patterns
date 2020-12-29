package com.design.group;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 16:04
 * @Description:组合模式
 */
public class Client {
    public static void main(String[] args) {
        Folder folder = new Folder("D盘：");
        Folder asia = new Folder("Asia");
        Folder europe = new Folder("Europe");
        folder.add(asia);
        folder.add(europe);
        Folder china = new Folder("China");
        Folder japan = new Folder("Japan");
        asia.add(china);
        asia.add(japan);
        Folder england = new Folder("England");
        Folder spain = new Folder("Spain");
        europe.add(england);
        europe.add(spain);
        File fujian = new File("Fujian");
        File guangdong = new File("Guangdong");
        china.add(fujian);
        china.add(guangdong);

        folder.ls(0);

    }
}
