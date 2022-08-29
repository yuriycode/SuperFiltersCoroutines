package com.yuriycode.superfilterscoroutines.model

data class FilterItem (
   val previewUrl: String? = null,
   val imageUrl: String? = null,
   val filterName: String? = null,
   var filter: MySuperFilter? = null
)