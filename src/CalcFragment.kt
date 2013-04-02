package com.okolabo.SimpleCalc

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView

class CalcFragment() : Fragment(), OnClickListener {

  var mTextResult : TextView? = null
  var mTextProcess : TextView? = null
  var mCurrentInputNumber = ""
  var mLastInput = ""

  val mButtonIds = intArray(
      R.id.btn_0, R.id.btn_1, R.id.btn_2,
      R.id.btn_3, R.id.btn_4, R.id.btn_5,
      R.id.btn_6, R.id.btn_7, R.id.btn_8,
      R.id.btn_9, R.id.btn_plus, R.id.btn_minus,
      R.id.btn_multiply, R.id.btn_devide, R.id.btn_delete,
      R.id.btn_dot, R.id.btn_eq
  )
  public override fun onClick(v: View?) {
    when (v?.getId()) {
      R.id.btn_eq -> {}
      R.id.btn_delete -> {}
      R.id.btn_dot -> {}
      else -> {
        val button = v as Button
        val text = button.getText()
        mTextProcess?.append(text)
      }
    }
  }

  public override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val view = inflater?.inflate(R.layout.calc_fragment, container)
    for (id in mButtonIds) {
      val button = view?.findViewById(id) as Button
      button.setOnClickListener(this)
    }
    mTextProcess = view?.findViewById(R.id.text_process) as TextView
    mTextResult = view?.findViewById(R.id.text_result) as TextView
    return view
  }
}