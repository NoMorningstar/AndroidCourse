package cool.hhhhh.score;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import cool.hhhhh.score.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MyViewModel myViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(this);
    }
}