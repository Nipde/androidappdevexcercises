package website.weaccidentally.basicuiex2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button butt;
    AutoCompleteTextView user;
    EditText passu;
    TextView txt1, txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            AutoCompleteTextView actv = (AutoCompleteTextView)
                    findViewById(R.id.login); // add stings to control
            ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                    android.R.layout.simple_dropdown_item_1line,
                    new String[]
                            {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
            actv.setAdapter(aa);
    }
    public void Logintoast(View view) {
        txt1=(TextView)findViewById(R.id.namereq);
        txt2=(TextView)findViewById(R.id.passreq);
        user=(AutoCompleteTextView)findViewById(R.id.login);
        passu=(EditText)findViewById(R.id.passwordfield);
        butt=(Button)findViewById(R.id.logarubuttonru);
        if (user.getText().toString().equals("Pasi")||
            user.getText().toString().equals("Juha")||
            user.getText().toString().equals("Kari")||
            user.getText().toString().equals("Jouni")||
            user.getText().toString().equals("Esa")||
            user.getText().toString().equals("Hannu")&&
                    passu.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(),"Congrats!",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"wrong! get out!",Toast.LENGTH_SHORT).show();
            txt1.setBackgroundColor(Color.RED);
            txt2.setBackgroundColor(Color.RED);
        }

    }
}
