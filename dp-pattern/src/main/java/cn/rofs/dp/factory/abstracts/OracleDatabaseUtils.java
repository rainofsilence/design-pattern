package cn.rofs.dp.factory.abstracts;

/**
 * <em>OracleDatabaseUtils</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 14:04
 * @desc
 */
public class OracleDatabaseUtils implements IDatabaseUtils{
    @Override
    public IConnection getConnection() {
        return new OracleConnection();
    }

    @Override
    public ICommand getCommand() {
        return new OracleCommand();
    }
}
