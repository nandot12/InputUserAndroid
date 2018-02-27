package id.co.imastudio.inputuserandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2 ;
    TextView textHasil ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        input1 = findViewById(R.id.input1);
       input2 = findViewById(R.id.input2);
       textHasil = findViewById(R.id.txtHasil);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void hitung(View view) {


        //tangkap dari inputan user
       String tangkap1 =  input1.getText().toString();
        String tangkap2 = input2.getText().toString();

        //check kalau seandainya kosong
        if(tangkap1.isEmpty()){

            input1.setError("harus diisi");
            Toast.makeText(MainActivity.this, "Input 1 Kosong", Toast.LENGTH_SHORT).show();
        }
        else if (tangkap2.isEmpty()){
            Toast.makeText(MainActivity.this, "Input 2 Kosong", Toast.LENGTH_SHORT).show();
        }
        else {
            //bist bisa di kalkulasi ubah type string jadi double
            Double convert1 =  Double.parseDouble(tangkap1);
            Double convert2 = Double.parseDouble(tangkap2);

            //kalikan
            Double hasil = convert1 * convert2;
            //hasil tinggal pindahin ke textview
            textHasil.setText(hasil.toString());
        }



    }

    public void clear(View view) {
    }
}
