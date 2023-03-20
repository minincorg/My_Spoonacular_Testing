package lesson5.api;

import lesson5.dto.GetCategoryResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CategoryService {
    @GET("recipes/{id}/tasteWidget.json?apiKey=a091d1b6d07e4aebab30ee6ce3a92441")
    Call<GetCategoryResponse> getCategory(@Path("id") int id);

}
