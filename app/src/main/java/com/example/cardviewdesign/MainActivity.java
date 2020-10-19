package com.example.cardviewdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    CardView incomeCard,expenseCard,transactionsCard,reportsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incomeCard=findViewById(R.id.incomeCard);
        expenseCard=findViewById(R.id.expenseCard);
        transactionsCard=findViewById(R.id.transactionsCard);
        reportsCard=findViewById(R.id.reportsCard);
        incomeCard.setOnClickListener(this);
        expenseCard.setOnClickListener(this);
        transactionsCard.setOnClickListener(this);
        reportsCard.setOnClickListener(this);
        Log.i("TAG","Succesfully developed");

    }

    @Override
    public void onClick(View view) {
switch(view.getId())
{
    case R.id.incomeCard:
        Log.i("Hello","1");break;
    case R.id.expenseCard:
        Log.i("Hello","2");break;
        case R.id.transactionsCard:
    Log.i("Hello","3");break;
    case R.id.reportsCard:
    Log.i("Hello","4");break;

}
    }
}