# Reproducer

This project reproduces the following integration tests execution error:
```
java.lang.NoSuchMethodException: io.quarkus.test.junit.mockito.internal.SetMockitoMockAsBeanMockCallback.beforeEach(io.quarkus.test.junit.callback.QuarkusTestMethodContext)
	at java.base/java.lang.Class.getMethod(Class.java:2108)
	at io.quarkus.test.junit.AbstractTestWithCallbacksExtension.invokeCallbacks(AbstractTestWithCallbacksExtension.java:153)
	at io.quarkus.test.junit.AbstractTestWithCallbacksExtension.invokeBeforeEachCallbacks(AbstractTestWithCallbacksExtension.java:76)
	at io.quarkus.test.junit.AbstractTestWithCallbacksExtension.invokeBeforeEachCallbacks(AbstractTestWithCallbacksExtension.java:72)
	at io.quarkus.test.junit.QuarkusIntegrationTestExtension.beforeEach(QuarkusIntegrationTestExtension.java:113)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeBeforeEachCallbacks$2(TestMethodTestDescriptor.java:166)
    ...
```

To see the error execute the following commands:
```
./gradlew quarkusBuild
./gradlew quarkusIntTest
```
