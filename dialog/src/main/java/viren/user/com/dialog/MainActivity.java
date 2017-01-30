package viren.user.com.dialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnalert).setOnClickListener(this::click);

    }

    private void click(View view)
    {
        if(view.getId()==R.id.btnalert)showAlert();

    }

    private void showAlert()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher)
                .setMessage(R.string.message)
                .setTitle(R.string.title);
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}
