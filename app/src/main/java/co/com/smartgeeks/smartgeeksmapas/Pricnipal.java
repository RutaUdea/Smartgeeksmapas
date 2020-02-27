package co.com.smartgeeks.smartgeeksmapas;


import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pricnipal extends AppCompatActivity implements MapasFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricnipal);

        Fragment fragmento = new MapasFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragmento).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
