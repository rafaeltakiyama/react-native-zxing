package com.react_native_zxing;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class ScannerModule extends ReactContextBaseJavaModule implements ActivityEventListener {

    private final ReactApplicationContext mReactContext;
    private Callback mCallback;

    public ScannerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mReactContext = reactContext;
        mReactContext.addActivityEventListener(this);
    }

    @Override
    public String getName() {
        return "ScannerModule";
    }

    @ReactMethod
    void openScanner(Callback callback) {
        mCallback = callback;
        Activity activity = getCurrentActivity();
        if (activity != null) {
            IntentIntegrator intentIntegrator = new IntentIntegrator(activity);
            intentIntegrator
                    .setOrientationLocked(false)
                    .setCaptureActivity(ScannerActivity.class)
                    .initiateScan();
        }
    }

    @Override
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(resultCode, data);
        mCallback.invoke(result.getContents());
    }

    @Override
    public void onNewIntent(Intent intent) {}
}
