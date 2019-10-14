package com.chamodshehanka.madrumorpaper;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class AddEmployeeActivity extends AppCompatActivity {

    private EditText txtName, txtTelephone, txtEmail;
    private RadioButton rbMale, rbFemale;
    private Spinner typeSpinner;
    private Button btnAddEmployee;
    private static final String[] employeeTypes = {"Permanent"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        txtName = findViewById(R.id.txtName);
        txtTelephone = findViewById(R.id.txtTelephone);
        txtEmail = findViewById(R.id.txtEmail);

        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);

        typeSpinner = findViewById(R.id.type_spinner);
        btnAddEmployee = findViewById(R.id.btnAddEmployee);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(AddEmployeeActivity.this, android.R.layout.simple_spinner_item, employeeTypes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeSpinner.setAdapter(adapter);

        typeSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
