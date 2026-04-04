package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "CASPIAN", "", "", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "CASPIAN", "", "", "MODENA", "hi!" });
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parameters6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        java.lang.Class<?> wildcardClass11 = hostServices10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        app0.stop();
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.init();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        javafx.application.Application.Parameters parameters19 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification18 = null;
        app0.notifyPreloader(preloaderNotification18);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "", "hi!", "MODENA", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "", "hi!", "MODENA", "hi!", "hi!" });
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "1) test1528(RegressionTest3)":             app0.start(stage8);
// flaky "1) test1528(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "2) test1530(RegressionTest3)":             app0.start(stage11);
// flaky "2) test1530(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices15);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        java.lang.Class<?> wildcardClass15 = hostServices14.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!", "hi!", "MODENA" });
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        app0.init();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        app0.init();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        app0.init();
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices15);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.stop();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "CASPIAN", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "CASPIAN", "", "hi!" });
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "3) test1559(RegressionTest3)":             app0.start(stage10);
// flaky "3) test1559(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "", "", "CASPIAN", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "", "", "CASPIAN", "hi!", "MODENA" });
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "MODENA", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "MODENA", "hi!", "" });
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        app0.stop();
        javafx.application.Application.Parameters parameters17 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "4) test1586(RegressionTest3)":             app0.start(stage12);
// flaky "4) test1586(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        javafx.application.HostServices hostServices18 = app0.getHostServices();
        javafx.application.HostServices hostServices19 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(hostServices18);
        org.junit.Assert.assertNotNull(hostServices19);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        javafx.application.HostServices hostServices19 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(hostServices19);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "MODENA", "", "hi!", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "MODENA", "", "hi!", "CASPIAN", "" });
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "5) test1609(RegressionTest3)":             app0.start(stage12);
// flaky "5) test1609(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "CASPIAN" });
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "6) test1614(RegressionTest3)":             app0.start(stage11);
// flaky "6) test1614(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        java.lang.Class<?> wildcardClass6 = hostServices5.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        java.lang.Class<?> wildcardClass15 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        app0.stop();
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "7) test1631(RegressionTest3)":             app0.start(stage14);
// flaky "7) test1631(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "8) test1632(RegressionTest3)":             app0.start(stage15);
// flaky "8) test1632(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "9) test1636(RegressionTest3)":             app0.start(stage13);
// flaky "9) test1636(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "CASPIAN", "CASPIAN", "MODENA", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "CASPIAN", "CASPIAN", "MODENA", "MODENA", "hi!" });
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "10) test1638(RegressionTest3)":             app0.start(stage15);
// flaky "10) test1638(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "", "MODENA", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "", "MODENA", "hi!", "MODENA" });
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "CASPIAN", "hi!", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "CASPIAN", "hi!", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "11) test1643(RegressionTest3)":             app0.start(stage15);
// flaky "11) test1643(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "12) test1646(RegressionTest3)":             app0.start(stage11);
// flaky "12) test1646(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "13) test1649(RegressionTest3)":             app0.start(stage7);
// flaky "13) test1649(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "CASPIAN", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "CASPIAN", "hi!", "" });
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        java.lang.Class<?> wildcardClass13 = hostServices12.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification16 = null;
        app0.notifyPreloader(preloaderNotification16);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "14) test1657(RegressionTest3)":             app0.start(stage14);
// flaky "14) test1657(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        java.lang.Class<?> wildcardClass10 = hostServices9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "MODENA", "MODENA", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "MODENA", "MODENA", "", "" });
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "15) test1667(RegressionTest3)":             app0.start(stage13);
// flaky "15) test1667(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        javafx.application.Application.Parameters parameters19 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification20 = null;
        app0.notifyPreloader(preloaderNotification20);
        javafx.stage.Stage stage22 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "16) test1670(RegressionTest3)":             app0.start(stage22);
// flaky "16) test1670(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "17) test1672(RegressionTest3)":             app0.start(stage9);
// flaky "17) test1672(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "18) test1674(RegressionTest3)":             app0.start(stage13);
// flaky "18) test1674(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = parameters14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
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
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        app0.init();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "19) test1683(RegressionTest3)":             app0.start(stage13);
// flaky "19) test1683(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "20) test1684(RegressionTest3)":             app0.start(stage10);
// flaky "20) test1684(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "21) test1685(RegressionTest3)":             app0.start(stage10);
// flaky "21) test1685(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        app0.init();
        javafx.application.Application.Parameters parameters21 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices15);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "22) test1694(RegressionTest3)":             app0.start(stage11);
// flaky "22) test1694(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        app0.stop();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "23) test1701(RegressionTest3)":             app0.start(stage13);
// flaky "23) test1701(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass16 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification15 = null;
        app0.notifyPreloader(preloaderNotification15);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "hi!", "" });
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        javafx.application.Application.Parameters parameters19 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "CASPIAN", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "CASPIAN", "", "", "", "hi!" });
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        app0.stop();
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "24) test1719(RegressionTest3)":             app0.start(stage12);
// flaky "24) test1719(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        app0.stop();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "MODENA", "hi!", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "MODENA", "hi!", "CASPIAN", "MODENA" });
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        app0.init();
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
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "MODENA", "" });
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        app0.init();
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
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        app0.stop();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "25) test1735(RegressionTest3)":             app0.start(stage11);
// flaky "25) test1735(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "26) test1736(RegressionTest3)":             app0.start(stage12);
// flaky "26) test1736(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "27) test1738(RegressionTest3)":             app0.start(stage14);
// flaky "27) test1738(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        app0.init();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "28) test1743(RegressionTest3)":             app0.start(stage10);
// flaky "28) test1743(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "CASPIAN", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "CASPIAN", "hi!", "CASPIAN" });
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        app0.init();
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "29) test1751(RegressionTest3)":             app0.start(stage15);
// flaky "29) test1751(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        app0.stop();
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(hostServices14);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.application.Preloader.PreloaderNotification preloaderNotification16 = null;
        app0.notifyPreloader(preloaderNotification16);
        app0.stop();
        javafx.application.HostServices hostServices19 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices19);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        app0.stop();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        app0.init();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification17 = null;
        app0.notifyPreloader(preloaderNotification17);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        java.lang.Class<?> wildcardClass13 = hostServices12.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "30) test1763(RegressionTest3)":             app0.start(stage10);
// flaky "30) test1763(RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parameters6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices8);
    }
}
