package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isSquare() {

            double squareroot = Math.sqrt(number);

            if (squareroot == Math.floor(squareroot)) {

                return true;
            } else {

                return false;
            }

        }

        public boolean isTriangular() {

            int x = 1;

            int triangularnumber = 1;

            while (triangularnumber < number) {

                x++;

                triangularnumber = triangularnumber + x;

            }

            if (triangularnumber == number) {
                return true;
            } else {
                return false;
            }

        }
    }

    public void testnumber(View view) {

        String message = "";

        EditText usersnumber = (EditText) findViewById(R.id.usersnumber);

        if (usersnumber.getText().toString().isEmpty())
        {
            message = "please enter a number";
        }

        else {

            Number num = new Number();

            num.number = Integer.parseInt(usersnumber.getText().toString());

            if (num.isSquare()) {

                if (num.isTriangular()) {

                    message = num.number + " is both triangular and square.";

                } else {
                    message = num.number + " is square, but not triangular.";

                }
            } else {
                if (num.isTriangular()) {

                    message = num.number + " is triangular, but not square.";

                } else {
                    message = num.number + " is neither square nor triangular.";

                }
            }

        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}


