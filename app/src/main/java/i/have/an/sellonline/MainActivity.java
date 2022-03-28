package i.have.an.sellonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        new Handler().postDelayed(() -> {

            Intent mainIntent = new Intent(MainActivity.this,PlatformActivity.class);
            startActivity(mainIntent);
            finish();
        }, 3000);
    }
}



//THANK YOU FOR WATCHING
  //      ____