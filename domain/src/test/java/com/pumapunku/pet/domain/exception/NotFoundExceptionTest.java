package com.pumapunku.pet.domain.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NotFoundExceptionTest
{
    @Test
    void createNotFoundException()
    {
        NotFoundException notFoundException = new NotFoundException("myResource", "Id1");

        assertEquals("Id1 not found!", notFoundException.getMessage());
        assertEquals("myResource", notFoundException.getResourceName());
        assertEquals("Id1", notFoundException.getId());
    }
}
