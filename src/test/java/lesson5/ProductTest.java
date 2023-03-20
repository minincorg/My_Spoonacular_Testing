package lesson5;

import lesson5.api.ProductService;
import lesson5.dto.Product;
import lesson5.utils.RetrofitUtils;
import lombok.SneakyThrows;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

public class ProductTest {
    static ProductService productService;

    @BeforeAll
    static void beforeAll() {
        productService = RetrofitUtils.getRetrofit().create(ProductService.class);
    }

    @SneakyThrows
    @Test
    void postProductNegativeTest() {
        Response<Product> response = productService.createProduct("{ \"title\": \"Matcha vs Green Tea: Benefits and Recipes\", \"upc\": \"\", \"plu_code\": \"\" }").execute();

        Assert.assertThat(response.isSuccessful(), CoreMatchers.is(false));
        Assert.assertThat(response.code(), CoreMatchers.is(400));
    }
}
