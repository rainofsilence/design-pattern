package cn.rofs.dp.factory.abstracts;

/**
 * <em>OracleCommand</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 14:04
 * @desc
 */
public class OracleCommand implements ICommand{
    @Override
    public void command() {
        System.out.println("oracle command.");
    }
}
