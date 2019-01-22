
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class RNSendBroadcastModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNSendBroadcastModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSendBroadcast";
  }

  @ReactMethod
  public void send(String message) {
    Intent intent = new Intent();
    intent.setAction("com.customermobile.demo.logger.LOG_EVENT");
    intent.putExtra("event", message);
    reactContext.sendBroadcast(intent);
    Log.d("Send Broadcast", message);
  }
  
}