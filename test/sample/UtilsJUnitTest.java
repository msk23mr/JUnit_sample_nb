/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.concurrent.TimeoutException;
import junit.framework.TestCase;

/**
 *
 * @author mori
 */
public class UtilsJUnitTest extends TestCase {

    public UtilsJUnitTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // 実行確認用の出力
        System.out.println("* UtilsJUnit3Test: setUp() method");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        // 実行確認用の出力
        System.out.println("* UtilsJUnit3Test: tearDown() method");
    }

    // testConcatWords()を削除
    // testHelloWorld()を追加
    public void testHelloWorld() {
        // 実行確認用の出力
        System.out.println("* UtilsJUnit3Test: test method 1 - testHelloWorld()");
        // concatWords()のテスト
        assertEquals("Hello, World!", Utils.concatWords("Hello", ",", "World", "!"));
    }

    // testComputeFactorial()を削除
    // testWithTimeout()を追加
    public void testWithTimeout() throws InterruptedException, TimeoutException {
        // 実行確認用の出力
        System.out.println("* UtilsJUnit3Test: test method 2 - testWithTimeout()");
        // 1～30001までのランダムな整数
        final int factorialOf = 1 + (int) (30000 * Math.random());
        // 生成したランダム整数を出力
        System.out.println("computing: " + factorialOf + "!");

        // テストスレッド
        Thread testThread = new Thread() {
            @Override
            public void run() {
                // ランダム整数の階乗を出力
                System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            }
        };

        // テストスレッドをスタート
        testThread.start();
        // スレッドを1000ミリ秒でスリープ
        Thread.sleep(1000);
        // テストスレッドを割り込み
        testThread.interrupt();

        // テストスレッドが割り込みしたら
        if (testThread.isInterrupted()) {
            // タイムアウト例外をスロー
            throw new TimeoutException("the test took too long to complete");
        }
    }

    public void testExpectedException() {
        // 実行確認用の出力
        System.out.println("* UtilsJUnit3Test: test method 3 - testExpectedException()");
        try {
            // わざと例外をスローさせるために、負の数を定義
            final int factorialOf = -5;
            // 違法引数例外が発生するはず
            System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            // 失敗したらメッセージを出力
            fail("IllegalArgumentException was expected");
        } catch (IllegalArgumentException ex){
            // 違法引数例外が発生したら実行(今回は空)
        }

    }

    /**
     * Test of normalizeWord method, of class Utils.
     */
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
