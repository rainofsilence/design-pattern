package cn.rofs.dp.builder.v1;


/**
 * <em>ProductBuilder</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 14:16
 * @desc 建造者模式
 */
public interface ProductBuilder {
    void builderProductName(String productName);

    void builderCompanyName(String companyName);

    void builderPart1(String part1);

    void builderPart2(String part2);

    void builderPart3(String part3);

    void builderPart4(String part4);

    Product build();
}
