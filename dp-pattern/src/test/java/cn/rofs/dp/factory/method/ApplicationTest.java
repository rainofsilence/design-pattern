package cn.rofs.dp.factory.method;

import org.junit.jupiter.api.Test;

/**
 * <em>ApplicationTest</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 20:01:22
 * @desc
 */
class ApplicationTest {

    @Test
    void test1() {
        Application application = new ConCreateProductA();
        Product product = application.getObject();
        product.method1();
    }
}