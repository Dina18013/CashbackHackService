package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShouldReturn500Amount500() {

        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn100Amount900() {

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn800Amount1200() {

        int actual = service.remain(1200);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn300Amount1700() {

        int actual = service.remain(1700);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn0Amount1000() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}