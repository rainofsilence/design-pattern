package cn.rofs.dp.factory.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <em>ProductA</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 19:53:55
 * @desc
 */
public class ProductB implements Product{

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void method1() {
        logger.info("ProductB.method1 executed.");
    }
}
