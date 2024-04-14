package org.kia.extension.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kia.extension.annotation.SimpleTest;
import org.kia.extension.converter.SampleConverter;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SimpleTest
class SampleServiceTest {
    @Mock
    private SampleConverter converter;

    private SampleService service;

    @BeforeEach
    void setUp() {
        service = new SampleService(converter);
    }

    @Test
    void ping() {
        when(converter.convert("ping")).thenReturn("ping - pong");

        var actual = service.ping();

        assertEquals("ping - pong", actual);
    }
}
