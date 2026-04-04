package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "1) test0502(RegressionTest1)":             app0.start(stage12);
// flaky "1) test0502(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MODENA", "hi!", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "MODENA", "hi!", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = hostServices7.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "2) test0505(RegressionTest1)":             app0.start(stage11);
// flaky "2) test0505(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.init();
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "3) test0507(RegressionTest1)":             app0.start(stage8);
// flaky "3) test0507(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "MODENA", "hi!", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "MODENA", "hi!", "CASPIAN", "hi!" });
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!", "MODENA", "hi!" });
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "4) test0511(RegressionTest1)":             app0.start(stage8);
// flaky "4) test0511(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "CASPIAN", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "CASPIAN", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "MODENA", "CASPIAN", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "MODENA", "CASPIAN", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!", "CASPIAN" });
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "5) test0516(RegressionTest1)":             app0.start(stage8);
// flaky "5) test0516(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "6) test0518(RegressionTest1)":             app0.start(stage12);
// flaky "6) test0518(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "7) test0519(RegressionTest1)":             app0.start(stage8);
// flaky "7) test0519(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        app0.init();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "8) test0524(RegressionTest1)":             app0.start(stage12);
// flaky "8) test0524(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = hostServices7.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        app0.init();
        app0.init();
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "9) test0527(RegressionTest1)":             app0.start(stage9);
// flaky "9) test0527(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "10) test0528(RegressionTest1)":             app0.start(stage11);
// flaky "10) test0528(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = hostServices7.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "", "", "CASPIAN", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "", "", "CASPIAN", "", "MODENA" });
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "11) test0534(RegressionTest1)":             app0.start(stage10);
// flaky "11) test0534(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.lang.Class<?> wildcardClass15 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "hi!", "hi!", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "hi!", "hi!", "CASPIAN", "" });
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "12) test0541(RegressionTest1)":             app0.start(stage13);
// flaky "12) test0541(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "hi!", "hi!", "CASPIAN", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "hi!", "hi!", "CASPIAN", "hi!", "CASPIAN" });
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "", "CASPIAN", "", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "", "CASPIAN", "", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "", "MODENA", "", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "", "MODENA", "", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "MODENA", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "MODENA", "CASPIAN", "hi!" });
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "13) test0550(RegressionTest1)":             app0.start(stage7);
// flaky "13) test0550(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "14) test0555(RegressionTest1)":             app0.start(stage6);
// flaky "14) test0555(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        java.lang.Class<?> wildcardClass10 = hostServices9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "hi!", "hi!", "MODENA", "" });
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "15) test0559(RegressionTest1)":             app0.start(stage15);
// flaky "15) test0559(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "16) test0560(RegressionTest1)":             app0.start(stage7);
// flaky "16) test0560(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "17) test0562(RegressionTest1)":             app0.start(stage11);
// flaky "17) test0562(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "18) test0564(RegressionTest1)":             app0.start(stage8);
// flaky "18) test0564(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "19) test0566(RegressionTest1)":             app0.start(stage9);
// flaky "19) test0566(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        java.lang.Class<?> wildcardClass12 = hostServices11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "20) test0568(RegressionTest1)":             app0.start(stage10);
// flaky "20) test0568(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "MODENA", "MODENA" });
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "hi!", "MODENA", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "hi!", "MODENA", "", "MODENA" });
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "21) test0573(RegressionTest1)":             app0.start(stage10);
// flaky "21) test0573(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "MODENA", "hi!", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "MODENA", "hi!", "CASPIAN", "hi!" });
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "22) test0578(RegressionTest1)":             app0.start(stage12);
// flaky "22) test0578(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "CASPIAN", "", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "CASPIAN", "", "", "CASPIAN" });
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "hi!", "" });
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        app0.init();
        java.lang.Class<?> wildcardClass16 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.init();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        java.lang.Class<?> wildcardClass11 = hostServices10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "23) test0586(RegressionTest1)":             app0.start(stage12);
