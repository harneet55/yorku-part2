package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.stop();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.stop();
        java.lang.Class<?> wildcardClass16 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        app0.stop();
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "1) test1014(RegressionTest2)":             app0.start(stage16);
// flaky "1) test1014(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        java.lang.Class<?> wildcardClass10 = hostServices9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "2) test1021(RegressionTest2)":             app0.start(stage9);
// flaky "2) test1021(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "3) test1022(RegressionTest2)":             app0.start(stage10);
// flaky "3) test1022(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "4) test1025(RegressionTest2)":             app0.start(stage16);
// flaky "4) test1025(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        app0.init();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "5) test1027(RegressionTest2)":             app0.start(stage11);
// flaky "5) test1027(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "6) test1032(RegressionTest2)":             app0.start(stage11);
// flaky "6) test1032(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        app0.stop();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "7) test1034(RegressionTest2)":             app0.start(stage12);
// flaky "7) test1034(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "", "hi!", "MODENA", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "", "hi!", "MODENA", "MODENA", "MODENA" });
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "CASPIAN", "hi!", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "CASPIAN", "hi!", "", "MODENA" });
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "8) test1043(RegressionTest2)":             app0.start(stage10);
// flaky "8) test1043(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = parameters14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        app0.stop();
        app0.init();
        java.lang.Class<?> wildcardClass15 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        app0.stop();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification17 = null;
        app0.notifyPreloader(preloaderNotification17);
        java.lang.Class<?> wildcardClass19 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        javafx.application.Preloader.PreloaderNotification preloaderNotification17 = null;
        app0.notifyPreloader(preloaderNotification17);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "9) test1053(RegressionTest2)":             app0.start(stage13);
// flaky "9) test1053(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "", "MODENA" });
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.init();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.init();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = parameters12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "10) test1060(RegressionTest2)":             app0.start(stage10);
// flaky "10) test1060(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        java.lang.Class<?> wildcardClass11 = hostServices10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "CASPIAN", "", "CASPIAN", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "CASPIAN", "", "CASPIAN", "MODENA", "" });
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "11) test1072(RegressionTest2)":             app0.start(stage11);
// flaky "11) test1072(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "MODENA", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "MODENA", "hi!", "CASPIAN" });
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "MODENA", "hi!" });
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "CASPIAN" });
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "12) test1081(RegressionTest2)":             app0.start(stage13);
// flaky "12) test1081(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "13) test1085(RegressionTest2)":             app0.start(stage10);
// flaky "13) test1085(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        java.lang.Class<?> wildcardClass12 = hostServices11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "", "" });
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "14) test1094(RegressionTest2)":             app0.start(stage15);
// flaky "14) test1094(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "CASPIAN", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "CASPIAN", "CASPIAN", "hi!" });
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "15) test1099(RegressionTest2)":             app0.start(stage14);
// flaky "15) test1099(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "16) test1105(RegressionTest2)":             app0.start(stage13);
// flaky "16) test1105(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        java.lang.Class<?> wildcardClass16 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "17) test1115(RegressionTest2)":             app0.start(stage6);
// flaky "17) test1115(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.stop();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "18) test1118(RegressionTest2)":             app0.start(stage11);
// flaky "18) test1118(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        javafx.application.HostServices hostServices17 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification18 = null;
        app0.notifyPreloader(preloaderNotification18);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(hostServices17);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "19) test1121(RegressionTest2)":             app0.start(stage7);
