package com.example.helloconstraint;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.helloconstraint.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        if (mCount++ == 0)
            binding.buttonZero.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        if (binding.showCount != null)
            binding.showCount.setText(Integer.toString(mCount));
        if (mCount % 2 == 0)
            binding.buttonCount.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        else
            binding.buttonCount.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }

    public void setZero(View view) {
        if (mCount != 0)
            binding.buttonZero.setBackgroundColor(Color.LTGRAY);
            binding.buttonCount.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        mCount = 0;
        if (binding.showCount != null)
            binding.showCount.setText(Integer.toString(mCount));
    }
}
