package org.kia.extension.annotation;

import org.junit.jupiter.api.extension.ExtendWith;
import org.kia.extension.processor.MarkMockExtension;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith({MarkMockExtension.class, MockitoExtension.class})
public @interface SimpleTest {
}
