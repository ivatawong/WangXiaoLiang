package cn.studyjams.s1.sj30.wangxiaoliang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lishi(View view) {
        Intent intent = new Intent(MainActivity.this, Main1Activity.class);
        startActivity(intent);
    }

    public void zhongzhi(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void hongpei(View view) {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }

    public void tiaozhi(View view) {
        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }

    public void pinchang(View view) {
        Intent intent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);
    }
}
