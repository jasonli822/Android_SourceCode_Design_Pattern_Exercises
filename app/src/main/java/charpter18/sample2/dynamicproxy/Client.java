package charpter18.sample2.dynamicproxy;

import java.lang.reflect.Proxy;

import charpter18.sample2.ILawsuit;
import charpter18.sample2.XiaoMin;

/**
 * Created by jasonli822 on 2016/5/18.
 */
public class Client {
    public static void main(String[] args) {
        // 构建一个小民
        ILawsuit xiaomin = new XiaoMin();

        // 构建一个动态代理
        DynamicProxy proxy = new DynamicProxy(xiaomin);

        // 获取被代理类小民的ClassLoader
        ClassLoader loader = xiaomin.getClass().getClassLoader();

        // 动态构建一个代理者律师
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader,new Class[] {ILawsuit.class}, proxy);

        // 律师提交诉讼申请
        lawyer.submit();

        // 律师进行举证
        lawyer.burden();

        // 律师代替小民进行辩护
        lawyer.defend();

        // 完成诉讼
        lawyer.finish();
    }
}