// flaky "19) test1121(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "20) test1122(RegressionTest2)":             app0.start(stage12);
// flaky "20) test1122(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.init();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "21) test1125(RegressionTest2)":             app0.start(stage7);
// flaky "21) test1125(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "22) test1126(RegressionTest2)":             app0.start(stage11);
// flaky "22) test1126(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.stop();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "", "MODENA", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "", "MODENA", "", "CASPIAN" });
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "MODENA", "", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "MODENA", "", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "23) test1137(RegressionTest2)":             app0.start(stage7);
// flaky "23) test1137(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "24) test1139(RegressionTest2)":             app0.start(stage13);
// flaky "24) test1139(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "25) test1142(RegressionTest2)":             app0.start(stage11);
// flaky "25) test1142(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "", "", "hi!", "", "" });
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "MODENA", "" });
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "26) test1154(RegressionTest2)":             app0.start(stage12);
// flaky "26) test1154(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "27) test1161(RegressionTest2)":             app0.start(stage11);
// flaky "27) test1161(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "28) test1166(RegressionTest2)":             app0.start(stage15);
// flaky "28) test1166(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "", "hi!", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "", "hi!", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "29) test1168(RegressionTest2)":             app0.start(stage11);
// flaky "29) test1168(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices17 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices17);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "30) test1172(RegressionTest2)":             app0.start(stage10);
// flaky "30) test1172(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "31) test1173(RegressionTest2)":             app0.start(stage5);
// flaky "31) test1173(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = parameters14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        java.lang.Class<?> wildcardClass12 = hostServices11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "CASPIAN", "MODENA", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "CASPIAN", "MODENA", "", "CASPIAN" });
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.init();
        app0.init();
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "32) test1186(RegressionTest2)":             app0.start(stage15);
// flaky "32) test1186(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "", "", "hi!", "hi!" });
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        java.lang.Class<?> wildcardClass12 = hostServices11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "hi!", "hi!" });
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        javafx.application.HostServices hostServices17 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(hostServices17);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "33) test1203(RegressionTest2)":             app0.start(stage12);
// flaky "33) test1203(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        java.lang.Class<?> wildcardClass11 = hostServices10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification19 = null;
        app0.notifyPreloader(preloaderNotification19);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "34) test1210(RegressionTest2)":             app0.start(stage11);
// flaky "34) test1210(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.init();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "35) test1213(RegressionTest2)":             app0.start(stage12);
// flaky "35) test1213(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "CASPIAN", "MODENA", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "CASPIAN", "MODENA", "CASPIAN", "hi!" });
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        java.lang.Class<?> wildcardClass16 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        java.lang.Class<?> wildcardClass12 = hostServices11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass19 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "MODENA", "CASPIAN", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "MODENA", "CASPIAN", "", "hi!", "hi!" });
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "36) test1223(RegressionTest2)":             app0.start(stage14);
// flaky "36) test1223(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "CASPIAN", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "hi!", "CASPIAN", "", "hi!" });
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "MODENA" });
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "MODENA", "hi!" });
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = parameters17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "", "", "MODENA", "hi!" });
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "hi!", "MODENA" });
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "CASPIAN", "MODENA" });
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        java.lang.Class<?> wildcardClass10 = hostServices9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        java.lang.Class<?> wildcardClass15 = hostServices14.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification17 = null;
        app0.notifyPreloader(preloaderNotification17);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "37) test1260(RegressionTest2)":             app0.start(stage16);
// flaky "37) test1260(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        java.lang.Class<?> wildcardClass15 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "CASPIAN", "" });
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "38) test1283(RegressionTest2)":             app0.start(stage12);
// flaky "38) test1283(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "39) test1284(RegressionTest2)":             app0.start(stage10);
// flaky "39) test1284(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "40) test1291(RegressionTest2)":             app0.start(stage12);
// flaky "40) test1291(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.init();
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        javafx.application.HostServices hostServices17 = app0.getHostServices();
        javafx.application.Application.Parameters parameters18 = app0.getParameters();
        javafx.application.HostServices hostServices19 = app0.getHostServices();
        java.lang.Class<?> wildcardClass20 = hostServices19.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(hostServices17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(hostServices19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        app0.init();
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        app0.init();
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        javafx.stage.Stage stage17 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "41) test1298(RegressionTest2)":             app0.start(stage17);
// flaky "41) test1298(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "42) test1301(RegressionTest2)":             app0.start(stage10);
// flaky "42) test1301(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        app0.stop();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        javafx.application.Application.Parameters parameters18 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage20 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "43) test1318(RegressionTest2)":             app0.start(stage20);
// flaky "43) test1318(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "44) test1319(RegressionTest2)":             app0.start(stage8);
// flaky "44) test1319(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "45) test1320(RegressionTest2)":             app0.start(stage8);
// flaky "45) test1320(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "46) test1321(RegressionTest2)":             app0.start(stage11);
// flaky "46) test1321(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        app0.stop();
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "47) test1323(RegressionTest2)":             app0.start(stage14);
// flaky "47) test1323(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "48) test1324(RegressionTest2)":             app0.start(stage11);
// flaky "48) test1324(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        java.lang.Class<?> wildcardClass12 = hostServices11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "CASPIAN", "", "CASPIAN", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "CASPIAN", "", "CASPIAN", "hi!", "" });
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "CASPIAN", "hi!" });
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "MODENA", "MODENA", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "MODENA", "MODENA", "hi!", "" });
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "49) test1339(RegressionTest2)":             app0.start(stage8);
// flaky "49) test1339(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification16 = null;
        app0.notifyPreloader(preloaderNotification16);
        javafx.application.HostServices hostServices18 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(hostServices18);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "50) test1345(RegressionTest2)":             app0.start(stage16);
