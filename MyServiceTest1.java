package com.example.mockitotest;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest1 {
	 @Test
	    public void testVerifyInteraction() {
	        // Step 1: Create mock
	        ExternalApi mockApi = mock(ExternalApi.class);

	        // Step 2: Inject into MyService
	        MyService service = new MyService(mockApi);

	        // Step 3: Call method that should trigger mock
	        service.fetchData();

	        // Step 4: Verify interaction
	        verify(mockApi).getData();  // ✅ PASS if getData() was called
	    }
}
