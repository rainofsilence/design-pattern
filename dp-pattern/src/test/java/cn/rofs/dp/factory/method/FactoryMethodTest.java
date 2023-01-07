package cn.rofs.dp.factory.method;

import org.junit.jupiter.api.Test;

/**
 * <em>ApplicationTest</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 20:01:22
 * @desc
 */
class FactoryMethodTest {

    @Test
    void test1() {
        FactoryMethod factoryMethod = new ConCreateProductA();
        Product product = factoryMethod.getObject();
        product.method1();
    }
}