package kr.co.tjoeun.a20200318_03_listview01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import kr.co.tjoeun.a20200318_03_listview01.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);



        setupEvents();
        setvalues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setvalues() {

    }
}
