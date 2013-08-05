package com.replica.replicaisland;

import android.app.Application;

/**
 * @author pieces029
 */
public class ReplicaIslandApplication extends Application {

    private static ReplicaIslandApplication sInstance;

    @Override
    public void onCreate() {
        sInstance = this;

        super.onCreate();
    }

    public static ReplicaIslandApplication getInstance() {
        return sInstance;
    }
}
