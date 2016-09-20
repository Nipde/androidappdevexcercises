package website.weaccidentally.maplaunchex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMap(View view) {
        EditText lati = (EditText) findViewById(R.id.latfield);
        EditText longi = (EditText) findViewById(R.id.lngfield);
        String numberOne = lati.getText().toString();
        String numberTwo = longi.getText().toString();
        double lat = Double.parseDouble(numberOne);
        double lng = Double.parseDouble(numberTwo);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:"+lat+","+lng));
        startActivity(intent);
    }
}
