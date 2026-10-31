package org.chekushka.snake;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

    private WebView view;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        view = new WebView(this);
        WebSettings settings = view.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        view.setBackgroundColor(0xFF0B0908);
        view.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        view.loadUrl("file:///android_asset/index.html");
        setContentView(view);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (view != null) view.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (view != null) view.onResume();
    }
}
