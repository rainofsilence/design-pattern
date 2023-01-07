package cn.rofs.dp.singleton.innerclass;

/**
 * <em>InnerClassSingleton</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 18:09:14
 * @desc 单例模式-静态内部类(懒加载方式)
 */
public class InnerClassSingleton {

    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {

    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }

}
