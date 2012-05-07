package com.mushishi.TTA;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.util.Log;

public class Webscreen extends Activity {

    public static final String URL = "";
    private static final String TAG = "Class Webscreen";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.webscreen);
        String turl = getIntent().getStringExtra(URL);
        Log.i(TAG, "Recipe url = "+turl); 
        
        WebView webview = new WebView(this);
        setContentView(webview);
        
     // Simplest usage: No exception thrown for page-load error
        webview.loadUrl(turl);
        
        final Activity activity = this;
        
        final ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);

        webview.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                progressDialog.show();
                progressDialog.setProgress(0);
                activity.setProgress(progress * 1000);

                progressDialog.incrementProgressBy(progress);

                if(progress == 100 && progressDialog.isShowing())
                    progressDialog.dismiss();
            }
        });
    }
}