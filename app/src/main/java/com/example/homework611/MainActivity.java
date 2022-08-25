package com.example.homework611;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button button = findViewById(R.id.button);
    TextView register = findViewById(R.id.register);
    TextView welcome = findViewById(R.id.welcome);
    TextView word = findViewById(R.id.word);
    TextView enter = findViewById(R.id.Enter);
    EditText password = findViewById(R.id.password);
    EditText email = findViewById(R.id.email);
email.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
if (email.getText().toString().equals("")){
    button.setBackgroundColor(Color.GRAY);

}else {
    button.setBackgroundColor(Color.YELLOW);
}

    }


}
);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (email.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
            Toast.makeText(MainActivity.this, "Вы успешно зарегестрировались", Toast.LENGTH_SHORT).show();
            email.setVisibility(View.GONE);
            enter.setVisibility(View.GONE);
            password.setVisibility(View.GONE);
            register.setVisibility(View.GONE);
            word.setVisibility(View.GONE);
            welcome.setVisibility(View.GONE);
        }else Toast.makeText(MainActivity.this, "Вы ввели не верные данные", Toast.LENGTH_SHORT).show();
    }
});
} }

