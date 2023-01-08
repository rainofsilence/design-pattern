package cn.rofs.dp.factory.abstracts;

/**
 * <em>IDatabaseUtils</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 13:51
 * @desc
 */
public interface IDatabaseUtils {

    /**
     * @return
     */
    IConnection getConnection();

    /**
     * @return
     */
    ICommand getCommand();
}
