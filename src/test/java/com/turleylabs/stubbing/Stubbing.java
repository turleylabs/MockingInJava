package com.turleylabs.stubbing;

import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

public class Stubbing {

    public class Foo {
        public Foo() {
            throw new RuntimeException("Bad stuff");
        }

        public String bar() {
            throw new RuntimeException("Bad stuff");
        }

        public String foobar(int arg1, String arg2) {
            throw new RuntimeException("Bad stuff");
        }

        public int calculate(LocalDate dateTime) {
            throw new RuntimeException("Bad stuff");
        }
    }

    @Test
    public void stubbingAndVerifying() {
    }
}
