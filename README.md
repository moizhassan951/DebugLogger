# DebugLogger

Simple Library for debugging using logs.
You don't need to worry about removing logs in your release builds.
Easy to setup

!o implement in your project:

```gradle
implementation 'com.moizhassan.debuglogger:debuglogger:1.0.2'
```

In your main Application class include the folowing line in your onCreate method

```kotlin
//Kotlin or Java
Dlog.init(BuildConfig.DEBUG)
```

- To Log VERBOSE events, use:

```kotlin
//Kotlin or Java
Dlog.v("TAG", "MESSAGE");
Dlog.v("TAG", "MESSAGE", throwable);
```

- To Log DEBUG events, use:

```kotlin
//Kotlin or Java
Dlog.d("TAG", "MESSAGE");
Dlog.d("TAG", "MESSAGE", throwable);
```

- To Log INFO events, use:

```kotlin
//Kotlin or Java
Dlog.i("TAG", "MESSAGE");
Dlog.i("TAG", "MESSAGE", throwable);
```

- To Log ERROR events, use:

```kotlin
//Kotlin or Java
Dlog.e("TAG", "MESSAGE");
Dlog.e("TAG", "MESSAGE", throwable);
```

- To Log WARN events, use:

```kotlin
//Kotlin or Java
Dlog.w("TAG", "MESSAGE");
Dlog.w("TAG", "MESSAGE", throwable);
```

- To Log What a Terrible Failure events, use:

```kotlin
//Kotlin or Java
Dlog.wtf("TAG", "MESSAGE");
Dlog.wtf("TAG", "MESSAGE", throwable);
```
