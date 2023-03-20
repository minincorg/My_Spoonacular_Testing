package lesson5;

import lesson5.api.CategoryService;
import lesson5.dto.GetCategoryResponse;
import lesson5.utils.RetrofitUtils;
import lombok.SneakyThrows;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import static org.hamcrest.CoreMatchers.equalTo;

public class GetCategoryTest {
    static CategoryService categoryService;

    @BeforeAll
    static void beforeAll() {
        categoryService = RetrofitUtils.getRetrofit().create(CategoryService.class);
    }

    @SneakyThrows
    @Test
    void getCategoryByIdPositiveTest() {
        Response<GetCategoryResponse> response = categoryService.getCategory(69095).execute();

        Assert.assertThat(response.isSuccessful(), CoreMatchers.is(true));
        Assert.assertThat(response.code(), CoreMatchers.is(200));
        MatcherAssert.assertThat(response.body().getSweetness(), equalTo(48.35));
        MatcherAssert.assertThat(response.body().getSaltiness(), equalTo(45.48));
        MatcherAssert.assertThat(response.body().getSourness(), equalTo(15.66));
        MatcherAssert.assertThat(response.body().getBitterness(), equalTo(19.25));
        MatcherAssert.assertThat(response.body().getSavoriness(), equalTo(26.56));
        MatcherAssert.assertThat(response.body().getFattiness(), equalTo(100.0));
        MatcherAssert.assertThat(response.body().getSpiciness(), equalTo(0.0));
    }

    @SneakyThrows
    @Test
    void getCategoryByIdPositiveTest1() {
        Response<GetCategoryResponse> response = categoryService.getCategory(417198).execute();

        Assert.assertThat(response.isSuccessful(), CoreMatchers.is(true));
        Assert.assertThat(response.code(), CoreMatchers.is(200));
        MatcherAssert.assertThat(response.body().getSweetness(), equalTo(100.0));
        MatcherAssert.assertThat(response.body().getSaltiness(), equalTo(12.77));
        MatcherAssert.assertThat(response.body().getSourness(), equalTo(22.08));
        MatcherAssert.assertThat(response.body().getBitterness(), equalTo(13.29));
        MatcherAssert.assertThat(response.body().getSavoriness(), equalTo(9.48));
        MatcherAssert.assertThat(response.body().getFattiness(), equalTo(35.19));
        MatcherAssert.assertThat(response.body().getSpiciness(), equalTo(0.0));
    }
}
