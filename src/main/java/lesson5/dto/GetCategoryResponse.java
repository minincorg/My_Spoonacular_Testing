package lesson5.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class GetCategoryResponse {
    @JsonProperty("sweetness")
    private Double sweetness;
    @JsonProperty("saltiness")
    private Double saltiness;
    @JsonProperty("sourness")
    private Double sourness;
    @JsonProperty("bitterness")
    private Double bitterness;
    @JsonProperty("savoriness")
    private Double savoriness;
    @JsonProperty("fattiness")
    private Double fattiness;
    @JsonProperty("spiciness")
    private Double spiciness;
   /* @JsonProperty("products")
    private List<Recipe> products = new ArrayList<>();*/
}
