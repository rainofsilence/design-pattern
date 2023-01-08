package cn.rofs.dp.factory.abstracts;

/**
 * <em>MysqlConnection</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 13:59
 * @desc
 */
public class MysqlConnection implements IConnection {

    @Override
    public void connect() {
        System.out.println("mysql connected.");
    }
}