// flaky "23) test0586(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.init();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        app0.stop();
        javafx.stage.Stage stage17 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "24) test0588(RegressionTest1)":             app0.start(stage17);
// flaky "24) test0588(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = hostServices6.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "25) test0591(RegressionTest1)":             app0.start(stage15);
// flaky "25) test0591(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass4 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "CASPIAN", "hi!", "MODENA", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "CASPIAN", "hi!", "MODENA", "CASPIAN", "" });
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = parameters3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "26) test0600(RegressionTest1)":             app0.start(stage13);
// flaky "26) test0600(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        app0.init();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "27) test0604(RegressionTest1)":             app0.start(stage8);
// flaky "27) test0604(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "28) test0606(RegressionTest1)":             app0.start(stage10);
// flaky "28) test0606(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        java.lang.Class<?> wildcardClass15 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "29) test0614(RegressionTest1)":             app0.start(stage8);
// flaky "29) test0614(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        java.lang.Class<?> wildcardClass10 = hostServices9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "30) test0618(RegressionTest1)":             app0.start(stage11);
// flaky "30) test0618(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "31) test0621(RegressionTest1)":             app0.start(stage15);
// flaky "31) test0621(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
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
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "MODENA", "MODENA", "", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "MODENA", "MODENA", "", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "32) test0628(RegressionTest1)":             app0.start(stage10);
// flaky "32) test0628(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "MODENA", "MODENA", "", "MODENA", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "MODENA", "MODENA", "", "MODENA", "CASPIAN" });
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "CASPIAN", "MODENA", "MODENA", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "CASPIAN", "MODENA", "MODENA", "hi!", "MODENA" });
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "33) test0639(RegressionTest1)":             app0.start(stage9);
// flaky "33) test0639(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "", "hi!", "" });
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        app0.init();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        app0.init();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "34) test0644(RegressionTest1)":             app0.start(stage11);
// flaky "34) test0644(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "", "CASPIAN", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "", "CASPIAN", "", "hi!" });
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "35) test0646(RegressionTest1)":             app0.start(stage9);
// flaky "35) test0646(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        app0.init();
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "36) test0649(RegressionTest1)":             app0.start(stage5);
// flaky "36) test0649(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "37) test0650(RegressionTest1)":             app0.start(stage6);
// flaky "37) test0650(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "", "MODENA", "hi!" });
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "CASPIAN", "", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "CASPIAN", "", "hi!", "CASPIAN" });
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "", "MODENA", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "", "MODENA", "hi!", "CASPIAN" });
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "MODENA", "hi!" });
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.stop();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "38) test0669(RegressionTest1)":             app0.start(stage13);
// flaky "38) test0669(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "39) test0670(RegressionTest1)":             app0.start(stage11);
// flaky "39) test0670(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "40) test0673(RegressionTest1)":             app0.start(stage9);
// flaky "40) test0673(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "41) test0676(RegressionTest1)":             app0.start(stage14);
// flaky "41) test0676(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "CASPIAN", "MODENA", "CASPIAN", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "CASPIAN", "MODENA", "CASPIAN", "MODENA", "hi!" });
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "42) test0679(RegressionTest1)":             app0.start(stage10);
// flaky "42) test0679(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        app0.stop();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "43) test0681(RegressionTest1)":             app0.start(stage10);
// flaky "43) test0681(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "44) test0682(RegressionTest1)":             app0.start(stage7);
// flaky "44) test0682(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "MODENA", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "", "MODENA", "MODENA", "hi!" });
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "hi!", "MODENA", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "hi!", "MODENA", "hi!", "MODENA" });
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "45) test0686(RegressionTest1)":             app0.start(stage11);
// flaky "45) test0686(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "" });
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "46) test0688(RegressionTest1)":             app0.start(stage15);
// flaky "46) test0688(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        app0.stop();
        javafx.application.Application.Parameters parameters18 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "MODENA", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "MODENA", "", "hi!" });
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "hi!", "hi!", "" });
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "CASPIAN", "", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "CASPIAN", "", "CASPIAN", "" });
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        app0.stop();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "47) test0712(RegressionTest1)":             app0.start(stage9);
// flaky "47) test0712(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = hostServices6.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "CASPIAN", "", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "CASPIAN", "", "hi!", "CASPIAN" });
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        app0.init();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
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
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "48) test0727(RegressionTest1)":             app0.start(stage5);
// flaky "48) test0727(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "MODENA", "hi!", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "MODENA", "hi!", "CASPIAN", "hi!" });
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.init();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "49) test0736(RegressionTest1)":             app0.start(stage11);
// flaky "49) test0736(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "50) test0737(RegressionTest1)":             app0.start(stage7);
// flaky "50) test0737(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.stage.Stage stage4 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "51) test0742(RegressionTest1)":             app0.start(stage4);
// flaky "51) test0742(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "hi!", "MODENA", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "hi!", "MODENA", "hi!", "MODENA" });
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "52) test0744(RegressionTest1)":             app0.start(stage15);
// flaky "52) test0744(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "53) test0745(RegressionTest1)":             app0.start(stage14);
// flaky "53) test0745(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "54) test0750(RegressionTest1)":             app0.start(stage12);
// flaky "54) test0750(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        app0.stop();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = hostServices7.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        javafx.application.Application.Parameters parameters16 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "MODENA", "MODENA", "CASPIAN", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "MODENA", "MODENA", "CASPIAN", "hi!", "CASPIAN" });
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        app0.init();
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "55) test0758(RegressionTest1)":             app0.start(stage15);
// flaky "55) test0758(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "MODENA", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "MODENA", "hi!", "" });
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "56) test0765(RegressionTest1)":             app0.start(stage9);
// flaky "56) test0765(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "MODENA", "CASPIAN", "hi!", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "MODENA", "CASPIAN", "hi!", "CASPIAN", "" });
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "MODENA", "MODENA", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "MODENA", "MODENA", "", "" });
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "57) test0771(RegressionTest1)":             app0.start(stage16);
// flaky "57) test0771(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "58) test0772(RegressionTest1)":             app0.start(stage16);
// flaky "58) test0772(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "", "CASPIAN", "hi!", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "", "CASPIAN", "hi!", "CASPIAN", "" });
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        javafx.application.HostServices hostServices18 = app0.getHostServices();
        javafx.application.Application.Parameters parameters19 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(hostServices17);
        org.junit.Assert.assertNotNull(hostServices18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "MODENA", "CASPIAN", "hi!", "MODENA", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "MODENA", "CASPIAN", "hi!", "MODENA", "CASPIAN" });
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "59) test0780(RegressionTest1)":             app0.start(stage8);
// flaky "59) test0780(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "MODENA", "MODENA" });
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "60) test0782(RegressionTest1)":             app0.start(stage9);
// flaky "60) test0782(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "61) test0783(RegressionTest1)":             app0.start(stage10);
// flaky "61) test0783(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "62) test0784(RegressionTest1)":             app0.start(stage13);
// flaky "62) test0784(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "63) test0785(RegressionTest1)":             app0.start(stage11);
// flaky "63) test0785(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        app0.init();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "64) test0786(RegressionTest1)":             app0.start(stage13);
// flaky "64) test0786(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "MODENA", "", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "MODENA", "", "MODENA", "" });
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "65) test0790(RegressionTest1)":             app0.start(stage5);
// flaky "65) test0790(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "66) test0791(RegressionTest1)":             app0.start(stage16);
// flaky "66) test0791(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "67) test0792(RegressionTest1)":             app0.start(stage12);
// flaky "67) test0792(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "68) test0795(RegressionTest1)":             app0.start(stage8);
// flaky "68) test0795(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "69) test0796(RegressionTest1)":             app0.start(stage8);
// flaky "69) test0796(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        app0.stop();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "", "", "MODENA" });
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.application.Preloader.PreloaderNotification preloaderNotification16 = null;
        app0.notifyPreloader(preloaderNotification16);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "MODENA", "hi!" });
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "70) test0805(RegressionTest1)":             app0.start(stage11);
// flaky "70) test0805(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "71) test0809(RegressionTest1)":             app0.start(stage13);
// flaky "71) test0809(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        app0.init();
        app0.stop();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "72) test0810(RegressionTest1)":             app0.start(stage7);
