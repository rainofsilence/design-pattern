package cn.rofs.dp.factory.method;

/**
 * <em>Application</em>
 *
 * @author rainofsilece
 * @date 2023/01/07 19:57:53
 * @desc 工厂方法模式
 */
abstract class Application {

    abstract Product createProduct();

    Product getObject() {
        return createProduct();
    }
}
