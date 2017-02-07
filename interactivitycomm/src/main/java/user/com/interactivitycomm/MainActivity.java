package user.com.interactivitycomm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String Key_MY_Name="myName";
    public static final String Key_BOOL="boolean";
    public static final int REQ_NEW =1234 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
         Intent intent=new Intent(MainActivity.this,NewActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString(Key_MY_Name,getName());
                bundle.putBoolean(Key_BOOL,true);
                intent.putExtras(bundle);
               // startActivity(intent);
                startActivityForResult(intent,REQ_NEW);

            }
        });

    }

    private String getName() {
        return ((EditText)findViewById(R.id.edtName)).getText().toString();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
          if(requestCode==REQ_NEW){
         if(resultCode==RESULT_OK){
             Bundle bundleBack=data.getExtras();
             String resultBack =bundleBack.getString(NewActivity.KEY_MY_RES);
         }

}
    }
}
