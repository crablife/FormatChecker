package com.crab.formatchecker;


import android.util.Log;

class JavaFormatTest {
    private static final String TAG = JavaFormatTest.class.getSimpleName();

    private String mVariable = "1";

    private boolean mBooleanVariable = false;

    private void functionOne() {
        if(mBooleanVariable) {
            Log.d(TAG, "boolean value: " + mBooleanVariable);
        } else {
            Log.d(TAG, "boolean value: " + mBooleanVariable);
        }
    }
}
