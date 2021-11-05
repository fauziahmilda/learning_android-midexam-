package com.punyafauz.artcafe;

import android.content.Context;

import com.bsoandroid.foodapp.R;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Cheesecake Gemina",
                "Cheesecake gemina, merupakan cheescake sempurna dengan perpaduan manis dan" +
                        "lembut yang harmonis. Krim yang ringan dapat membuat kamu good mood.",
                15000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Donut Montok",
                "Uhuy.. siapa yang gak suka liat yang eh.. iya donut. Donut cantik yang menggoda," +
                        " dengan pinggiran topping yang renyah juga manis. Cocok untuk jadi menu makanan pembuka" +
                        " yang bikin hari makin cerah. Pesan? ayo, gak cukup satu.",
                5000, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Batagor Endolita",
                "Batagor yang kaya rasa dengan bumbu kacang super legit. Tidak ada duanya" +
                        " sampai kalian dapat lupa hari tahun tanggal dan apapun. Ini patut dicoba.",
                7000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad",
                "Makananan Salad",
                20000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Caphuchino Numero Uno",
                "Capuhcino khas Art Cafe, memiliki cita rasa unik dengan aroma yang mengesankan." +
                        " Kalian tak akan lupa rasanya dan membuat ketagihan.",
                15000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Kopi Hitam",
                "Kopi Hitam yang murnni tidak hanya dapat membuatmu lebih berenergi. Ternyata," +
                        "kopi hitam ini memilki banyak khasiat jika dikonsumsi secara rutin.",
                5000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Sparkling Tea + Cherry Blossom",
                "Minuman varian baru! Ini dia Sparkling tea, minuman menyegarkan yang pas untuk suasana panas!." +
                        " Liat pacar selingkuh? Doi yang lirik orang lain? Ademin aja sama sparkling tea di Art Cafe." +
                        " Dijamin, lupaaa sama buaya-buaya kampret.",
                5000, context.getDrawable(R.drawable.sparkling_tea)));
        list.add(new Food("Cireng",
                "Cireng khas sunda, dengan isinya yang bervariasi. Mulai dari keju, daging ayam dan sapi," +
                        "telur, mentega, seblak, dan lainnya. Bisa kamu pilih dan mix and match dengan" +
                        " kreatif. Ayo coba!",
                10000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Nasi Goreng",
                "Nasi goreng, menu umum sederhana namun penuh rasa dan kenangan manisnya." +
                        " Ditemani teman, doi, maupun orang tua. Nasi Goreng ini akan lebih nikmat dan spesial" +
                        " jika kalian makan di tempat. Topping dapat kalian pesan sesuai keinginan!!!",
                10000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Mie Goreng",
                "Mie Goreng, keriting namun manis. Mau pedas? Original? dan request rasa yang kalian inginkan?" +
                        " Tentu saja bisa. Yuk coba.",
                5000, context.getDrawable(R.drawable.mie_goreng)));

        return list;
    }
}