// flaky "50) test1345(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "51) test1348(RegressionTest2)":             app0.start(stage9);
// flaky "51) test1348(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "CASPIAN", "hi!" });
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        app0.init();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "52) test1354(RegressionTest2)":             app0.start(stage13);
// flaky "52) test1354(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "MODENA", "MODENA", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "MODENA", "MODENA", "hi!", "" });
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "CASPIAN", "", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "CASPIAN", "", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "hi!", "", "", "MODENA" });
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        app0.init();
        app0.init();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "53) test1363(RegressionTest2)":             app0.start(stage10);
// flaky "53) test1363(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "54) test1364(RegressionTest2)":             app0.start(stage13);
// flaky "54) test1364(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "CASPIAN", "" });
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.init();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        java.lang.Class<?> wildcardClass14 = hostServices13.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "55) test1372(RegressionTest2)":             app0.start(stage14);
// flaky "55) test1372(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "56) test1376(RegressionTest2)":             app0.start(stage9);
// flaky "56) test1376(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        javafx.application.HostServices hostServices17 = app0.getHostServices();
        javafx.stage.Stage stage18 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "57) test1377(RegressionTest2)":             app0.start(stage18);
// flaky "57) test1377(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(hostServices17);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        app0.stop();
        app0.init();
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "58) test1380(RegressionTest2)":             app0.start(stage9);
// flaky "58) test1380(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.stop();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "59) test1397(RegressionTest2)":             app0.start(stage10);
// flaky "59) test1397(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "60) test1398(RegressionTest2)":             app0.start(stage11);
// flaky "60) test1398(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = hostServices7.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "MODENA", "", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "MODENA", "", "MODENA", "MODENA" });
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "61) test1405(RegressionTest2)":             app0.start(stage14);
// flaky "61) test1405(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "hi!", "", "" });
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "62) test1410(RegressionTest2)":             app0.start(stage11);
// flaky "62) test1410(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        javafx.application.Preloader.PreloaderNotification preloaderNotification17 = null;
        app0.notifyPreloader(preloaderNotification17);
        javafx.application.HostServices hostServices19 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices19);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "63) test1414(RegressionTest2)":             app0.start(stage16);
// flaky "63) test1414(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "64) test1416(RegressionTest2)":             app0.start(stage10);
// flaky "64) test1416(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = parameters14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "65) test1423(RegressionTest2)":             app0.start(stage10);
// flaky "65) test1423(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "66) test1427(RegressionTest2)":             app0.start(stage6);
// flaky "66) test1427(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "MODENA", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "MODENA", "", "CASPIAN" });
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "67) test1433(RegressionTest2)":             app0.start(stage14);
// flaky "67) test1433(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        app0.init();
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "68) test1438(RegressionTest2)":             app0.start(stage13);
// flaky "68) test1438(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        javafx.stage.Stage stage18 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "69) test1439(RegressionTest2)":             app0.start(stage18);
// flaky "69) test1439(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "70) test1440(RegressionTest2)":             app0.start(stage12);
// flaky "70) test1440(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "MODENA", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "MODENA", "hi!", "" });
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "MODENA", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "MODENA", "hi!", "MODENA" });
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "CASPIAN", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "CASPIAN", "", "" });
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "71) test1466(RegressionTest2)":             app0.start(stage10);
// flaky "71) test1466(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "72) test1467(RegressionTest2)":             app0.start(stage15);
// flaky "72) test1467(RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        java.lang.Class<?> wildcardClass15 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        java.lang.Class<?> wildcardClass15 = hostServices14.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification18 = null;
        app0.notifyPreloader(preloaderNotification18);
        javafx.application.Preloader.PreloaderNotification preloaderNotification20 = null;
        app0.notifyPreloader(preloaderNotification20);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "hi!", "MODENA", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "hi!", "MODENA", "MODENA", "" });
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.stop();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.stop();
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "MODENA", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "MODENA", "MODENA", "" });
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }
}
