package com.example.jojo.butterknife;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;




public class MainActivity extends AppCompatActivity {

    /*
    @Bind(R.id.textView)
    TextView texte;


    @OnClick(R.id.button)
    void maMethodeClickable()
    {
       texte.setText("J'ai cliquer");
    }



    @OnClick({R.id.button2,R.id.button3})
    void methodeClickableSimultane()
    {
            texte.setText("Vous venez d'appuyer sur le boutton 2 ou 3.");

    }


    @Bind({R.id.button,R.id.button2,R.id.button3}) List<Button> ListButton;
    @OnClick({R.id.button4})
    void methodeDisable()
    {
        ButterKnife.apply(ListButton,new ButterKnife.Action<View>() {
            @Override
            public void apply(View view, int index) {
                view.setEnabled(false);
            }
        });


    }

    @OnClick({R.id.button5})
    void methodeEnable()
    {
        ButterKnife.apply(ListButton,new ButterKnife.Action<View>() {
            @Override
            public void apply(View view, int index) {
                view.setEnabled(true);
            }
        });


    }



    @BindDrawable(R.drawable.ok)
    Drawable imgOk;
    @Bind(R.id.imageView)
    ImageView img;
    @OnClick(R.id.imageView)
    void changeImage()
    {
        img.setImageDrawable(imgOk);
    }

    @BindColor(R.color.colorAccent) int colorAccent;

    @OnClick(R.id.textView)
    void changeCouleur()
    {
        texte.setTextColor(colorAccent);
    }

    @BindString(R.string.app_name) String app_name;
    @Bind(R.id.textView2) TextView texte2;
    @OnClick(R.id.textView2)
    void changeNom(){
        texte2.setText(app_name);
    }

    @BindDimen(R.dimen.dim20) float dim;
    @Bind(R.id.textView3) TextView texte3;
    @OnClick(R.id.textView3)
    void changeDimension(){
        texte3.setTextSize(dim);
    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  ButterKnife.bind(this);
      //  texte.setText("lol");
    }

}
