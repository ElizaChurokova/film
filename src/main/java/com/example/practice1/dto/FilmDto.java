package com.example.practice1.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmDto {
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 40, message = "Name should be between 2 and 40 characters")
    private String name;
    @NotEmpty(message = "Genre should not be empty")
    private String genre;
    @Min(value = 0, message = "Year of issue should be greater than 0")
    private Integer yearOfIssue;
    @NotEmpty(message = "language should not be empty")
    private String language;
}
