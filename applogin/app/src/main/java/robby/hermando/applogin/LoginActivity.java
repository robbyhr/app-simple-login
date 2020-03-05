package robby.hermando.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView newregister = (TextView)findViewById(R.id.txtdaftar);
        newregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newregister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(newregister);
            }
        });
    }

//    public void register(View view) {
//        Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
//        startActivity(i);
//    }

    public void login(View view) {
        Intent masuk = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(masuk);
    }


}
