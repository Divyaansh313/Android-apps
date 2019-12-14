[200~package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	    public void Convertclick(View view){

		            EditText amountedittext = (EditText) findViewById(R.id.amountedittext);

			            Double dollarAmountdouble = Double.parseDouble(amountedittext.getText().toString());
				            Double rupeeamount = dollarAmountdouble * 71.94;

					            Toast.makeText(MainActivity.this, "Rs." + String.format("%.2f", rupeeamount), Toast.LENGTH_LONG).show();

						            Log.i("Test", "Button clicked");
							        }
	        @Override
		    protected void onCreate(Bundle savedInstanceState) {
			            super.onCreate(savedInstanceState);
				            setContentView(R.layout.activity_main);
					        }
}

