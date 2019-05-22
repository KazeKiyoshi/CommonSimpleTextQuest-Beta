package c.ultralazy.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DumpEnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dump_end);
        Button retryB=(Button) findViewById(R.id.StartB);
        retryB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent tomenu=new Intent(DumpEnd.this, MainActivity.class);
                startActivity(tomenu);
            }
        });
    }
}
