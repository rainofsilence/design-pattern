package cn.rofs.dp.singleton.enums;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <em>EnumSingletonTest</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 18:35:23
 * @desc
 */
class EnumSingletonTest {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void tes1() {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        logger.info("instance1 == instance2, {}", instance1 == instance2);
    }
}