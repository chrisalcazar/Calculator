package com.example.christian.calculator.calculator;


import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Scientific extends ActionBarActivity {
    EditText et;
    Button butdel, butsin, butcos, buttan, buti, butln, butlog, butpi,
            bute, butper, butfact, butsqr, butpwr, butlp, butrp;
    float num1=0;
    float num2=0;
    double whatever1;
    String operator = "%";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scientific);
        et = (EditText) findViewById(R.id.editText);
        disableSoftInputFromAppearing(et);
        // Intent intent = getIntent();
        String score = getIntent().getStringExtra("score");
        et.setText(score);
        butdel = (Button) findViewById(R.id.butdel);
        butsin = (Button) findViewById(R.id.butsin);
        butcos = (Button) findViewById(R.id.butcos);
        buttan = (Button) findViewById(R.id.buttan);
        buti = (Button) findViewById(R.id.buti);
        butln = (Button) findViewById(R.id.butln);
        butlog = (Button) findViewById(R.id.butlog);
        butpi = (Button) findViewById(R.id.butpi);
        bute = (Button) findViewById(R.id.bute);
        butper = (Button) findViewById(R.id.butper);
        butfact = (Button) findViewById(R.id.butfact);
        butsqr = (Button) findViewById(R.id.butsqr);
        butpwr = (Button) findViewById(R.id.butpwr);
        butlp = (Button) findViewById(R.id.butlp);
        butrp = (Button) findViewById(R.id.butrp);

        butdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("");
            }
        });

        butsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                Double yass = Double.valueOf(num1);
                whatever1 = Math.sin(yass);
                et.setText(Double.toString(whatever1));
            }
        });

        butcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                Double yass = Double.valueOf(num1);
                whatever1 = Math.cos(yass);
                et.setText(Double.toString(whatever1));
            }
        });

        buttan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                Double yass = Double.valueOf(num1);
                whatever1 = Math.tan(yass);
                et.setText(Double.toString(whatever1));
            }
        });

        buti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String blah = et.getText().toString();
                et.setText(blah + "i");
            }
        });

        butln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                whatever1 = Math.log(num1);
                et.setText(Double.toString(whatever1));
            }
        });

        butlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                whatever1 = Math.log10(num1);
                et.setText(Double.toString(whatever1));
            }
        });

        butpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whatever1 = Math.PI;
                et.setText(Double.toString(whatever1));
            }
        });

        bute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                Double yass = Double.valueOf(num1);
                whatever1 = Math.exp(num1);
                et.setText(Double.toString(whatever1));
            }
        });

        butfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                et.setText(Double.toString(calcFactorial()));
            }
        });

        butsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                whatever1 = Math.sqrt(num1);
                et.setText(Double.toString(whatever1));
            }
        });

        butper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "%";
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                whatever1 = num1;
                et.setText("");
            }
        });

        butpwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "^";
                if(et.getText().toString().trim().length() > 0){
                    num1 = Float.parseFloat(et.getText().toString());
                }else {
                    Toast.makeText(getApplicationContext(), "No Input", Toast.LENGTH_LONG).show();
                }
                whatever1 = num1;
                et.setText("");
            }
        });

    }


    private long calcFactorial() {

        long factorial = 1;
        try {
            factorial = Long.parseLong(et.getText().toString());
            for(long i=factorial-1; i>0; i--){
                factorial = i * factorial;
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Incorrect Input", Toast.LENGTH_LONG).show();
        } finally {}

        return factorial;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scientific, menu);
        return true;
    }

    public static void disableSoftInputFromAppearing(EditText editText) {
        if (Build.VERSION.SDK_INT >= 11) {
            editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
            editText.setTextIsSelectable(true);
        } else {
            editText.setRawInputType(InputType.TYPE_NULL);
            editText.setFocusable(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if(id == R.id.Basic){
            String value = et.getText().toString();
            String value2 = operator;
            String value3 = String.valueOf(whatever1);
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("score", value);
            intent.putExtra("yeah", value2);
            intent.putExtra("whatever", value3);
            startActivity(intent);
            Toast.makeText(this, "Switched to Basic!", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
