package com.example.yhwinnie.befitconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static RadioGroup radio_group;
    private static RadioGroup radio_group2;
    private static RadioButton radio_button;
    private static Button button_update;
    TextView txtOutput;
    EditText txtInput;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        txtOutput = (TextView) findViewById(R.id.textView2);
        txtInput = (EditText) findViewById(R.id.editText);

        //SelectExercise();
    }

    public void onRadioButtonClick(View view) {
        RadioButton button = (RadioButton) view;
        Toast.makeText(MainActivity.this,
                button.getText() + " was chosen.",
                Toast.LENGTH_SHORT).show();
        switch (view.getId()) {
            case R.id.radioButton_pushup:

                float i = Integer.parseInt(txtInput.getText().toString()) / (float) 350 * (float) 100;

                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_situp:
                i = Integer.parseInt(txtInput.getText().toString())/(float)200 * (float)100;

                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_jumping:
                i = Integer.parseInt(txtInput.getText().toString())/(float)10 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_jogging:
                i = Integer.parseInt(txtInput.getText().toString())/(float)12 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_squats:
                i = Integer.parseInt(txtInput.getText().toString())/(float)225 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_leglift:
                i = Integer.parseInt(txtInput.getText().toString())/(float)25 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_plank:
                i = Integer.parseInt(txtInput.getText().toString())/(float)25 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");

                break;
            case R.id.radioButton_pullup:
                i = Integer.parseInt(txtInput.getText().toString())/(float)100 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_cycling:
                i = Integer.parseInt(txtInput.getText().toString())/(float)12 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_walking:
                i = Integer.parseInt(txtInput.getText().toString())/(float)20 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_swimming:
                i = Integer.parseInt(txtInput.getText().toString())/(float)13 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;
            case R.id.radioButton_stair:
                i = Integer.parseInt(txtInput.getText().toString())/(float)15 * (float)100;
                txtOutput.setText(String.valueOf(i) + " calories burned");
                break;

        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

        return super.onOptionsItemSelected(item);
    }
}
