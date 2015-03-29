/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author mori
 */
public class JUnit3TestSuite extends TestCase {
    
    public JUnit3TestSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        // テストスイートを生成
        TestSuite suite = new TestSuite("JUnit3TestSuite");
        // 生成したテストスイートにテストクラスを追加
        suite.addTest(new TestSuite(sample.VectorsJUnit3Test.class));
        suite.addTest(new TestSuite(sample.UtilsJUnitTest.class));
        return suite;
    }
    
}
