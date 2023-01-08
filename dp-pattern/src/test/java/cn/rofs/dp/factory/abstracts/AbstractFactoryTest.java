package cn.rofs.dp.factory.abstracts;

import org.junit.jupiter.api.Test;

/**
 * <em>AbstractFactoryTest</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 13:54
 * @desc
 */
class AbstractFactoryTest {

    @Test
    void test1() {
        IDatabaseUtils iDatabaseUtils = new OracleDatabaseUtils();
        IConnection connection = iDatabaseUtils.getConnection();
        connection.connect();
        ICommand command = iDatabaseUtils.getCommand();
        command.command();
    }
}