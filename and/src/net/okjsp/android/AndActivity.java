package net.okjsp.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndActivity extends Activity implements View.OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

	public void onClick(View arg0) {
		Intent intent = new Intent(this, ChildActivity.class);
		startActivity(intent);
	}
}