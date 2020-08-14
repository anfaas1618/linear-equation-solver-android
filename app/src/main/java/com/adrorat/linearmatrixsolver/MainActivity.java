package com.adrorat.linearmatrixsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText[] editTexts;
Button findBtn;
int[] coordinates={
        R.id.zerozero,R.id.zeroone,R.id.zerotwo,
        R.id.onezero,R.id.oneone,R.id.onetwo,
        R.id.twozero,R.id.twoone,R.id.twotwo
};
int matrixval[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findBtn=findViewById(R.id.btnFindSol);
        editTexts=new EditText[9];
        matrixval=new int[9];
        for (int i=0;i<9;i++)
        {
            editTexts[i]=findViewById(coordinates[i]);
        }
        findBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<9;i++)
                {
                    Log.i("TAG", "onCreate: "+editTexts[i].getText().toString());
                    matrixval[i]=Integer.parseInt(editTexts[i].getText().toString());

                }
                Log.i("TAG", "onClick: done");
            }
        });

    }
}
