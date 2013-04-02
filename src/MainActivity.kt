package com.okolabo.SimpleCalc

import android.support.v4.app.FragmentActivity
import android.os.Bundle

class MainActivity() : FragmentActivity() {

  protected override fun onCreate(savedInstanceState: Bundle?) {
    super<FragmentActivity>.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
}