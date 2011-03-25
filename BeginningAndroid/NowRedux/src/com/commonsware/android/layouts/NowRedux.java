package com.commonsware.android.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class NowRedux extends Activity implements View.OnClickListener {

	Button btn;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn = (Button)this.findViewById(R.id.button);
        btn.setOnClickListener(this);
        
        updateTime();
    }

	public void onClick(View v) {
		updateTime();
	}
	
	private void updateTime() {
		btn.setText(new Date().toString() + "\nHello World! Now Redux");
	}
}