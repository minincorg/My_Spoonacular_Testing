package lesson5.api;

import lesson5.dto.Product;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProductService {

    @POST("food/products/classify?apiKey=a091d1b6d07e4aebab30ee6ce3a92441")
    Call<Product> createProduct(@Body String createProductRequest);

}
