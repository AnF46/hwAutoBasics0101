package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService cash = new CashbackHackService();

    @Test
    public void TopBoundaryTest() {

        int actual = cash.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void AmountBelowBoundaryTest() {

        int actual = cash.remain(800);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void AlmostTopBoundaryTest() {

        int actual = cash.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ZeroAmountTest() {

        int actual = cash.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

}
