package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TaskTest extends TestCase {

    @Test
    public void testCount() {
        Task task = new Task();
        int actual = task.count("0:0" ,"0:0", 1);
        int expected = 1;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount1() {
        Task task = new Task();
        int actual = task.count("0:2" ,"0:3", 1);
        int expected = 5;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount2() {
        Task task = new Task();
        int actual = task.count("0:2" ,"0:3", 2);
        int expected = 6;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount3() {
        Task task = new Task();
        int actual = task.count("0:2" ,"5:3", 1);
        int expected = 0;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount4() {
        Task task = new Task();
        int actual = task.count("2:2" ,"1:1", 1);
        int expected = 1;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount5() {
        Task task = new Task();
        int actual = task.count("2:2" ,"1:1", 2);
        int expected = 0;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount6() {
        Task task = new Task();
        int actual = task.count("0:2" ,"6:3", 1);
        int expected = 0;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount7() {
        Task task = new Task();
        int actual = task.count("4:3" ,"2:0", 1);
        int expected = 0;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount8() {
        Task task = new Task();
        int actual = task.count("3:4" ,"0:2", 2);
        int expected = 3;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount9() {
        Task task = new Task();
        int actual = task.count("4:3" ,"0:3", 2);
        int expected = 2;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount10() {
        Task task = new Task();
        int actual = task.count("5:4" ,"3:0", 2);
        int expected = 0;

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }
}