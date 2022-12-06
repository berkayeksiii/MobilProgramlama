package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivicty {
    EditText Number 1;
    EditText number 2;
    Button button;

    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(Bundle SavedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button.Kontrol);
        number1=findViewByID(R.id.button_kontrol);
        number2=findViewById(R.id.editText.Number2);
    }
}