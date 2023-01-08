package cn.rofs.dp.factory.abstracts;

/**
 * <em>MysqlCommand</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 14:00
 * @desc
 */
public class MysqlCommand implements ICommand {

    @Override
    public void command() {
        System.out.println("mysql command.");
    }
}
