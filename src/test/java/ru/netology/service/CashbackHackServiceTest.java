package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldShowRemainIfAmountIs_0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainIfAmountIs_100() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(100);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainIfAmountIs_999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainIfAmountIs_1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainIfAmountIs_1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainIfAmountIs_1300() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1300);
        int expected = 700;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainIfAmountIs_2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