// flaky "72) test0810(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Preloader.PreloaderNotification preloaderNotification1 = null;
        app0.notifyPreloader(preloaderNotification1);
        app0.stop();
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "73) test0812(RegressionTest1)":             app0.start(stage11);
// flaky "73) test0812(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        java.lang.Class<?> wildcardClass13 = hostServices12.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = parameters14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        app0.stop();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "74) test0821(RegressionTest1)":             app0.start(stage11);
// flaky "74) test0821(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        app0.stop();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        app0.init();
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "75) test0825(RegressionTest1)":             app0.start(stage11);
// flaky "75) test0825(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "76) test0829(RegressionTest1)":             app0.start(stage7);
// flaky "76) test0829(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        app0.stop();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "77) test0831(RegressionTest1)":             app0.start(stage5);
// flaky "77) test0831(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "78) test0833(RegressionTest1)":             app0.start(stage7);
// flaky "78) test0833(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        javafx.stage.Stage stage18 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "79) test0835(RegressionTest1)":             app0.start(stage18);
// flaky "79) test0835(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        app0.init();
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "CASPIAN", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "CASPIAN", "", "", "", "" });
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "80) test0839(RegressionTest1)":             app0.start(stage10);
// flaky "80) test0839(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        java.lang.Class<?> wildcardClass10 = hostServices9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "81) test0845(RegressionTest1)":             app0.start(stage11);
// flaky "81) test0845(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "hi!", "MODENA", "MODENA", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "hi!", "MODENA", "MODENA", "MODENA", "" });
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "82) test0848(RegressionTest1)":             app0.start(stage9);
// flaky "82) test0848(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "hi!", "", "CASPIAN", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "hi!", "", "CASPIAN", "MODENA", "" });
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "83) test0851(RegressionTest1)":             app0.start(stage9);
// flaky "83) test0851(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "84) test0852(RegressionTest1)":             app0.start(stage13);
// flaky "84) test0852(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        javafx.application.HostServices hostServices16 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(hostServices16);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification17 = null;
        app0.notifyPreloader(preloaderNotification17);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "85) test0862(RegressionTest1)":             app0.start(stage11);
