package com.mushishi.TTA;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class TTA extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
     // Add Click listeners for all buttons
        View firstButton = findViewById(R.id.button1);
        firstButton.setOnClickListener(this);
        View secondButton = findViewById(R.id.button2);
        secondButton.setOnClickListener(this);
        View thirdButton = findViewById(R.id.button3);
        thirdButton.setOnClickListener(this);
        View forthButton = findViewById(R.id.button4);
        forthButton.setOnClickListener(this);
        View fifthButton = findViewById(R.id.button5);
        fifthButton.setOnClickListener(this);
        View aboutButton = findViewById(R.id.button6);
        aboutButton.setOnClickListener(this);
        
    }

 // Process the button click events
	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		case R.id.button1:
			Intent j = new Intent(this, Webscreen.class);
			j.putExtra(com.mushishi.TTA.Webscreen.URL,
					"http://thai.moonisp.dk/");
			startActivity(j);
			break;
		
		case R.id.button2:
			Intent k = new Intent(this, Webscreen.class);
			k.putExtra(com.mushishi.TTA.Webscreen.URL,
					"http://thai.moonisp.dk/app/Tisdag.php");
			startActivity(k);
			break;
		
		case R.id.button3:
			Intent l = new Intent(this, Webscreen.class);
			l.putExtra(com.mushishi.TTA.Webscreen.URL, 
					"http://thai.moonisp.dk/app/Onsdag.php");
			startActivity(l);
			break;
			
		case R.id.button4:
			Intent m = new Intent(this, Webscreen.class);
			m.putExtra(com.mushishi.TTA.Webscreen.URL, 
					"http://thai.moonisp.dk/app/Torsdag.php");
			startActivity(m);
			break;

		case R.id.button5:
			Intent n = new Intent(this, Webscreen.class);
			n.putExtra(com.mushishi.TTA.Webscreen.URL, 
					"http://thai.moonisp.dk/app/Fredag.php");
			startActivity(n);
			break;			

		case R.id.button6:
			Intent o = new Intent(this, Webscreen.class);
			o.putExtra(com.mushishi.TTA.Webscreen.URL, 
					"http://thai.moonisp.dk/app/About.php");
			startActivity(o);
			break;			
		}
		
	}
}