package ru.vtb.vkod.exampleproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vtb.vkod.exampleproject.dto.request.ExampleRequestDto;
import ru.vtb.vkod.exampleproject.dto.response.ExampleResponseDto;
import ru.vtb.vkod.exampleproject.service.ExampleService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/example")
public class ExampleController {
    private final ExampleService exampleService;

    @PostMapping("data")
    public ResponseWrapper<ExampleResponseDto> getData(@RequestBody ExampleRequestDto dto) {
        ExampleResponseDto data = exampleService.getData(dto);

        return ResponseWrapper.<ExampleResponseDto>builder()
                .data(data)
                .message("Обработка прошла успешно")
                .build();
    }
}
