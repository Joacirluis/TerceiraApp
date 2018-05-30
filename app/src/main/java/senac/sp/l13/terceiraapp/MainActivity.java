package senac.sp.l13.terceiraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sairSistema(View view) {
        finish();
    }

    public void entrarSistema(View view) {

        Intent intent = new Intent(MainActivity.this,MenuActivity.class);
        startActivity(intent);
        finish();

        Toast.makeText(MainActivity.this,"Em contrução", Toast.LENGTH_SHORT).show();

    }
}
