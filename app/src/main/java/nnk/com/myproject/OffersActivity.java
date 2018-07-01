 package nnk.com.myproject;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OffersActivity extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);
        Intent intent=getIntent();
        wv = findViewById(R.id.wb);
        wv.loadUrl("http://www.flipkart.com");

        WebViewClient wvc = new WebViewClient();
        wv.setWebViewClient(wvc);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.example,menu);
        return true;
    }
}
