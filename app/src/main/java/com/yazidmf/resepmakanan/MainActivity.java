package com.yazidmf.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ResepMakananModel> daftarResepMakanan = new ArrayList<>();
    RecyclerView recyclerView;
    ResepMakananAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        adapter = new ResepMakananAdapter(this, daftarResepMakanan);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
        setData();
    }

    private void setData() {
        daftarResepMakanan.add(new ResepMakananModel("Bakso daging Sapi",
                R.drawable.baksosapi,
                "Untuk yang doyan daging Sapi",
                "Bahan:\nTulang sapi 200 g\nAir 3 L\nBawang merah 5 siung, goreng dan haluskan\nBawang putih 7 siung, goreng dan haluskan\nKaldu sapi instan 2 sdt\nGula pasir 2 sdt\nGaram 2 sdm\nMerica 1 sdt\nDaun bawang 4 batang, ambil bagian putihnya, iris.\n\nCara Membuat:\n1. Masak air hingga mendidih.\n2. Masukkan semua bahan, aduk rata.\n3. Tunggu hingga mendidih lagi."));

        daftarResepMakanan.add(new ResepMakananModel("Bakso daging Ikan",
                R.drawable.baksoikan,
                "Untuk yang doyan daging Ikan",
                "Bahan:\nIkan tenggiri 1 kg, bersihkan duri dan kulit\nBawang putih 4 siung\nTepung sagu 3 sdm\nPutih telur ayam 2 butir\n\nCara Membuat:\n1. Masukkan ikan ke dalam blender dengan bawang putih, putih telur, gula, garam, merica, dan es batu secukupnya. Blender hingga benar-benar halus.\n2. Tuang adonan yang telah diblender ke dalam wadah lalu masukkan tepung sagu perlahan sambil diuleni sampai tercampur rata.\n3. Rebus air dalam panci sampai mendidih.\n4. Ambil adonan daging dengan tangan lalu bentuk bulat baik dengan kedua tangan atau dengan satu tangan ditekan hingga adonan keluar melalui jari telunjuk dan jempol.\n5. Masukkan adonan yang telah terbentuk ke dalam air panas.\n6. Lanjutkan hingga semua adonan habis.\n7. Jika pentol telah mengapung maka pentol telah matang. Angkat."));
        daftarResepMakanan.add(new ResepMakananModel("Bakso daging Ayam",
                R.drawable.baksoayam,
                "Untuk yang doyan daging ayam",
                "Bahan:\nDaging ayam 1 kg, tanpa tulang, giling\nTepung kanji 50 g\nTelur 1 butir\nLada bubuk 2 sdt\n\nGaram 1 sdt\nBawang putih 4 siung, haluskan\nBawang merah goreng 2 sdm\nEs batu 40 g, hancurkan\nAir 2 L\n\nCara Membuat:\n1. Masukkan daging ayam yang telah digiling ke dalam wadah, campurkan tepung kanji, telur, lada bubuk, garam, bawang putih yang telah dihaluskan dan bawang merah goreng.\n2. Campur atau uleni dengan tangan atau bisa menggunakan alat sampai semua tercampur sempurna.\n3. Jika dirasa adonan masih lembek dan sulit dibentuk, maka bisa ditambahkan es batu secara perlahan sampai dirasa adonan bisa dibentuk.\n4. Rebus air dalam panci sampai mendidih.\n5. Ambil adonan daging dengan tangan lalu bentuk bulat baik dengan kedua tangan atau dengan satu tangan ditekan hingga adonan keluar melalui jari telunjuk dan jempol.\n6. Masukkan adonan yang telah terbentuk ke dalam air panas.\n7. Lanjutkan hingga semua adonan habis.\n8. Jika pentol telah mengapung maka pentol telah matang. Angkat."));
        adapter.notifyDataSetChanged();
    }
}
