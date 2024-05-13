package ru.vtb.vkod.exampleproject.dto.response;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ExampleResponseDto {
    private Long id;
    private String name;
    private Integer value;
}
