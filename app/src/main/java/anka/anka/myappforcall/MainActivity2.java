package anka.anka.myappforcall;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private final static String TEXT = "PARAM";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text = findViewById(R.id.nameEditText);
        Button runEcho = findViewById(R.id.runEchoButton);
        runEcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("example://intent");
                Intent runEchoIntent = new Intent(Intent.ACTION_VIEW, uri);
                runEchoIntent.putExtra(TEXT, text.getText().toString());
                startActivity(runEchoIntent);
            }
        });
    }
}
