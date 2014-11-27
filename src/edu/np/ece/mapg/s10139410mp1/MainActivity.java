package edu.np.ece.mapg.s10139410mp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	int myNumber = 0;
	TextView textView1;
	EditText etNumber;
	Button btGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textView1 = (TextView) this.findViewById(R.id.textView1);
        etNumber = (EditText) this.findViewById(R.id.etNumber);
        btGuess = (Button) this.findViewById(R.id.btGuess);
        
        btGuess.setOnClickListener(listener);
    }
    
    OnClickListener listener = new OnClickListener(){
    	
    	@Override
    	public void onClick(View v){
    		String str = etNumber.getText().toString();
    		int num = Integer.parseInt(str);
    		
    		if(num == 0){
    			Toast.makeText(MainActivity.this, "Bingo! Correct Number", Toast.LENGTH_SHORT).show();
    		}
    		else{
    			Toast.makeText(MainActivity.this, "Try again!", Toast.LENGTH_SHORT).show();
    		}
    	}
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
