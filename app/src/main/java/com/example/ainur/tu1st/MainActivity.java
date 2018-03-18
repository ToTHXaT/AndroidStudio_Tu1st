package com.example.ainur.tu1st;
    
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int maxRes = 0, num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void ResAnalizing()
    {
        TextView Res = (TextView)findViewById(R.id.res);
        TextView Text1 = (TextView)findViewById(R.id.texton);
        TextView TextCom = (TextView)findViewById(R.id.TextComm);

        if(num % 3 == 0)
        {
            num = 0;
            Text1.setText("Uuuups... Try again");
        }
        else
        if(num % 19 == 0)
        {
            num *= 2;
            Text1.setText("Jackpot!");
        }
        else
        {
            Text1.setText("");
        }
        if(maxRes < num)
        {
            maxRes = num;
        }
        TextCom.setText("Your max result : " + Integer.toString(maxRes));

        Res.setText(Integer.toString(num));
    }


    public void onButtonClick1(View V)
    {
        num++;
        ResAnalizing();
    }
    public void onButtonClick2(View V)
    {
        num+=2;
        ResAnalizing();
    }
    public void onButtonClick3(View V)
    {
        num+=3;
        ResAnalizing();
    }

}
