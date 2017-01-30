package user.com.compoundview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import android.support.v7.widget.LinearLayoutCompat;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout=(LinearLayout) findViewById(R.id.layoutOptions);
        layout.addView(Infostatus("using touch gestures that loosely correspond to real-world actions, such as swiping, tapping and pinching, to manipulate on-screen objects, along with a virtual \n" +
                "keyboard for text input"));;
        layout.addView(Infostatus("In addition to touchscreen devices, Google has further developed Android TV for televisions, Android Auto for cars, and Android Wear for wrist watches, each with a specialized user interface."));;
        layout.addView(Infostatus("Variants of Android are also used on notebooks, game consoles, digital cameras, and other electronics."));;

    }

         private View Infostatus(String status) {
          LayoutInflater inflater=getLayoutInflater();
          View compoundView= inflater.inflate(R.layout.social_media,null,false);
          TextView txt= (TextView)compoundView.findViewById(R.id.layoutOptions);
          txt.setText(status);
          return  compoundView;

    }
}
