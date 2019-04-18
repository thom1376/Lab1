package com.example.helloconstraint;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
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
        mCount++;
        if (binding.showCount != null)
            binding.showCount.setText(Integer.toString(mCount));
    }

    public void setZero(View view) {
        mCount = 0;
        if (binding.showCount != null)
            binding.showCount.setText(Integer.toString(mCount));
    }
}
