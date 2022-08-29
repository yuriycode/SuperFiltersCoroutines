package com.yuriycode.superfilterscoroutines.model

import android.graphics.Bitmap

interface MySuperFilter {
    fun apply(src: Bitmap): Bitmap?
}