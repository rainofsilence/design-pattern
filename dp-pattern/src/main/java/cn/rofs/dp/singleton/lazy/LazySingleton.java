package cn.rofs.dp.singleton.lazy;

/**
 * <em>LazySingleton</em>
 *
 * @author rainofsilece
 * @date 2023/01/06 22:59:39
 * @desc 单例模式-懒汉式
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
