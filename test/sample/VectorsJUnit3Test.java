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
public class VectorsJUnit3Test extends TestCase {

    public VectorsJUnit3Test(String testName) {
        super(testName);
    }

    /**
     * Test of equal method, of class Vectors.
     */
    public void testEqual() {
        // テスト結果を識別しやすいように変更
        System.out.println("* VectorsJUnit3Test: testEqual()");
        // アサーションを追加
        assertTrue(Vectors.equal(new int[]{}, new int[]{}));
        assertTrue(Vectors.equal(new int[]{0}, new int[]{0}));
        assertTrue(Vectors.equal(new int[]{0, 0}, new int[]{0, 0}));
        assertTrue(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0, 0}));
        assertTrue(Vectors.equal(new int[]{5, 6, 7}, new int[]{5, 6, 7}));

        assertFalse(Vectors.equal(new int[]{}, new int[]{0}));
        assertFalse(Vectors.equal(new int[]{0}, new int[]{0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0}, new int[]{0, 0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0}, new int[]{0}));
        assertFalse(Vectors.equal(new int[]{0}, new int[]{}));

        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0, 1}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 1, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{1, 0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 1}, new int[]{0, 0, 3}));
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    public void testScalarMultiplication() {
        // テスト結果を識別しやすいように変更
        System.out.println("* VectorsJUnit3Test: testScalarMultiplication()");
        // テストスケルトンを除去
        // アサーションを追加
        assertEquals(0, Vectors.scalarMultiplication(new int[]{0, 0}, new int[]{0, 0}));
        assertEquals(39, Vectors.scalarMultiplication(new int[]{3, 4}, new int[]{5, 6}));
        assertEquals(-39, Vectors.scalarMultiplication(new int[]{-3, 4}, new int[]{5, -6}));
        assertEquals(0, Vectors.scalarMultiplication(new int[]{5, 9}, new int[]{-9, 5}));
        assertEquals(100, Vectors.scalarMultiplication(new int[]{6, 8}, new int[]{6, 8}));
    }

}
