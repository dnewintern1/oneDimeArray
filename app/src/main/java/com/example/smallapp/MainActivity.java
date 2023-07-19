package com.example.smallapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtValue = findViewById(R.id.txtValues);
        TextView txtavg  = findViewById(R.id.txtavg);

        int[] myArray={72,34,43,23,54,64,23,54,34,46,78,78,60,56,34,78,56,67,54,45,76,34,76};

        String OldValue;
        //for(int index =0; index<myArray.length;index++) {
            for (int myNo : myArray) {
                OldValue = txtValue.getText().toString() ;
                txtValue.setText(String.format(OldValue + " %d  \n", myNo));
            }
       // }

        int avgValue = getTheAverageValue(myArray);

        txtavg.setText(avgValue + " ");



    }

    public int getTheAverageValue( int... number){
        int total=0;
        for(int myV : number){
            total+=myV;
        }
        return total/number.length;


    }
}