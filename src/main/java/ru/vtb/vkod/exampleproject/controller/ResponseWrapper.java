package ru.vtb.vkod.exampleproject.controller;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ResponseWrapper<T> {
    @Builder.Default
    private Integer code = 200;
    @Builder.Default
    private Boolean success = true;
    private T data;
    private String message;
    private String error;
}
