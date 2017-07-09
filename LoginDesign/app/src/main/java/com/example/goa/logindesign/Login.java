//<!-- copyrighted content owned by Android Arena (www.androidarena.co.in)-->
package com.example.goa.logindesign;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Login extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);  
        
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);
        
        TextView reg = (TextView)findViewById(R.id.reg);
        reg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent nxt = new Intent(getApplicationContext(),MainActivity.class);
				startActivity(nxt);
			}
		});
	}
}
