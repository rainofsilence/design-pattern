package cn.rofs.dp.factory.abstracts;

/**
 * <em>MysqlDatabaseUtils</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 14:01
 * @desc
 */
public class MysqlDatabaseUtils implements IDatabaseUtils{
    @Override
    public IConnection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MysqlCommand();
    }
}