// flaky "85) test0862(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        java.lang.Class<?> wildcardClass11 = hostServices10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        java.lang.Class<?> wildcardClass5 = hostServices4.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        javafx.application.Application.Parameters parameters19 = app0.getParameters();
        javafx.stage.Stage stage20 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "86) test0870(RegressionTest1)":             app0.start(stage20);
// flaky "86) test0870(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "CASPIAN", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "CASPIAN", "", "hi!", "" });
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        javafx.application.HostServices hostServices15 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(hostServices15);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.lang.Class<?> wildcardClass20 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "87) test0875(RegressionTest1)":             app0.start(stage10);
// flaky "87) test0875(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "CASPIAN", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "CASPIAN", "hi!", "CASPIAN" });
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification16 = null;
        app0.notifyPreloader(preloaderNotification16);
        java.lang.Class<?> wildcardClass18 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "88) test0883(RegressionTest1)":             app0.start(stage13);
// flaky "88) test0883(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "hi!", "", "CASPIAN", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "hi!", "", "CASPIAN", "", "hi!" });
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MODENA", "MODENA", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "MODENA", "MODENA", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "", "", "hi!", "", "" });
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "89) test0892(RegressionTest1)":             app0.start(stage9);
// flaky "89) test0892(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.init();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "90) test0900(RegressionTest1)":             app0.start(stage12);
// flaky "90) test0900(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "91) test0901(RegressionTest1)":             app0.start(stage12);
// flaky "91) test0901(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "92) test0904(RegressionTest1)":             app0.start(stage8);
// flaky "92) test0904(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "93) test0906(RegressionTest1)":             app0.start(stage7);
// flaky "93) test0906(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "MODENA", "hi!", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "MODENA", "hi!", "MODENA", "" });
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "94) test0910(RegressionTest1)":             app0.start(stage14);
// flaky "94) test0910(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification12 = null;
        app0.notifyPreloader(preloaderNotification12);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "95) test0912(RegressionTest1)":             app0.start(stage13);
