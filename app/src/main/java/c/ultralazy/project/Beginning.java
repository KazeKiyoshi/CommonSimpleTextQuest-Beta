package c.ultralazy.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Beginning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginning);
        Button dumpB=(Button) findViewById(R.id.StartB);
        dumpB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent todump=new Intent(Beginning.this, DumpEnd.class);
                startActivity(todump);
            }
        });
    }

}
