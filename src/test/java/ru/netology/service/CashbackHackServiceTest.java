package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService cash = new CashbackHackService();

    @Test
    public void MiddleRangeAmountTest(){

        int expected = 300;
        int actual = cash.remain(700);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AlmostTopBoundaryAmountTest(){

        int expected = 1;
        int actual = cash.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void NegativeTest() {

        int expected = 0;
        int actual = cash.remain(1200);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TopBoundaryTest() {

        int expected = 0;
        int actual = cash.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void BelowBoundaryTest() {

        int expected = 1000;
        int actual = cash.remain(-100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void LowBoundaryTest() {

        int expected = 999;
        int actual = cash.remain(1);

        Assert.assertEquals(expected, actual);
    }

}
