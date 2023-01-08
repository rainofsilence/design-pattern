package cn.rofs.dp.factory.abstracts;

/**
 * <em>OracleConnection</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 14:03
 * @desc
 */
public class OracleConnection implements IConnection{
    @Override
    public void connect() {
        System.out.println("oracle connected.");
    }
}
