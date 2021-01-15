package com.example.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText code,name,designation,salary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        code=(EditText)findViewById(R.id.code);
        name=(EditText)findViewById(R.id.name);
        designation=(EditText)findViewById(R.id.desig);
        salary=(EditText)findViewById(R.id.salary);
    }
    public void myclickevent(View view){
        String getcode=code.getText().toString();
        String getname=name.getText().toString();
        String getdesig=designation.getText().toString();
        String getsalary=salary.getText().toString();
        Toast.makeText(this,getcode+getname+getdesig+getsalary,Toast.LENGTH_LONG).show();
    }
}