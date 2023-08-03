/*
 * Copyright (C) 2023 The LineageOS Project
 * Copyright (C) 2023 The XPerience Project
 * SPDX-License-Identifier: Apache-2.0
 */

package mx.xperience.euicc

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class EuiccReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "Received PARTNER_CUSTOMIZATION intent")
    }

    companion object {
        private const val TAG = "XimiEuiccReceiver"
    }
}