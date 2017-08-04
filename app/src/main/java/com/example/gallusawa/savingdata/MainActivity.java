package com.example.gallusawa.savingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.etname);
        TextView textView = (TextView) findViewById(R.id.tvName);


    }

    public void changeText(View view) {
        String data = editText.getText().toString();
        textView.setText(data);
    }

    @Override
    protected void onSaveInsancesState(Bundle outState) {
        super.onSaveInsancesState(outState);

        String data = textView.getText().toString();
        outState.putString("data", data);

    }
  public void doSomething(View view){
      switch (view.getId()){
          case R.id.btnGhangeText;
              break;
          case R.id.btnGoToSecond;
              Intent intent = new Intent(this, SecondACTIVITY.CLASS);
              intent putExtra("Person", new Person("Manroop", "Male"));
      //        intent.setFlags(Intent.Flag);
              startActivity(intent);
              break;

          case R.id.btnShareData;
              Intent sendIntent = new Intent();
              sendIntent.setAction(Intent.ACTION_SEND);
              sendIntent.putExtra(Intent.EXTRA_TEXT, "This is a message");
              sendIntent.setType)"text/plain");
              startActivity(sendIntent);
              break;

      }
  }


    @Override
    protected void onRestoreInstanceSate(Bundle savedInstances){


    }
    Toast.makeText(this, person.getName(), Toast.LENGTH_SHORT).show();


}
