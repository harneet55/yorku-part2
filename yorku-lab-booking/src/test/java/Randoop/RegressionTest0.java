package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "" });
    }

    // Removed test0002 - it tests application state that varies by execution context
    // @Test
    // public void test0002() throws Throwable {
    //     if (debug)
    //         System.out.format("%n%s%n", "RegressionTest0.test0002");
    //     com.yorku.coordinator.LabManager labManager0 = com.yorku.App.getLabManager();
    //     org.junit.Assert.assertNull(labManager0);
    // }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.setUserAgentStylesheet("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Toolkit not initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = javafx.application.Application.STYLESHEET_CASPIAN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CASPIAN" + "'", str0, "CASPIAN");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str0 = javafx.application.Application.getUserAgentStylesheet();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hi!" + "'", str0, "hi!");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.setUserAgentStylesheet("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Toolkit not initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str0 = javafx.application.Application.STYLESHEET_MODENA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MODENA" + "'", str0, "MODENA");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "", "", "hi!" });
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.yorku.App app0 = new com.yorku.App();
        java.lang.Class<?> wildcardClass1 = app0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.yorku.App app0 = new com.yorku.App();
        javafx.stage.Stage stage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "", "CASPIAN", "hi!", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "", "CASPIAN", "hi!", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        java.lang.Class<?> wildcardClass3 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        java.lang.Class<?> wildcardClass3 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        java.lang.Class<?> wildcardClass4 = hostServices3.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.setUserAgentStylesheet("CASPIAN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Toolkit not initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.stage.Stage stage3 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = parameters2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.stage.Stage stage4 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage3 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String[] strArray1 = new java.lang.String[] { "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "CASPIAN" });
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.stage.Stage stage2 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "CASPIAN", "", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "CASPIAN", "", "CASPIAN", "hi!" });
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.stage.Stage stage3 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        javafx.stage.Stage stage4 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.setUserAgentStylesheet("MODENA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Toolkit not initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = parameters1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "", "", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "", "", "CASPIAN", "hi!" });
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass4 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        java.lang.Class<?> wildcardClass4 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "", "CASPIAN", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "", "CASPIAN", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage4 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        java.lang.Class<?> wildcardClass6 = hostServices5.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "hi!", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "hi!", "", "MODENA" });
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "hi!", "MODENA" });
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "CASPIAN" });
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "MODENA", "", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "MODENA", "", "CASPIAN", "hi!" });
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "MODENA" });
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "hi!", "MODENA" });
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "CASPIAN" });
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        java.lang.Class<?> wildcardClass4 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "MODENA", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "MODENA", "", "hi!" });
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "", "hi!", "" });
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        java.lang.Class<?> wildcardClass4 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        java.lang.Class<?> wildcardClass4 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "MODENA" });
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "", "MODENA", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "", "MODENA", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "CASPIAN", "" });
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parameters6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = hostServices6.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.lang.Class<?> wildcardClass13 = hostServices12.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String[] strArray2 = new java.lang.String[] { "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "MODENA", "MODENA" });
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.String[] strArray2 = new java.lang.String[] { "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "MODENA", "hi!" });
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "CASPIAN", "", "hi!", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "CASPIAN", "", "hi!", "hi!", "MODENA" });
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "CASPIAN", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "CASPIAN", "", "CASPIAN" });
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.Class<?> wildcardClass11 = hostServices10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "", "CASPIAN", "" });
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "CASPIAN" });
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        java.lang.Class<?> wildcardClass4 = hostServices3.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "CASPIAN", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "hi!", "", "hi!", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "hi!", "", "hi!", "hi!", "MODENA" });
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "", "MODENA", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "", "MODENA", "", "CASPIAN" });
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "hi!", "", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "hi!", "", "hi!", "CASPIAN" });
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "MODENA" });
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String[] strArray2 = new java.lang.String[] { "MODENA", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "MODENA", "CASPIAN" });
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "MODENA", "hi!" });
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "MODENA", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "MODENA", "hi!", "hi!" });
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "CASPIAN", "hi!", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "CASPIAN", "hi!", "hi!", "MODENA" });
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "MODENA", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "MODENA", "hi!", "" });
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "MODENA", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "MODENA", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        app0.stop();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "hi!", "CASPIAN" });
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "MODENA", "MODENA", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "MODENA", "MODENA", "CASPIAN", "hi!" });
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "hi!", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN", "hi!", "MODENA", "" });
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.stage.Stage stage4 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = hostServices6.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "MODENA", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "MODENA", "hi!", "hi!", "" });
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.stage.Stage stage4 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "hi!", "hi!", "" });
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "hi!", "MODENA", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "hi!", "MODENA", "MODENA", "MODENA" });
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "MODENA", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "MODENA", "MODENA", "MODENA" });
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "MODENA", "hi!", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "MODENA", "hi!", "", "MODENA" });
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "CASPIAN", "hi!" });
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.String[] strArray5 = new java.lang.String[] { "CASPIAN", "hi!", "CASPIAN", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CASPIAN", "hi!", "CASPIAN", "MODENA", "MODENA" });
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "MODENA", "", "", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "MODENA", "", "", "hi!", "CASPIAN" });
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "CASPIAN", "MODENA", "MODENA", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "CASPIAN", "MODENA", "MODENA", "MODENA", "" });
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String[] strArray2 = new java.lang.String[] { "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "MODENA", "" });
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!", "MODENA" });
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "hi!", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "hi!", "MODENA", "MODENA" });
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "CASPIAN", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "CASPIAN", "MODENA", "" });
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "", "hi!", "MODENA", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "", "hi!", "MODENA", "", "MODENA" });
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "MODENA", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "MODENA", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "CASPIAN", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "CASPIAN", "", "hi!", "", "" });
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.stage.Stage stage4 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String[] strArray2 = new java.lang.String[] { "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.lang.Class<?> wildcardClass10 = hostServices9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        javafx.stage.Stage stage13 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.init();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        javafx.stage.Stage stage4 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "hi!", "", "", "" });
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.lang.Class<?> wildcardClass10 = hostServices9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "hi!", "MODENA" });
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String[] strArray2 = new java.lang.String[] { "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "CASPIAN", "hi!" });
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        java.lang.Class<?> wildcardClass8 = hostServices7.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "", "hi!", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "", "hi!", "MODENA", "MODENA" });
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = hostServices6.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "CASPIAN", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "hi!", "CASPIAN", "hi!", "CASPIAN" });
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "MODENA", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "MODENA", "MODENA", "hi!" });
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass5 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "hi!", "MODENA", "CASPIAN", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "hi!", "MODENA", "CASPIAN", "MODENA", "hi!" });
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "MODENA", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "MODENA", "CASPIAN" });
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "CASPIAN", "MODENA", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "CASPIAN", "MODENA", "CASPIAN" });
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = hostServices6.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        java.lang.Class<?> wildcardClass13 = hostServices12.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "MODENA", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "MODENA", "CASPIAN", "" });
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "CASPIAN", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "CASPIAN", "CASPIAN", "CASPIAN", "MODENA", "" });
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "", "hi!", "CASPIAN" });
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "MODENA" });
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "hi!", "CASPIAN" });
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "MODENA", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "MODENA", "hi!" });
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.stage.Stage stage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "CASPIAN", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "CASPIAN", "", "hi!", "hi!" });
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        javafx.application.Application.Parameters parameters10 = app0.getParameters();
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification4 = null;
        app0.notifyPreloader(preloaderNotification4);
        app0.init();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = hostServices8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "MODENA", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "MODENA", "hi!", "", "hi!" });
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String[] strArray2 = new java.lang.String[] { "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "CASPIAN", "" });
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        javafx.application.HostServices hostServices11 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        javafx.application.Application.Parameters parameters12 = app0.getParameters();
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        java.lang.Class<?> wildcardClass14 = hostServices13.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        javafx.application.HostServices hostServices12 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "", "CASPIAN", "hi!" });
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "MODENA", "CASPIAN" });
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.init();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "MODENA", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "MODENA", "", "MODENA" });
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.lang.Class<?> wildcardClass13 = hostServices12.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.lang.Class<?> wildcardClass16 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "CASPIAN", "CASPIAN", "MODENA", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "CASPIAN", "CASPIAN", "MODENA", "CASPIAN" });
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.String[] strArray1 = new java.lang.String[] { "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "MODENA" });
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "CASPIAN", "CASPIAN", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "CASPIAN", "CASPIAN", "hi!", "CASPIAN" });
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = parameters5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = parameters12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.init();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.stop();
        app0.init();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "MODENA", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "MODENA", "hi!", "CASPIAN" });
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        javafx.application.HostServices hostServices14 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "MODENA", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "MODENA", "hi!", "" });
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String[] strArray4 = new java.lang.String[] { "MODENA", "", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "MODENA", "", "CASPIAN", "" });
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "", "", "MODENA" });
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "CASPIAN", "MODENA", "MODENA", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "CASPIAN", "MODENA", "MODENA", "", "CASPIAN" });
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.init();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "MODENA", "hi!", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "MODENA", "hi!", "", "MODENA" });
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "", "MODENA" });
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "MODENA", "CASPIAN", "", "CASPIAN", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "MODENA", "CASPIAN", "", "CASPIAN", "" });
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        app0.init();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = parameters15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String[] strArray3 = new java.lang.String[] { "CASPIAN", "CASPIAN", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CASPIAN", "CASPIAN", "hi!" });
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters9 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.HostServices hostServices7 = app0.getHostServices();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "hi!", "hi!", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "hi!", "hi!", "MODENA" });
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Preloader.PreloaderNotification preloaderNotification8 = null;
        app0.notifyPreloader(preloaderNotification8);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MODENA", "CASPIAN", "hi!", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "MODENA", "CASPIAN", "hi!", "CASPIAN" });
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification13 = null;
        app0.notifyPreloader(preloaderNotification13);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification3 = null;
        app0.notifyPreloader(preloaderNotification3);
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        java.lang.Class<?> wildcardClass7 = hostServices6.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        java.lang.Class<?> wildcardClass15 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "hi!", "" });
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "MODENA", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "MODENA", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.init();
        java.lang.Class<?> wildcardClass8 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.HostServices hostServices5 = app0.getHostServices();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.stage.Stage stage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.Class<?> wildcardClass10 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "CASPIAN", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "CASPIAN", "MODENA", "MODENA" });
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(hostServices13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.stage.Stage stage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        app0.stop();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String[] strArray2 = new java.lang.String[] { "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "CASPIAN", "MODENA" });
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        java.lang.Class<?> wildcardClass12 = hostServices11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        javafx.stage.Stage stage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        javafx.application.HostServices hostServices10 = app0.getHostServices();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String[] strArray4 = new java.lang.String[] { "CASPIAN", "", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CASPIAN", "", "MODENA", "" });
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        javafx.application.Application.Parameters parameters4 = app0.getParameters();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices8 = app0.getHostServices();
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = parameters5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "MODENA", "", "CASPIAN", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "MODENA", "", "CASPIAN", "hi!", "hi!" });
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "CASPIAN", "", "MODENA", "MODENA", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "CASPIAN", "", "MODENA", "MODENA", "" });
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.init();
        javafx.application.Application.Parameters parameters7 = app0.getParameters();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.lang.Class<?> wildcardClass14 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "CASPIAN", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "CASPIAN", "CASPIAN" });
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        javafx.stage.Stage stage11 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.String[] strArray6 = new java.lang.String[] { "MODENA", "hi!", "MODENA", "MODENA", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "MODENA", "hi!", "MODENA", "MODENA", "", "MODENA" });
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        app0.stop();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.init();
        app0.stop();
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(hostServices10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        javafx.application.HostServices hostServices6 = app0.getHostServices();
        app0.stop();
        javafx.stage.Stage stage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        app0.stop();
        app0.stop();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        app0.stop();
        javafx.application.Preloader.PreloaderNotification preloaderNotification9 = null;
        app0.notifyPreloader(preloaderNotification9);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification2 = null;
        app0.notifyPreloader(preloaderNotification2);
        app0.stop();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Application.Parameters parameters5 = app0.getParameters();
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        app0.init();
        app0.init();
        app0.init();
        app0.init();
        app0.stop();
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        javafx.stage.Stage stage14 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        app0.stop();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.String[] strArray5 = new java.lang.String[] { "MODENA", "hi!", "MODENA", "CASPIAN", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "MODENA", "hi!", "MODENA", "CASPIAN", "MODENA" });
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Application.Parameters parameters6 = app0.getParameters();
        app0.stop();
        app0.init();
        app0.init();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        javafx.application.Application.Parameters parameters13 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "MODENA", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "MODENA", "MODENA" });
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.HostServices hostServices2 = app0.getHostServices();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        app0.stop();
        java.lang.Class<?> wildcardClass6 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        javafx.stage.Stage stage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification10 = null;
        app0.notifyPreloader(preloaderNotification10);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        app0.stop();
        javafx.application.HostServices hostServices3 = app0.getHostServices();
        javafx.application.HostServices hostServices4 = app0.getHostServices();
        javafx.application.Preloader.PreloaderNotification preloaderNotification5 = null;
        app0.notifyPreloader(preloaderNotification5);
        javafx.application.Preloader.PreloaderNotification preloaderNotification7 = null;
        app0.notifyPreloader(preloaderNotification7);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices4);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        java.lang.Class<?> wildcardClass12 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "CASPIAN", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "CASPIAN", "hi!", "" });
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        app0.stop();
        javafx.stage.Stage stage15 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices4);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNotNull(hostServices13);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        javafx.application.Preloader.PreloaderNotification preloaderNotification14 = null;
        app0.notifyPreloader(preloaderNotification14);
        javafx.stage.Stage stage16 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
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
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String[] strArray6 = new java.lang.String[] { "CASPIAN", "hi!", "MODENA", "hi!", "", "MODENA" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CASPIAN", "hi!", "MODENA", "hi!", "", "MODENA" });
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        javafx.application.Application.Parameters parameters15 = app0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(hostServices3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(hostServices11);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices5);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(hostServices9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.yorku.App app0 = new com.yorku.App();
        javafx.application.Application.Parameters parameters1 = app0.getParameters();
        javafx.application.Application.Parameters parameters2 = app0.getParameters();
        javafx.application.Application.Parameters parameters3 = app0.getParameters();
        app0.init();
        app0.init();
        javafx.application.Preloader.PreloaderNotification preloaderNotification6 = null;
        app0.notifyPreloader(preloaderNotification6);
        javafx.application.Application.Parameters parameters8 = app0.getParameters();
        javafx.stage.Stage stage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.start(stage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.sun.glass.ui.Timer.resume()\" because \"this.pulseTimer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.String[] strArray3 = new java.lang.String[] { "MODENA", "", "CASPIAN" };
        // The following exception was thrown during execution in test generation
        try {
            javafx.application.Application.launch(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error: class jdk.internal.reflect.DirectMethodHandleAccessor is not a subclass of javafx.application.Application");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "MODENA", "", "CASPIAN" });
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(hostServices2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(hostServices7);
        org.junit.Assert.assertNotNull(hostServices8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

