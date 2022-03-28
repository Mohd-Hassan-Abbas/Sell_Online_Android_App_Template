package i.have.an.sellonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView h,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_info);

        String info = getIntent().getStringExtra("pgif");

        h = findViewById(R.id.ifhtxt);
        p = findViewById(R.id.ifptxt);

        if(info.equals("agst")){

            h.setText("GST FOR AMAZON");
            p.setText("available soon");

        }else if(info.equals("fgst")){

            h.setText("GST FOR FLIPKART");
            p.setText("available soon");

        }
        else if(info.equals("mgst")){

            h.setText("GST FOR MEESHO");
            p.setText("available soon");

        }else if(info.equals("sgst")){

            h.setText("GST FOR SHOPEE");
            p.setText("available soon");

        }else if(info.equals("aacc")){

            h.setText("CREATE ACCOUNT AMAZON");
            p.setText("available soon");

        }else if(info.equals("facc")){

            h.setText("CREATE ACCOUNT FLIPKART");
            p.setText("available soon");

        }else if(info.equals("macc")){

            h.setText("CREATE ACCOUNT MEESHO");
            p.setText("available soon");

        }else if(info.equals("sacc")){

            h.setText("CREATE ACCOUNT SHOPEE");
            p.setText("available soon");

        }else if(info.equals("apdt")){

            h.setText("ADD PRODUCT AMAZON");
            p.setText("available soon");

        }else if(info.equals("fpdt")){

            h.setText("ADD PRODUCT FLIPKART");
            p.setText("available soon");

        }else if(info.equals("mpdt")){

            h.setText("ADD PRODUCT MEESHO");
            p.setText("available soon");

        }else if(info.equals("spdt")){

            h.setText("ADD PRODUCT SHOPEE");
            p.setText("available soon");

        }else if(info.equals("alst")){

            h.setText("EDIT LISTING AMAZON");
            p.setText("available soon");

        }else if(info.equals("flst")){

            h.setText("EDIT LISTING FLIPKART");
            p.setText("available soon");

        }else if(info.equals("mlst")){

            h.setText("EDIT LISTING MEESHO");
            p.setText("available soon");

        }else if(info.equals("slst")){

            h.setText("EDIT LISTING SHOPEE");
            p.setText("available soon");

        }else if(info.equals("aodr")){

            h.setText("ORDER PROCESS IN AMAZON");
            p.setText("available soon");

        }else if(info.equals("fodr")){

            h.setText("ORDER PROCESS IN FLIPKART");
            p.setText("available soon");

        }else if(info.equals("modr")){

            h.setText("ORDER PROCESS IN MEESHO");
            p.setText("available soon");

        }else if(info.equals("sodr")){

            h.setText("ORDER PROCESS IN SHOPEE");
            p.setText("available soon");

        }else if(info.equals("aadd")){

            h.setText("ADVERTISEMENT IN AMAZON");
            p.setText("available soon");

        }else if(info.equals("fadd")){

            h.setText("ADVERTISEMENT IN FLIPKART");
            p.setText("available soon");

        }else if(info.equals("madd")){

            h.setText("ADVERTISEMENT IN MEESHO");
            p.setText("available soon");

        }else if(info.equals("sadd")){

            h.setText("ADVERTISEMENT IN SHOPEE");
            p.setText("available soon");

        }else if(info.equals("apay")){

            h.setText("PAYMENT INFO AMAZON");
            p.setText("available soon");

        }else if(info.equals("fpay")){

            h.setText("PAYMENT INFO FLIPKART");
            p.setText("available soon");

        }else if(info.equals("mpay")){

            h.setText("PAYMENT INFO MEESHO");
            p.setText("available soon");

        }else if(info.equals("spay")){

            h.setText("PAYMENT INFO SHOPEE");
            p.setText("available soon");

        }

    }
}