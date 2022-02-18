package com.debalina0610.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText calculate;
    private TextView result;
    private String cal = "", res = "";
    private Button clr, bs, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, ad, sub,dvd,mlt, fact, power, root, dec, inv,eq;
    private boolean dotins = false, opins = false;
    private double f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate = findViewById(R.id.calculate);
        result = findViewById(R.id.result);

        clr = findViewById(R.id.clear);
        bs = findViewById(R.id.backspace);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        ad = findViewById(R.id.add);
        sub = findViewById(R.id.subtract);
        dvd = findViewById(R.id.divide);
        mlt = findViewById(R.id.multi);
        fact = findViewById(R.id.mod);
        power = findViewById(R.id.square);
        root = findViewById(R.id.root);
        dec = findViewById(R.id.decimal);
        inv = findViewById(R.id.inverse);
        eq = findViewById(R.id.equal);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "0";
                calculation();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "1";
                calculation();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "2";
                calculation();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "3";
                calculation();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "4";
                calculation();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "5";
                calculation();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "6";
                calculation();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "7";
                calculation();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "8";
                calculation();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = cal + "9";
                calculation();
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
                calculation();
                display();
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backspace();
                calculation();
            }
        });

        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotins = false;
                if(! cal.isEmpty()){
                    if(cal.substring(cal.length()-1 ,cal.length()).equals((".")))
                        backspace();
                    if(opins == false) {
                        cal =  "1 / " + cal;
                        opins = true;
                    }
                }
                calculation();
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotins = false;
                if(! cal.isEmpty()){
                    if(cal.substring(cal.length()-1 ,cal.length()).equals((".")))
                        backspace();
                    if(opins == false) {
                        cal = cal + " ^ ";
                        opins = true;
                    }
                }
                calculation();
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotins = false;
                if(! cal.isEmpty()){
                    if(cal.substring(cal.length()-1 ,cal.length()).equals((".")))
                        backspace();
                    if(opins == false) {
                        cal = cal + " √ ";
                        opins = true;
                    }
                }
                calculation();
            }
        });

        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotins = false;
                if(! cal.isEmpty()){
                    if(cal.substring(cal.length()-1 ,cal.length()).equals((".")))
                        backspace();
                    if(opins == false) {
                        cal = cal + " !";
                        opins = true;
                    }
                }
                calculation();
            }
        });

        dvd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotins = false;
                if(! cal.isEmpty()){
                    if(cal.substring(cal.length()-1 ,cal.length()).equals((".")))
                        backspace();
                    if(opins == false) {
                        cal = cal + " ÷ ";
                        opins = true;
                    }
                }
                calculation();
            }
        });

        mlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotins = false;
                if(! cal.isEmpty()){
                    if(cal.substring(cal.length()-1, cal.length()).equals((".")))
                        backspace();
                    if(opins == false) {
                        cal = cal + " x ";
                        opins = true;
                    }
                }
                calculation();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotins = false;
                if(! cal.isEmpty()){
                    if(cal.substring(cal.length()-1 ,cal.length()).equals((".")))
                        backspace();
                    if(opins == false) {
                        cal = cal + " - ";
                        opins = true;
                    }
                }
                calculation();
            }
        });

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotins = false;
                if(! cal.isEmpty()){
                    if(cal.substring(cal.length()-1 ,cal.length()).equals((".")))
                        backspace();
                    if(opins == false) {
                        cal = cal + " + ";
                        opins = true;
                    }
                }
                calculation();
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cal.isEmpty()){
                    cal = "0.";
                    dotins = true;
                }

                if(dotins == false){
                    cal = cal + ".";
                    dotins = true;
                }
                calculation();
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opins == true && ! cal.substring(cal.length()-1, cal.length()).equals(" ")){
                    String[] operator = cal.split(" ");
                    switch(operator[1].charAt(0)){
                        case '÷':
                            res = Double.toString(Double.parseDouble(operator[0]) / Double.parseDouble(operator[2]));
                            break;

                        case 'x':
                            res = Double.toString(Double.parseDouble(operator[0]) * Double.parseDouble(operator[2]));
                            break;

                        case '-':
                            res = Double.toString(Double.parseDouble(operator[0]) - Double.parseDouble(operator[2]));
                            break;

                        case '+':
                            res = Double.toString(Double.parseDouble(operator[0]) + Double.parseDouble(operator[2]));
                            break;

                        case '^':
                            res = Double.toString(Math.pow(Double.parseDouble(operator[0]), Double.parseDouble(operator[2])));
                            break;

                        case '√':
                            res = Double.toString(Math.pow(Double.parseDouble(operator[2]),(1 / Double.parseDouble(operator[0]))));
                            break;

                        case '/':
                            res = Double.toString(1 / Double.parseDouble(operator[2]));
                            break;

                        case '!':
                            f = 1;
                            for(int i=1; i<=Double.parseDouble(operator[0]); i++)
                                f = f * i;
                            res = Double.toString(f);
                            break;
                    }
                    display();
                    calculation();
                }
            }
        });
        cal = res;
        calculation();
    }

    public void calculation(){
        calculate.setText(cal);
    }

    public void display(){
        result.setText(res);
    }

    public void clear(){
        cal = "";
        res = "";
        dotins = false;
        opins = false;
    }

    public void backspace(){
        if(! cal.isEmpty()) {
            if(cal.substring(cal.length()-1, cal.length()).equals("."))
                dotins = false;
            if(cal.substring(cal.length()-1, cal.length()).equals(" ")) {
                cal = cal.substring(0, cal.length() - 3);
                opins = false;
            }
            else
                cal = cal.substring(0, cal.length() - 1);
        }
    }

}