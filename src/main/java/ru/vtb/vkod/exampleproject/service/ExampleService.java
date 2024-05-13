package ru.vtb.vkod.exampleproject.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.vtb.vkod.exampleproject.dto.request.ExampleRequestDto;
import ru.vtb.vkod.exampleproject.dto.response.ExampleResponseDto;
import ru.vtb.vkod.exampleproject.exception.ExampleException;

import java.util.concurrent.ThreadLocalRandom;

@Log4j2
@Service
@RequiredArgsConstructor
public class ExampleService {
    public ExampleResponseDto getData(ExampleRequestDto dto) {
        execute();

        log.info("Обработка прошла успешно");
        return ExampleResponseDto.builder()
                .id(dto.id())
                .name("Example name")
                .value(42)
                .build();
    }

    private void execute() {
        ThreadLocalRandom.current().ints(0, 4)
                .findFirst()
                .ifPresent(i -> {
                    if (i == 0) throw new ExampleException("Ошибка обработки данных");
                    if (i == 1) throw new RuntimeException("Непредусмотренная ошибка");
                });
    }
}
