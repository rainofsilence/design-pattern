package cn.rofs.dp.singleton.hungry;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <em>HungrySingletonTest</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 11:35:02
 * @desc
 */
class HungrySingletonTest {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void test1() {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        logger.info("instance1:{}", instance1.hashCode());
        HungrySingleton instance2 = HungrySingleton.getInstance();
        logger.info("instance2:{}", instance2.hashCode());
    }

}