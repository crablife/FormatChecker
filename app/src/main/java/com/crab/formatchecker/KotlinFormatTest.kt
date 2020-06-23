package com.crab.formatchecker

import android.util.Log

class KotlinFormatTest {
    private val TAG = JavaFormatTest::class.java.simpleName
  private val mVariable = "1"

  private val mBooleanVariable = false




    private fun functionOne(){
        if (mBooleanVariable) {
            Log.d(TAG, "boolean value: $mBooleanVariable") } else {
            Log.d(TAG, "boolean value: $mBooleanVariable")
        }
    }

    private fun UpperCaseFunctionName() {
        Log.d (TAG, "Upper case function name")
    }
}