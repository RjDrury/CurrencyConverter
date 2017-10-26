package ca.rdrury.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void timeToConvert(View view){
        double total,number;

        EditText numberToConvert = (EditText) findViewById(R.id.numberToConvert);
        Log.i("number",numberToConvert.getText().toString());

        number = Double.parseDouble(numberToConvert.getText().toString());

        RadioButton usToC = (RadioButton) findViewById(R.id.cadToUS);

        if(usToC.isChecked()){
            total = number*1.37;
            Toast.makeText(MainActivity.this,"In CAD, $" +total+".", Toast.LENGTH_SHORT).show();
        }
        else{
            total = number*.73;
            Toast.makeText(MainActivity.this,"In USD, $" +total+".", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
