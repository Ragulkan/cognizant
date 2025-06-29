package com.example.mockitotest;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testFetchDataReturnsMockedValue() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mocked Data");

        // Step 3: Inject into service
        MyService service = new MyService(mockApi);

        // Step 4: Call and assert
        String result = service.fetchData();
        assertEquals("Mocked Data", result);
    }
}

