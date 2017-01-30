package user.com.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static TextView attempts;
    private static Button login;
    int count=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton();
        ClickedBttn();
    }

    private void ClickedBttn() {
        login=(Button)findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.btnlogin){
                    username=(EditText)findViewById(R.id.edtusername);
                    String str=username.getText().toString();
                    Intent intent=new Intent();
                    intent.putExtra(str,true);
                    startActivity(intent);
                }
            }
        });
    }

   private void clickButton() {
        username=(EditText)findViewById(R.id.edtusername);
        password=(EditText)findViewById(R.id.edtpassword);
        attempts=(TextView)findViewById(R.id.txtattempt);
        login=(Button)findViewById(R.id.btnlogin);

        attempts.setText(Integer.toString(count));
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("user")&& password.getText().toString().equals("pass")){
                    Toast.makeText(MainActivity.this,"username and Password Correct",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent("user.com.loginapp.userActivity");
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"username and Password InCorrect",Toast.LENGTH_LONG).show();
                    count--;
                    attempts.setText(Integer.toString(count));
                            if(count==0){
                                login.setEnabled(false);
                            }
                }
            }
        });
    }
}
