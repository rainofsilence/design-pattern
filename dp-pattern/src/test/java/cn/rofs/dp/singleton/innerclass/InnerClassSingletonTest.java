package cn.rofs.dp.singleton.innerclass;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <em>InnerClassSingletonTest</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 18:13:01
 * @desc
 */
class InnerClassSingletonTest {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void test1() {
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        logger.info("instance1:{}", instance1.hashCode());
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
        logger.info("instance2:{}", instance2.hashCode());
    }

    @Test
    void test2() {
        new Thread(() -> {
            InnerClassSingleton instance = InnerClassSingleton.getInstance();
            logger.info("instance:{}", instance.hashCode());
        }).start();

        new Thread(() -> {
            InnerClassSingleton instance = InnerClassSingleton.getInstance();
            logger.info("instance:{}", instance.hashCode());
        }).start();
    }

}