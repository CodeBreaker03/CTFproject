package bazzinga.sollunganeengayaaru;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by VJ on 11-Jun-16.
 */
public class Second extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Typeface myTypeface = Typeface.createFromAsset(getAssets() , "GoodDog.otf");
        TextView myTextview1 = (TextView)findViewById(R.id.textView6);
        TextView myTextview2 = (TextView)findViewById(R.id.textView7);
        TextView myTextview3 = (TextView)findViewById(R.id.textView8);
        TextView myTextview4 = (TextView)findViewById(R.id.textView4);
        TextView myTextview5 = (TextView)findViewById(R.id.textView5);
        TextView myTextview6 = (TextView)findViewById(R.id.textView9);
        myTextview1.setTypeface(myTypeface);
        myTextview2.setTypeface(myTypeface);
        myTextview3.setTypeface(myTypeface);
        myTextview4.setTypeface(myTypeface); myTextview5.setTypeface(myTypeface);
        myTextview6.setTypeface(myTypeface);


        TextView nameView=(TextView)findViewById(R.id.textView6);
        TextView nameView2=(TextView)findViewById(R.id.textView7);
        TextView nameView3=(TextView)findViewById(R.id.textView8);
        nameView.setText(getIntent().getExtras().getString("username"));
        nameView2.setText(getIntent().getExtras().getString("dep"));
        nameView3.setText(getIntent().getExtras().getString("wap"));



    }

}
