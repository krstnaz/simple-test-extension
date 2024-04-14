package org.kia.extension.service;

import lombok.RequiredArgsConstructor;
import org.kia.extension.converter.SampleConverter;

@RequiredArgsConstructor
public class SampleService {
    private final SampleConverter converter;

    String ping() {
        return converter.convert("ping");
    }
}
