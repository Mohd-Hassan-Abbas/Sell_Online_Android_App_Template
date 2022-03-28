package i.have.an.sellonline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class PlatformActivity extends AppCompatActivity {

    Button amzn;
    Button flpkrt;
    Button msh;
    Button shp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_platform);

        amzn = findViewById(R.id.amzn_btn);
        flpkrt = findViewById(R.id.fpkt_btn);
        msh = findViewById(R.id.msh_btn);
        shp = findViewById(R.id.shp_btn);

        amzn.setOnClickListener(view -> {

            startActivity(new Intent(this, StepsActivty.class).putExtra("ptfm","amzn"));
        });

        flpkrt.setOnClickListener(view -> {

            startActivity(new Intent(this, StepsActivty.class).putExtra("ptfm","flkr"));
        });

        msh.setOnClickListener(view -> {

            startActivity(new Intent(this, StepsActivty.class).putExtra("ptfm","mesh"));
        });

        shp.setOnClickListener(view -> {

            startActivity(new Intent(this, StepsActivty.class).putExtra("ptfm","shop"));
        });

    }
}