package com.sarwar.navigationcomponentsample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Scores(
    var eScore: Int,
    var bScore:Int,
    var mScore:Int
) : Parcelable