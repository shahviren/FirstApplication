package user.com.checkboxexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox cb1, cb2, cb3;
    private Button Select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*addListenerOnButton();*/
        addListenerToCheckBox();
    }

    private void addListenerToCheckBox() {
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);


        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this, "Cricket is Selected", Toast.LENGTH_LONG).show();
                }
                }

        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this, "Football is Selected", Toast.LENGTH_LONG).show();

                }
                }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this, "Hockey is Selected", Toast.LENGTH_LONG).show();

                }
            }
        });


    }
}


    /*private void addListenerOnButton() {
        cb1= (CheckBox) findViewById(R.id.cb1);
        cb2=(CheckBox)findViewById(R.id.cb2);
        cb3=(CheckBox)findViewById(R.id.cb3);
        Select=(Button)findViewById(R.id.btnselect);

        Select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result=new StringBuffer();
                result.append("Cricket ").append(cb1.isChecked());
                result.append("Football").append(cb2.isChecked());
                result.append("Hockey").append(cb3.isChecked());
                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();

            }
        });

    }
*/



