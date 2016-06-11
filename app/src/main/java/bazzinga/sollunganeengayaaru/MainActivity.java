package bazzinga.sollunganeengayaaru;


import android.content.Intent;


import android.graphics.Typeface;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    private  static final int PICK_IMAGE =100;
    Uri imageUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface myTypeface = Typeface.createFromAsset(getAssets() , "GoodDog.otf");
        TextView myTextview1 = (TextView)findViewById(R.id.textView);
        TextView myTextview2 = (TextView)findViewById(R.id.textView2);
        TextView myTextview3 = (TextView)findViewById(R.id.textView3);
        myTextview1.setTypeface(myTypeface);
        myTextview2.setTypeface(myTypeface);
        myTextview3.setTypeface(myTypeface);

        imageView = (ImageView)findViewById(R.id.imageView1);
        button =(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openGallery();
            }
        });

        final EditText et=(EditText)findViewById(R.id.editText);
        final EditText et1=(EditText)findViewById(R.id.editText2);
        final EditText et2=(EditText)findViewById(R.id.editText3);

        button=(Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Second.class);
                 intent.putExtra("username",et.getText().toString());
                intent.putExtra("dep",et1.getText().toString());
                intent.putExtra("wap",et2.getText().toString());

                startActivity(intent);
            }
        });

    }


    private void openGallery(){
        Intent gallery =new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode==RESULT_OK && requestCode== PICK_IMAGE){
            imageUri= data.getData();
            imageView.setImageURI(imageUri);
        }
    }
}
