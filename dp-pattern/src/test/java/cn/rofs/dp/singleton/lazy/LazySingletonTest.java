package cn.rofs.dp.singleton.lazy;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <em>LazySingletonTest</em>
 *
 * @author rainofsilece
 * @date 2023/01/06 23:04:16
 * @desc
 */
class LazySingletonTest {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void test1() {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        logger.info("instance1:{}", instance1.hashCode());
        logger.info("instance2:{}", instance2.hashCode());
    }

    /**
     * 多线程 单例需要加synchronized
     */
    @Test
    void test2() {
        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            logger.info("instance:{}", instance.hashCode());
        }).start();

        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            logger.info("instance:{}", instance.hashCode());
        }).start();
    }
}