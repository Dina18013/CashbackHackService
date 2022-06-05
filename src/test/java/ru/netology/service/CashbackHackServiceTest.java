package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn300Amount1700() {

        int expected = 300;
        int actual = service.remain(1700);

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldReturn500Amount500() {

        int expected = 500;
        int actual = service.remain(500);

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldReturn100Amount900() {

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldReturn800Amount1200() {

        int expected = 800;
        int actual = service.remain(1200);

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldReturn0Amount1000() {

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);

    }

}