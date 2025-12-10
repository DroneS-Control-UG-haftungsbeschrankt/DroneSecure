package com.dronescontrol.dronesecure.iab

interface OnPurchaseListener {

    fun onPurchaseResult(isPurchaseSuccess: Boolean, message: String)
}
