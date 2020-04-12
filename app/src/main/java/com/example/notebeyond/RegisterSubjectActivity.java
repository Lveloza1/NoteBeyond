package com.example.notebeyond;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterSubjectActivity extends AppCompatActivity {

    private EditText name;
    private Spinner day;
    private EditText time;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_subject);
        name = findViewById(R.id.txtNameSubject);
        day = findViewById(R.id.spnDaySubject);
        time = findViewById(R.id.txtTimeSubject);

        String [] days = {"Lunes",
                          "Martes",
                          "Miércoles",
                          "Jueves",
                          "Viernes",
                          "Sábado",
                          "Domingo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, days);
        day.setAdapter(adapter);

        //day.getSelectedItem()
    }
    public void Save(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("nameSubject", name.getText().toString());
        intent.putExtra("daySubject", day.getSelectedItem().toString());
        intent.putExtra("timeSubject", time.getText().toString());
        finish();
        startActivity(intent);
    }
}
