package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    void ShouldReturn2000Amount2000() {

        int actual = service.remain(2000);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    void ShouldReturn900Amount100() {

        int actual = service.remain(100);
        int expected = 900;

        assertEquals(actual, expected);

    }


    @Test
    void ShouldReturn500Amount500() {

        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected);

    }

    @Test
    void ShouldReturn1000Amount1000() {

        int actual = service.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    void ShouldReturn950Amount1050() {

        int actual = service.remain(1050);
        int expected = 950;

        assertEquals(actual, expected);

    }
}