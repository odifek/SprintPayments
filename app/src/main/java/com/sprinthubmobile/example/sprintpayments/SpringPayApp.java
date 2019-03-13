package com.sprinthubmobile.example.sprintpayments;

import android.app.Application;

import co.paystack.android.PaystackSdk;

public class SpringPayApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PaystackSdk.initialize(getApplicationContext());
    }
}
