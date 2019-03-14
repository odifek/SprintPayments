package com.sprinthubmobile.example.sprintpayments.payment

import co.paystack.android.model.Card

sealed class PaymentEvent {
    object ScreenLoadEvent: PaymentEvent()
    object CancelPaymentEvent: PaymentEvent()
    data class ConfirmPaymentEvent(val card: Card)
}