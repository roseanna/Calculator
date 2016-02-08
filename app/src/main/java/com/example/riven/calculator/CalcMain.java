package com.example.riven.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;

public class CalcMain extends AppCompatActivity implements View.OnClickListener {
    public String toSolve = "0";
    public boolean enter = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_main);

        // all the buttons
        final LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        final Button zero   = (Button) findViewById(R.id.zero);
        final Button one    = (Button) findViewById(R.id.one);
        final Button two    = (Button) findViewById(R.id.two);
        final Button three  = (Button) findViewById(R.id.three);
        final Button four   = (Button) findViewById(R.id.four);
        final Button five   = (Button) findViewById(R.id.five);
        final Button six    = (Button) findViewById(R.id.six);
        final Button seven  = (Button) findViewById(R.id.seven);
        final Button eight  = (Button) findViewById(R.id.eight);
        final Button nine   = (Button) findViewById(R.id.nine);
        final Button equal  = (Button) findViewById(R.id.equal);
        final Button minus  = (Button) findViewById(R.id.minus);
        final Button plus   = (Button) findViewById(R.id.plus);
        final Button div    = (Button) findViewById(R.id.div);
        final Button mul    = (Button) findViewById(R.id.mul);
        final Button del    = (Button) findViewById(R.id.del);
        final Button dec    = (Button) findViewById(R.id.dec);

        final TextView display = (TextView) findViewById(R.id.display);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        equal.setOnClickListener(this);
        del.setOnClickListener(this);
        dec.setOnClickListener(this);

        setText();
    }

    public void setText(){
        final TextView display = (TextView) findViewById(R.id.display);
        display.setText(toSolve);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "+", Toast.LENGTH_SHORT).show();
        switch (v.getId()){
            case R.id.zero:
                if (enter == true)
                    break;
                if (!(toSolve.equals("0") || toSolve.endsWith(" 0")))
                    toSolve += "0";
                break;
            case R.id.one:
                if (enter == true)
                    break;
                if (toSolve.equals("0"))
                    toSolve = "1";
                else if(toSolve.length() > 1 && toSolve.endsWith(" 0"))
                    toSolve = toSolve.substring(0, toSolve.length()-2) + " 1";
                else
                    toSolve += "1";
                break;
            case R.id.two:
                if (enter == true)
                    break;
                if (toSolve.equals("0"))
                    toSolve = "2";
                else if(toSolve.length() > 1 && toSolve.endsWith(" 0"))
                    toSolve = toSolve.substring(0, toSolve.length()-2) + " 2";
                else
                    toSolve += "2";
                break;
            case R.id.three:
                if (enter == true)
                    break;
                if (toSolve.equals("0"))
                    toSolve = "3";
                else if(toSolve.length() > 1 && toSolve.endsWith(" 0"))
                    toSolve = toSolve.substring(0, toSolve.length()-2) + " 3";
                else
                    toSolve += "3";
                break;
            case R.id.four:
                if (enter == true)
                    break;
                if (toSolve.equals("0"))
                    toSolve = "4";
                else if(toSolve.length() > 1 && toSolve.endsWith(" 0"))
                    toSolve = toSolve.substring(0, toSolve.length()-2) + " 4";
                else
                    toSolve += "4";
                break;
            case R.id.five:
                if (enter == true)
                    break;
                if (toSolve.equals("0"))
                    toSolve = "5";
                else if(toSolve.length() > 1 && toSolve.endsWith(" 0"))
                    toSolve = toSolve.substring(0, toSolve.length()-2) + " 5";
                else
                    toSolve += "5";
                break;
            case R.id.six:
                if (enter == true)
                    break;
                if (toSolve.equals("0"))
                    toSolve = "6";
                else if(toSolve.length() > 1 && toSolve.endsWith(" 0"))
                    toSolve = toSolve.substring(0, toSolve.length()-2) + " 6";
                else
                    toSolve += "6";
                break;
            case R.id.seven:
                if (enter == true)
                    break;
                if (toSolve.equals("0"))
                    toSolve = "7";
                else if(toSolve.length() > 1 && toSolve.endsWith(" 0"))
                    toSolve = toSolve.substring(0, toSolve.length()-2) + " 7";
                else
                    toSolve += "7";
                break;
            case R.id.eight:
                if (enter == true)
                    break;
                if (toSolve.equals("0"))
                    toSolve = "8";
                else if(toSolve.length() > 1 && toSolve.endsWith(" 0"))
                    toSolve = toSolve.substring(0, toSolve.length()-2) + " 8";
                else
                    toSolve += "8";
                break;
            case R.id.nine:
                if (enter == true)
                    break;
                if (toSolve.equals("0"))
                    toSolve = "9";
                else if(toSolve.length() > 1 && toSolve.endsWith(" 0"))
                    toSolve = toSolve.substring(0, toSolve.length()-2) + " 9";
                else
                    toSolve += "9";
                break;
            case R.id.plus:
                if (enter == true)
                    enter = false;
                if (!toSolve.endsWith(" "))
                    toSolve += " + ";
                else
                    toSolve = toSolve.substring(0, toSolve.length()-3) + " + ";
                break;
            case R.id.mul:
                if (enter == true)
                    enter = false;
                if (!toSolve.endsWith(" "))
                    toSolve += " * ";
                else
                    toSolve = toSolve.substring(0, toSolve.length()-3) + " * ";
                break;
            case R.id.minus:
                if (enter == true)
                    enter = false;
                if (!toSolve.endsWith(" "))
                    toSolve += " - ";
                else
                    toSolve = toSolve.substring(0, toSolve.length()-3) + " - ";
                break;
            case R.id.div:
                if (enter == true)
                    enter = false;
                if (!toSolve.endsWith(" "))
                    toSolve += " / ";
                else
                    toSolve = toSolve.substring(0, toSolve.length()-3) + " / ";
                break;
            case R.id.del:
                if (enter == true)
                    enter = false;
                toSolve = "";
                break;
            case R.id.dec:
                toSolve += ".";
                enter = false;
                break;
            case R.id.equal:
                solving();
                break;
            default:
                break;
        }
        setText();

    }


    public void solving(){
        Deque<Double> nums = new ArrayDeque<Double>();
        Deque<String> ops = new ArrayDeque<String>();
        String[] parts = toSolve.split(" ");
        for (String i: parts){
            if(isNumeric(i)){
                nums.add(Double.parseDouble(i));
                if (ops.size() > 0 && (ops.getLast().equals("*") || ops.getLast().equals("/"))){
                    double n1 = nums.removeLast();
                    double n2 = nums.removeLast();
                    String o = ops.removeLast();
                    double newNum = getResult(n2, n1, o);
                    nums.add(newNum);
                }
            }else{
                ops.add(i);
            }
        }
        while (nums.size() > 1){
            double num1 = nums.pop();
            double num2 = nums.pop();
            String op = ops.pop();
            double result = getResult(num1, num2, op);
            nums.add(result);
        }
        Double finalResult = nums.pop();
        toSolve = finalResult.toString();
        if (toSolve.endsWith(".0"))
            toSolve = toSolve.substring(0, toSolve.length()-2);
        enter = true;
    }

    public double getResult(double num1, double num2, String op){
        switch (op){
            case "+":
                return num1+num2;
            case "/":
                return num1/num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1*num2;
            default:
                break;
        }
        return 0.0;
    }
    public boolean isNumeric(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
}
