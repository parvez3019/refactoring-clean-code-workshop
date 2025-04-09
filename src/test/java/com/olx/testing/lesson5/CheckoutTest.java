package com.olx.testing.lesson5;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckoutTest {

    @Test
    public void testCalculateTotal() {
        PriceService mockPriceService = mock(PriceService.class);
        when(mockPriceService.getPrice("p1")).thenReturn(10.0);

        Checkout checkout = new Checkout(mockPriceService);
        double total = checkout.calculateTotal("p1", 3);

        assertEquals(30.0, total);
    }

}

/* Understanding Mocking And Stubbing -
 * In software testing, stubbing focuses on providing predefined responses to specific inputs,
 * while mocking is used to verify interactions and behavior of components,
 * allowing for deeper testing and validation of expected interactions.
 *
 *
 *

*  Here's a more detailed breakdown:

Stubs:

* Purpose:
    Stubs are used to simulate the behavior of external dependencies or objects, providing predefined responses to specific inputs.

* Focus:
    They focus on providing a simple, controlled output, often used for isolating specific functionality or skipping calls to external services.

Example:
    A stub for a database might return a predefined set of data instead of querying a real database.

Use Cases:
- Testing specific functionality without external dependencies.
- Isolating code for unit testing.
- Providing simple, predictable responses.

Advantages:
- Simple to implement and use.
- Fast and efficient.

Disadvantages:
- Lacks the ability to verify interactions or behavior.
- Not suitable for complex scenarios where interaction verification is needed.


Mocks:

Purpose:
    Mocks are used to simulate the behavior of external dependencies, but they also allow you to verify interactions and behavior during testing.

Focus:
    They focus on validating that specific methods are called, with the correct parameters, and in the correct order.

Example:
- A mock for a network service might verify that a specific method was called with the expected parameters, and in the expected order.

Use Cases:
- Testing interactions between different parts of the system.
- Verifying that methods are called correctly.
- Testing complex scenarios where interaction verification is needed.

Advantages:
- Allow for verification of interactions and behavior.
- Useful for testing complex scenarios.

Disadvantages:
- Can be more complex to implement and maintain.
- Over-reliance on mocks can lead to brittle tests.

 *
 *
 * */

