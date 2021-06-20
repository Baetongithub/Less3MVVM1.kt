package com.geektech.less3mvvm1kt.extensions

import android.app.Activity
import android.widget.Toast

fun Activity.toast(txt: String) {
    Toast.makeText(this, txt, Toast.LENGTH_SHORT).show()
}