// IRemoteService.aidl
package com.songjachin.allskillinandroid.remote.aidl;

// Declare any non-default types here with import statements
parcelable MyData;

interface IRemoteService {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
//    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
//            double aDouble, String aString);
    int getPid();
    MyData getMyData();
    void setMyData(in MyData data);
}