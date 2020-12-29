package com.design.template;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 09:58
 * @Description:模板类-模拟一个开发流程
 */
public abstract class DevelopTemplate {
    protected abstract void analyze();//需求分析
    protected abstract void design();//设计
    protected abstract void develop();//开发
    protected abstract boolean test();//测试
    protected abstract void release();//发布

    /**
     * 模板方法-子类继承模板方法，不能重写
     */
    protected final void kickoff() {
        analyze();
        design();
        do {
            develop();
        } while (!test());//如果测试失败，则继续开发改Bug。
        release();
    }
}
