package com.example.httprequest;

import java.io.File;
import java.io.IOException;

import com.example.httprequest.HttpRequest.HttpRequestException;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnBoton1 = (Button)findViewById(R.id.button1);
		
		 
		btnBoton1.setOnClickListener(new View.OnClickListener() {
			String response = null;
			WebView webViewer = (WebView)findViewById(R.id.webViewer);
		    public void onClick(View arg0)
		    {
		    	//response = HttpRequest.get("http://google.com").body();
		    	webViewer.loadUrl("http://www.ingens-networks.com/blog/");
		    	//webViewer.loadData(response, "test/html", "UTF-8");
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	/*
	public class DownloadTask extends AsyncTask<String, Long, File> {
		  protected File doInBackground(String... urls) {
		    try {
		      HttpRequest request =  HttpRequest.get(urls[0]); //per la del exemple
		      File file = null;
		      if (request.ok()) {
		        try {
					file = File.createTempFile("download", ".tmp"); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        request.receive(file);
		        publishProgress(file.length());
		      }
		      return file;
		    } catch (HttpRequestException exception) {
		      return null;
		    }
		  }
	}
	
	*/
	


}
