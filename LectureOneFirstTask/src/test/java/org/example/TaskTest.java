package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TaskTest extends TestCase {

    @Test
    public void testCount() {
        Task task = new Task();
        int actual = task.count("0" ,"7", "12", "5");
        int expected = 25;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount1() {
        Task task = new Task();
        int actual = task.count("10000" ,"600", "10000", "600");
        int expected = 1201;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testCount2() {
        Task task = new Task();
        int actual = task.count("1000000001" ,"1000000001", "1000000001", "1000000001");
        int expected = 100000001;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount3() {
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        Task task = new Task();
        int actual = task.count("1000000001" ,"1000000001", "-1000000001", "1000000001");
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(afterUsedMem-beforeUsedMem);
        int expected = 200000001;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount4() {
        Task task = new Task();
        int actual = task.count("0" ,"0", "0", "0");
        int expected = 1;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCount5() {
        Task task = new Task();
        int actual = task.count("6" ,"3", "12", "3");
        int expected = 13;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount6() {
        Task task = new Task();
        int actual = task.count("1" ,"2", "3", "0");
        int expected = 5;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount7() {
        Task task = new Task();
        int actual = task.count("-1" ,"0", "-3", "1");
        int expected = 4;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount8() {
        Task task = new Task();
        int actual = task.count("12" ,"5", "0", "7");
        int expected = 25;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount9() {
        Task task = new Task();
        int actual = task.count("2" ,"3", "10", "3");
        int expected = 14;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount10() {
        Task task = new Task();
        int actual = task.count("-100000000" ,"100000000", "100000000", "100000000");
        int expected = 400000001;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount11() {
        Task task = new Task();
        int actual = task.count("-100000000" ,"0", "100000000", "100000000");
        int expected = 100000002;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }
}