package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnNull() {
        int actual = service.remain(1000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn100() {
        int actual = service.remain(900);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }
}



