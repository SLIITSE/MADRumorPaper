package com.chamodshehanka.madrumorpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAddEmployee, btnEditEmployee, btnSearchEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddEmployee = findViewById(R.id.btnAddEmployee);
        btnEditEmployee = findViewById(R.id.btnEditEmployee);
        btnSearchEmployee = findViewById(R.id.btnSearchEmployee);

        btnAddEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addEmployeeIntent = new Intent(getApplicationContext(), AddEmployeeActivity.class);
                startActivity(addEmployeeIntent);
            }
        });

        btnEditEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent editEmployeeIntent = new Intent(getApplicationContext(), EditEmployeeActivity.class);
                startActivity(editEmployeeIntent);
            }
        });

        btnSearchEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent searchEmployeeIntent = new Intent(getApplicationContext(), )
            }
        });
    }
}
