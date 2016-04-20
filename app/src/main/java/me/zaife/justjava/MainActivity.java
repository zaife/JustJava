package me.zaife.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(quantity);
    }

    public void submitOrder(View view) {

        display(quantity);
        displayPrice(quantity * 5);
    }

    private void display(int num) {
        TextView textView = (TextView) findViewById(R.id.quantity_text_view);
        textView.setText("" + (num));
    }

    private void displayPrice(int num) {
        TextView textView = (TextView) findViewById(R.id.price_text_view);
        String priceMsg = "Total: "+NumberFormat.getCurrencyInstance().format(num);
        priceMsg = priceMsg+" \n Thank you!";
        textView.setText(priceMsg);
    }

    public void incrementCoffeeNum(View view) {
        quantity += 1;
        display(quantity);
    }

    public void decrementCoffeeNum(View view) {
        if (quantity > 0) {
            quantity -= 1;
        }
        display(quantity);
    }
}
