package cn.rofs.dp.factory.method;

/**
 * <em>ConCreateProductA</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 20:05:33
 * @desc
 */
public class ConCreateProductA extends FactoryMethod {

    @Override
    Product createProduct() {
        return new ProductA();
    }
}
