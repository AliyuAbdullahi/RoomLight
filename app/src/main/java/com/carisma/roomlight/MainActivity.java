package com.carisma.roomlight;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;

import com.carisma.roomlight.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MainActivityViewModel viewModel = new MainActivityViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setListener(this);
        binding.setVieModel(viewModel);
    }

    public void onCheckedChange(CompoundButton button, boolean isChecked) {
        viewModel.lightOn.set(isChecked);
    }
}
