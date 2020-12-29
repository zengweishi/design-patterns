package com.design.template;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 10:02
 * @Description:模板子类
 */
public class DevelopImpl01 extends DevelopTemplate {
    protected void analyze() {
        System.out.println("01analyze");
    }

    protected void design() {
        System.out.println("01design");
    }

    protected void develop() {
        System.out.println("01develop");
    }

    protected boolean test() {
        System.out.println("01test");
        return true;
    }

    protected void release() {
        System.out.println("01release");
    }
}
