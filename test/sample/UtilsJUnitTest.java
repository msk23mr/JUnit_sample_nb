/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

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

    /**
     * Test of computeFactorial method, of class Utils.
     */
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        int number = 0;
        String expResult = "";
        String result = Utils.computeFactorial(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
