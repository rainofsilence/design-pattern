package cn.rofs.dp.builder.v1;

import cn.rofs.dp.builder.v1.DefaultConCreateProductBuilder;
import cn.rofs.dp.builder.v1.Director;
import cn.rofs.dp.builder.v1.Product;
import org.junit.jupiter.api.Test;

/**
 * <em>ProductTest</em>
 *
 * @author rainofsilece
 * @date 2023/1/8 14:47
 * @desc
 */
class ProductTest {

    @Test
    void test1() {
        DefaultConCreateProductBuilder defaultConCreateProductBuilder = new DefaultConCreateProductBuilder();
        Director director = new Director(defaultConCreateProductBuilder);
        Product product = director.makeProduct("productName", "companyName", "part1", "part2", "part3", "part4");
        System.out.println(product);
    }
}