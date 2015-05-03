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
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    EditText et;
    Button butdel,but7,but8,but9,butdiv,but4,but5,but6,
            butmul,but1,but2,but3,butsub,butdec,but0,buteq,butadd;
    float num1=0;
    float num2=0;
    String operator;
    float whatever1, whatever2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        et = (EditText) findViewById(R.id.editText);
        // Intent intent = getIntent();
        String score = getIntent().getStringExtra("score");
        et.setText(score);
        butdel=(Button) findViewById(R.id.butdel);
        but7=(Button) findViewById(R.id.but7);
        but8=(Button) findViewById(R.id.but8);
        but9=(Button) findViewById(R.id.but9);
        butdiv=(Button) findViewById(R.id.butdiv);
        but4=(Button) findViewById(R.id.but4);
        but5=(Button) findViewById(R.id.but5);
        but6=(Button) findViewById(R.id.but6);
        butmul=(Button) findViewById(R.id.butmul);
        but1=(Button) findViewById(R.id.but1);
        but2=(Button) findViewById(R.id.but2);
        but3=(Button) findViewById(R.id.but3);
        butsub=(Button) findViewById(R.id.butsub);
        butdec=(Button) findViewById(R.id.butdec);
        but0=(Button) findViewById(R.id.but0);
        buteq=(Button) findViewById(R.id.buteq);
        butadd=(Button) findViewById(R.id.butadd);

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "8");
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"9");
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"1");
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"0");
            }
        });

        butdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+".");
            }
        });

        butdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("");
            }
        });

        butadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            operator = "+";
            num1 = Float.parseFloat(et.getText().toString());
            whatever1 = num1;
            et.setText("");
            }
        });

        butsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "-";
                num1 = Float.parseFloat(et.getText().toString());
                whatever1 = num1;
                et.setText("");
            }
        });

        butmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "*";
                num1 = Float.parseFloat(et.getText().toString());
                whatever1 = num1;
                et.setText("");
            }
        });

        butdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "/";
                num1 = Float.parseFloat(et.getText().toString());
                whatever1 = num1;
                et.setText("");
            }
        });

        buteq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               doIt();
            }
        });

    }

    public void doIt(){
        if (operator.equals("+")){
            num2 = Float.parseFloat(et.getText().toString());
            whatever2 = num2 + whatever1;
            et.setText(Float.toString(whatever2));
        }
        if (operator.equals("-")){
            num2 = Float.parseFloat(et.getText().toString());
            whatever2 = whatever1 - num2;
            et.setText(Float.toString(whatever2));
        }
        if (operator.equals("*")){
            num2 = Float.parseFloat(et.getText().toString());
            whatever2 = whatever1 * num2;
            et.setText(Float.toString(whatever2));
        }
        if (operator.equals("/")){
            num2 = Float.parseFloat(et.getText().toString());
            whatever2 = whatever1/num2;
            et.setText(Float.toString(whatever2));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public static void disableSoftInputFromAppearing(EditText et) {
        if (Build.VERSION.SDK_INT >= 11) {
            et.setRawInputType(InputType.TYPE_CLASS_TEXT);
            et.setTextIsSelectable(true);
        } else {
            et.setRawInputType(InputType.TYPE_NULL);
            et.setFocusable(true);
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

        if(id == R.id.Scientific){
            String value = et.getText().toString();
            Intent intent = new Intent(this,Scientific.class);
            intent.putExtra("score", value);
            startActivity(intent);
            Toast.makeText(this, "Switched to Scientific!", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);

    }
}
