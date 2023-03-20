package lesson5.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    @JsonProperty("matched")
    private String matched;
    @JsonProperty("category")
    private String category;
    @JsonProperty("usdaCode")
    private Integer usdaCode;
}
