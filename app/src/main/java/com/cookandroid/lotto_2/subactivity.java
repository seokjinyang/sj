package com.cookandroid.lotto_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class subactivity extends AppCompatActivity {

    Button menubtn,crebtn;
    TextView [] tv= new TextView[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);

        menubtn = (Button)findViewById(R.id.menubtn);
        tv[0] = (TextView)findViewById(R.id.tv1);
        tv[1] = (TextView)findViewById(R.id.tv2);
        tv[2] = (TextView)findViewById(R.id.tv3);
        tv[3] = (TextView)findViewById(R.id.tv4);
        tv[4] = (TextView)findViewById(R.id.tv5);
        tv[5] = (TextView)findViewById(R.id.tv6);
        crebtn = (Button)findViewById(R.id.crebtn);
        final int[] temp = new int[6];
        final int[] num = new int[6];


        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_02 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent_02);
            }
        });

        crebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i=0;i<temp.length;i++)
                {
                    temp[i]=(int)(Math.random()*45+1);
                    for(int j=0;j<i;j++) {
                        if (temp[i] == temp[j]) {
                            i--;
                            break;
                        }
                    }
                    if(temp[i]<=10)
                        tv[i].setBackgroundResource(R.drawable.red);
                    else if(temp[i]<=20)
                        tv[i].setBackgroundResource(R.drawable.orange);
                    else if(temp[i]<=30)
                        tv[i].setBackgroundResource(R.drawable.yellow);
                    else if(temp[i]<=40)
                        tv[i].setBackgroundResource(R.drawable.blue);
                    else if(temp[i]<=45)
                        tv[i].setBackgroundResource(R.drawable.green);



                }





                tv[0].setText(Integer.toString(temp[0]));
                tv[1].setText(Integer.toString(temp[1]));
                tv[2].setText(Integer.toString(temp[2]));
                tv[3].setText(Integer.toString(temp[3]));
                tv[4].setText(Integer.toString(temp[4]));
                tv[5].setText(Integer.toString(temp[5]));





            }
        });

    }
}
