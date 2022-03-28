package i.have.an.sellonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.time.Instant;

public class StepsActivty extends AppCompatActivity {

    Button gst,acc, pdt, lst, odr, add, pay;
    TextView head;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_steps_activty);

        head = findViewById(R.id.step_h);

        String ptfm = getIntent().getStringExtra("ptfm");

        if(ptfm.equals("amzn")){

            head.setText(head.getText().toString()+" for Amazon");

        }else if(ptfm.equals("flkr")){

            head.setText(head.getText().toString()+" for Flipkart");

        }else if(ptfm.equals("mesh")){

            head.setText(head.getText().toString()+" for Meesho");

        }else if(ptfm.equals("shop")){

            head.setText(head.getText().toString()+" for Shopee");

        }

        gst = findViewById(R.id.stpgstbtn);
        acc = findViewById(R.id.stpsabtn);
        pdt = findViewById(R.id.stpproductbtn);
        lst = findViewById(R.id.stplistingbtn);
        odr = findViewById(R.id.stporderbtn);
        add = findViewById(R.id.stpaddbtn);
        pay = findViewById(R.id.stppaybtn);

        gst.setOnClickListener(view -> {

            if(ptfm.equals("amzn")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","agst"));

            }else if(ptfm.equals("flkr")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","fgst"));

            }else if(ptfm.equals("mesh")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","mgst"));

            }else if(ptfm.equals("shop")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","sgst"));

            }

        });

        acc.setOnClickListener(view -> {

            if(ptfm.equals("amzn")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","aacc"));

            }else if(ptfm.equals("flkr")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","facc"));

            }else if(ptfm.equals("mesh")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","macc"));

            }else if(ptfm.equals("shop")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","sacc"));

            }

        });

        pdt.setOnClickListener(view -> {

            if(ptfm.equals("amzn")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","apdt"));

            }else if(ptfm.equals("flkr")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","fpdt"));

            }else if(ptfm.equals("mesh")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","mpdt"));

            }else if(ptfm.equals("shop")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","spdt"));

            }

        });

        lst.setOnClickListener(view -> {

            if(ptfm.equals("amzn")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","alst"));

            }else if(ptfm.equals("flkr")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","flst"));

            }else if(ptfm.equals("mesh")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","mlst"));

            }else if(ptfm.equals("shop")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","slst"));

            }

        });

        odr.setOnClickListener(view -> {

            if(ptfm.equals("amzn")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","aodr"));

            }else if(ptfm.equals("flkr")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","fodr"));

            }else if(ptfm.equals("mesh")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","modr"));

            }else if(ptfm.equals("shop")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","sodr"));

            }

        });

        add.setOnClickListener(view -> {

            if(ptfm.equals("amzn")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","aadd"));

            }else if(ptfm.equals("flkr")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","fadd"));

            }else if(ptfm.equals("mesh")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","madd"));

            }else if(ptfm.equals("shop")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","sadd"));

            }

        });

        pay.setOnClickListener(view -> {

            if(ptfm.equals("amzn")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","apay"));

            }else if(ptfm.equals("flkr")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","fpay"));

            }else if(ptfm.equals("mesh")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","mpay"));

            }else if(ptfm.equals("shop")){

                startActivity(new Intent(this,InfoActivity.class).putExtra("pgif","spay"));

            }

        });

    }
}