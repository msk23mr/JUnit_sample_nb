/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author mori
 */
public class UtilsJUnitTest {

    public UtilsJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        // 実行確認出力
        System.out.println("* UtilsJUnit4Test: @BeforeClass method");
    }

    @AfterClass
    public static void tearDownClass() {
        // 実行確認出力
        System.out.println("* UtilsJUnit4Test: @AfterClass method");
    }

    @Before
    public void setUp() {
        // 実行確認出力
        System.out.println("* UtilsJUnit4Test: @Before method");
    }

    @After
    public void tearDown() {
        // 実行確認出力
        System.out.println("* UtilsJUnit4Test: @After method");
    }

    // testConcatWords()を削除
    // helloWorldCheck()を追加
    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void helloWorldCheck() {
        // 実行確認出力
        System.out.println("* UtilsJUnit4Test: test method 1 - helloWorldCheck()");
        // アサーションを追加
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }

    // testComputeFactorial()を削除
    // testWithTimeout()を追加
    @Test(timeout = 1000)
    public void testWithTimeout() {
        // 実行確認出力
        System.out.println("* UtilsJUnit4Test: test method 2 - testWithTimeout()");
        // 1～30001のランダム整数を生成
        final int factorialOf = 1 + (int) (30000 * Math.random());
        // 生成したランダム整数を出力
        System.out.println("computing " + factorialOf + '!');
        // ランダム整数の階乗を算出・出力
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }

    // checkExpectedException()を追加
    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {
        // 実行確認出力
        System.out.println("* UtilsJUnit4Test: test method 3 - checkExpectedException()");
        // 負数
        final int factorialOf = -5;
        // computeFactorial()の引数として負数を指定することで、引数違反例外をスローさせます
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }

    // testNormalizeWord()を削除
    // テストの無効化を試します
    @Ignore
    @Test
    public void temporarilyDisabledTest() {
        // 実行確認出力
        System.out.println("* UtilsJUnit4Test: test method 4 - checkExpectedException()");
        // アサーションを追加
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }

}