// flaky "95) test0912(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        app0.stop();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "96) test0914(RegressionTest1)":             app0.start(stage9);
// flaky "96) test0914(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        app0.init();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "97) test0915(RegressionTest1)":             app0.start(stage12);
// flaky "97) test0915(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "98) test0919(RegressionTest1)":             app0.start(stage12);
// flaky "98) test0919(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        java.lang.Class<?> wildcardClass19 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "MODENA", "" });
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "99) test0925(RegressionTest1)":             app0.start(stage12);
// flaky "99) test0925(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "100) test0930(RegressionTest1)":             app0.start(stage10);
// flaky "100) test0930(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.application.HostServices hostServices9 = app0.getHostServices();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        app0.stop();
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "101) test0940(RegressionTest1)":             app0.start(stage8);
// flaky "101) test0940(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "hi!", "hi!", "hi!", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "hi!", "hi!", "hi!", "", "CASPIAN" });
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "102) test0946(RegressionTest1)":             app0.start(stage9);
// flaky "102) test0946(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "hi!", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "hi!", "", "MODENA" });
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "103) test0950(RegressionTest1)":             app0.start(stage12);
// flaky "103) test0950(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "104) test0956(RegressionTest1)":             app0.start(stage7);
// flaky "104) test0956(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "105) test0959(RegressionTest1)":             app0.start(stage11);
// flaky "105) test0959(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        javafx.stage.Stage stage17 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "106) test0962(RegressionTest1)":             app0.start(stage17);
// flaky "106) test0962(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification20 = null;
        app0.notifyPreloader(preloaderNotification20);
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        javafx.application.Application.Parameters parameters14 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        javafx.application.Application.Parameters parameters11 = app0.getParameters();
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        app0.stop();
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        javafx.application.HostServices hostServices18 = app0.getHostServices();
        javafx.application.HostServices hostServices19 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(hostServices17);
        org.junit.Assert.assertNotNull(hostServices18);
        org.junit.Assert.assertNotNull(hostServices19);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "", "hi!", "MODENA" });
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        java.lang.Class<?> wildcardClass13 = hostServices12.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "107) test0974(RegressionTest1)":             app0.start(stage12);
// flaky "107) test0974(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "108) test0975(RegressionTest1)":             app0.start(stage13);
// flaky "108) test0975(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification11 = null;
        app0.notifyPreloader(preloaderNotification11);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "109) test0983(RegressionTest1)":             app0.start(stage11);
// flaky "109) test0983(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "MODENA", "", "CASPIAN", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "MODENA", "", "CASPIAN", "CASPIAN", "hi!" });
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "110) test0986(RegressionTest1)":             app0.start(stage7);
// flaky "110) test0986(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "111) test0987(RegressionTest1)":             app0.start(stage8);
// flaky "111) test0987(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        app0.stop();
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "CASPIAN", "CASPIAN", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "CASPIAN", "CASPIAN", "hi!", "hi!" });
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "CASPIAN", "MODENA", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "CASPIAN", "MODENA", "", "MODENA" });
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        javafx.application.HostServices hostServices13 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "112) test0996(RegressionTest1)":             app0.start(stage10);
// flaky "112) test0996(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "hi!", "", "hi!" });
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.init();
        java.lang.Class<?> wildcardClass4 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}
