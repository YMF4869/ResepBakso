package com.yazidmf.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetilActivity extends AppCompatActivity {

    private static final String BUNDLE_RESEP =
            "com.yazidmf.resepmakanan.DetilActivity.BUNDLE_RESEP";

    ResepMakananModel resep;
    TextView textJudul;
    TextView textIsi;
    ImageView image;

    public static Intent getStartIntent(Context context, ResepMakananModel resep) {
        Intent intent = new Intent(context, DetilActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(BUNDLE_RESEP, resep);
        intent.putExtras(bundle);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textJudul = (TextView) findViewById(R.id.text_judul);
        textIsi = (TextView) findViewById(R.id.text_isi);
        image = (ImageView) findViewById(R.id.image);

        resep = (ResepMakananModel) getIntent().getExtras().getSerializable(BUNDLE_RESEP);
        textJudul.setText(resep.getJudul());
        textIsi.setText(resep.getIsi());
        image.setImageResource(resep.getGambar());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if (getParentActivityIntent() == null) {
                    onBackPressed();
                } else {
                    NavUtils.navigateUpFromSameTask(this);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
