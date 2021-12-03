package com.br.appbeberagua.sync

import android.content.Context
import com.br.appbeberagua.utils.PreferencesUtils

class DrinkWaterReminderTask {

    companion object {
        const val ACTION_INCREMENT_WATER_COUNT = "action_increment_water_count"

        private fun incrementWaterCount(context: Context) = PreferencesUtils.getWaterCount(context)


        fun executeTask(context: Context, action: String?) {
            if (ACTION_INCREMENT_WATER_COUNT == action) {
                incrementWaterCount(context)
            }
        }
    }
}