# AndroidApktool
Apktool runs on android.

## How to
1. first, add following lines to you custom Application's onCreate() method.
```java
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AndroidApktool.initAndroid(this);
    }
}
```

2. let's run apktool by:
```java
AndroidApktool.run(new String[] { "d", apkPath, "-f", outputPath });
```

## License
Copyright 2017 Kiva <kiva515@foxmail.com>

Code released under the MIT License.
