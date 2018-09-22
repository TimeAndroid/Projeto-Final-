package farcry3.android.com.exemplocaiio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

//Antes de começar a codificar insira a dependência no Gradle
// Dependência >>     implementation 'com.oguzdev:CircularFloatingActionMenu:1.0.2'

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crie o ImageView que será o icone de imagem dos buttons
        ImageView icon = new ImageView(this);
        icon.setImageResource(R.mipmap.ic_launcher);

        //Crie o floatActionButton
        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();

        //associe os "ImageViews" à suas respectivas imagens
        ImageView itemIcon1 = new ImageView(this);
        itemIcon1.setImageResource(R.mipmap.ic_launcher);

        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setImageResource(R.mipmap.ic_launcher);

        ImageView itemIcon3 = new ImageView(this);
        itemIcon3.setImageResource(R.mipmap.ic_launcher);

        ImageView itemIcon4 = new ImageView(this);
        itemIcon4.setImageResource(R.mipmap.ic_launcher);

        ImageView itemIcon5 = new ImageView(this);
        itemIcon5.setImageResource(R.mipmap.ic_launcher);

        //Crie a classe para inserir os subitens
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);


        //Crie objetos SubItens e insira o ImageView nos mesmos
        SubActionButton button1 = itemBuilder.setContentView(itemIcon1).build();
        SubActionButton button2 = itemBuilder.setContentView(itemIcon2).build();
        SubActionButton button3 = itemBuilder.setContentView(itemIcon3).build();
        SubActionButton button4 = itemBuilder.setContentView(itemIcon4).build();
        SubActionButton button5 = itemBuilder.setContentView(itemIcon5).build();

        //attach the sub buttons to the main button

        //Crie o FloatActionMenu principal e adicione à ele os submenus
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .addSubActionView(button4)
                .addSubActionView(button5)
                .attachTo(actionButton)
                .build();


    }
}