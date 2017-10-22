package io.kiva.apktool;

import android.app.Application;

/**
 * @author kiva
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AndroidApktool.initAndroid(this);
    }
}
