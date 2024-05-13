package ru.vtb.vkod.exampleproject.controller;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ResponseWrapper<T> {
    private T data;
    private String message;
    private String error;
}
