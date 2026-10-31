package com.bsgoal.app;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;
public class MainActivity extends Activity {
    WebView w;
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        getWindow().setStatusBarColor(Color.parseColor("#0b0620"));
        getWindow().setNavigationBarColor(Color.parseColor("#0b0620"));
        w = new WebView(this);
        w.setBackgroundColor(Color.parseColor("#0b0620"));
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setDomStorageEnabled(true);
        setContentView(w);
        w.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() { if (w.canGoBack()) w.goBack(); else super.onBackPressed(); }
}
