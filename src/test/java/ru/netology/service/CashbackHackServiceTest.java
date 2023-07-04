package ru.netology.service;
import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain1() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback1() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain2() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback2() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }
}
