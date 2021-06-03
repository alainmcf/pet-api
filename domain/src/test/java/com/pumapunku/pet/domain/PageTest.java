package com.pumapunku.pet.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PageTest
{
    @Test
    void isLastFalse()
    {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six");

        Page<String> page = new Page<>(list, 1, 2);
        assertEquals(3, page.totalPages());
        assertFalse(page.isLast());
    }

    @Test
    void isLastTrue()
    {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six");

        Page<String> page = new Page<>(list, 3, 2);
        assertEquals(3, page.totalPages());
        assertTrue(page.isLast());
    }

    @Test
    void totalPages()
    {
        List<String> list = new ArrayList<>();

        Page<String> page = new Page<>(list, 1, 2);
        assertEquals(1, page.totalPages());
    }

    @Test
    void size()
    {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six");

        Page<String> page = new Page<>(list, 1, 2);
        assertEquals(6, page.size());
    }
}
