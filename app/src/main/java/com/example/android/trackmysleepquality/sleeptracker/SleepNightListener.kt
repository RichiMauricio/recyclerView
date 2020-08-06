package com.example.android.trackmysleepquality.sleeptracker

import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightListener(val clickListener: (sleepId: Long) -> Unit) {
    fun onClick(night: SleepNight) = clickListener(night.nightId)
}