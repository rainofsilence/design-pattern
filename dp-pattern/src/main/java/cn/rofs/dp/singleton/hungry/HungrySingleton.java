package cn.rofs.dp.singleton.hungry;

/**
 * <em>HungrySingleton</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 11:33:26
 * @desc 单例模式-饿汉式
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
