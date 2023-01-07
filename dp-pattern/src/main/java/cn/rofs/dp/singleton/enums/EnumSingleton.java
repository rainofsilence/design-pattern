package cn.rofs.dp.singleton.enums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <em>EnumSingleton</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 18:32:17
 * @desc 单例模式-枚举
 */
public enum EnumSingleton {
    INSTANCE;
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void print() {
        logger.info("{}", this.hashCode());
    }
}
