package com.example.listpoltek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> gambarPoltek = new ArrayList<>();
    private ArrayList<String> namaPoltek = new ArrayList<>();
    private ArrayList<String> infoPoltek = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    //untuk mengambil sumber data yang akan ditampilkan
    private void  prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(gambarPoltek, namaPoltek, infoPoltek, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    //untuk menginputkan data
    private void getDataFromInternet() {
        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjkvMDYvMzkvNTIvMGIxOTM3MDYtMThlYi00ZDYzLWEyY2MtY2Q5NDkxNGJhMzVlLyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=15f65037bb768b21");
        namaPoltek.add("Politeknik Negeri Malang");
        infoPoltek.add("Politeknik Negeri Malang (Polinema) awalnya bernama Program Pendidikan Diploma Bidang Teknik, Universitas Brawijaya. Polinema dibuka berdasarkan Surat Keputusan Dirjen DIKTI, MENDIKBUD No.03/DJ/Kep/1979 yang didirikan oleh Pemerintah Indonesia melalui dana Bank Dunia. Pada tahun 1982, Polinema hanya membuka empat jurusan yakni Teknik Elektronika, Teknik Listrik, Teknik Mesin, dan Teknik Sipil.");

        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjMvMDkvMzEvMjYvOThhOWM3YzUtYmU1NS00NGU5LThjZmUtNWRlYjNiMDNkNjViLyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=eb0860b11618de17");
        namaPoltek.add("Politeknik Negeri Bandung");
        infoPoltek.add("Berdiri sejak 27 Januari 1979 melalui Surat Keputusan dari Direktur Jendral Pendidikan Tinggi, Politeknik Negeri Bandung (Polban) semakin cemerlang dari waktu ke waktu. Buktinya kampus ini sudah terakreditasi sangat baik. Program studi yang ditawarkan juga beragam dengan menitikberatkan bidang teknik sebagai konsentrasi studinya. Lokasi kampus Polban yang berada di salah satu sudut kota Bandung menjadikannya sebagai tempat yang kondusif untuk belajar. Berikut ulasan seputar Polban.");

        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjMvMDkvMzQvNDAvNjZjMWZmYjQtMjgyMy00ZjZhLTgzZmEtM2QyNjZjM2E3MWQyLyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=2e726feb69e1b62d");
        namaPoltek.add("Politeknik Negeri Sriwijaya");
        infoPoltek.add("Politeknik yang dahulunya bernama Politeknik Universitas Sriwijaya ini secara resmi dibuka pada tanggal 20 September 1982. Sesuai dengan perkembangan Politeknik yang mampu menghasilkan alumni yang dapat memenuhi kebutuhan pasar kerja baik lokal, nasional maupun internasional akhirnya Politeknik Negeri Sriwijaya mandiri sejak tahun 1998.");

        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjMvMDkvNDIvMjUvOGRmNDljNmItZWQ3YS00N2Y1LWI2NmUtNjNkZTI5NTU0ZmNkLyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=e6fbd89efcb66776");
        namaPoltek.add("Politeknik Negeri Jakarta");
        infoPoltek.add("Politeknik Negeri Jakarta memiliki berbagai program kerja sama, baik dengan institusi pendidikan maupun industri guna meningkatkan keahlian dan kompetensi mahasiswa. Pada taraf nasional, PNJ menjalin kerja sama dengan perusahaan-perusahaan ternama seperti: PT. Pertamina (Persero), PT. Jasa Marga, PT. Waskita Karya (Persero) Tbk, PT. Trakindo Utama, dan lain sebagainya. Secara umum, bentuk kerja sama yang dijalin ialah pengembangan kurikulum dan program praktik industri (PPI).");

        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjkvMDYvNDAvMzMvMjgwZDVlNDEtZDNjNC00YWU1LTljNmItZDgxMDczNzc0NDhmLyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=d8c2042b158463de");
        namaPoltek.add("Politeknik Elektronika " +
                "Negeri Surabaya");
        infoPoltek.add("Politeknik Elektonika Negeri Surabaya (PENS) yang terkenal dengan tim robotiknya, ternyata memiliki sejarah yang cukup panjang lho. Gedung kampus PENS sendiri merupakan pemberian dari pemerintahan Jepang. Nama Politeknik Elektronika & Telekomunikasi (PET) yang diresmikan tahun 1988 berganti nama menjadi Politeknik Elektronika Surabaya (PES) pada tahun 1991. Pada tahun 1996, PES diubah menjadi Politeknik Elektronika Negeri Surabaya (PENS). Kemudian tahun 2012, PENS melepaskan diri dari Institut Teknologi Sepuluh Nopember (ITS).");

        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjkvMDYvNDEvMzUvYTgzNWM0NTUtZjQzNS00OWEzLWEyNGYtZWJhMzk1Yjc1YjhhLyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=2326d5c960351855");
        namaPoltek.add("Politeknik Negeri " +
                "Ujung Pandang");
        infoPoltek.add("Politeknik Negeri Ujung Pandang (PNUP) kini telah mempunyai kampus II yang terletak di daerah Moncongloe, Kabupaten Maros. PNUP saat ini mengelola 11 program studi D-3 dan 10 program studi S-1 terapan yang terfokus pada bidang engineering dan bisnis. Dengan semakin bertambahnya jumlah program studi yang diselenggarakan oleh PNUP, tentu berbagai sarana dan prasarana akan bertambah. Kehadiran kampus II PNUP yang dilengkapi sarana dan prasarana modern diharapkan mampu membangkitkan semangat dan motivasi yang tinggi dari seluruh civitas akademika dan keluarga besar PNUP dalam hal menunjang pelayanan pendidikan kualitas pendidikan.");

        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjMvMDkvMjcvNTgvOWI4N2YyYTQtOWMwOS00ZDYyLWIzNzEtNTI1NDEzYzYyY2YwLyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=dbdd24b7b9a3a2b5");
        namaPoltek.add("Politeknik Negeri Jember");
        infoPoltek.add("Politeknik Negeri Jember awalnya bernama Politeknik Pertanian Universitas Jember yang didirikan pada tahun 1987. Belum lama ini, Politeknik Negeri Jember berhasil menggelar kegiatan: Inovasi Teknologi Perbenihan dan Display Varitas Tanaman Pangan dan Hortikultura. Kegiatan ini digelar di lahan Politeknik Negeri Jember seluas 2 hektar dengan 20 jenis tanaman pangan dan hortikultura.");

        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjkvMDYvMzkvMTYvN2ZkMjM4ZDEtNmNmZi00OGZlLWI3ZWMtMWFkMmI0ODI4Mzc0LyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=52b948214039c742");
        namaPoltek.add("Politeknik Negeri Semarang");
        infoPoltek.add("Dahulu Politeknik Negeri Semarang (Polines) merupakan bagian dari Universitas Diponegoro. Pada tahun 1997, Polines berdiri sendiri sesuai Kepmendikbud dan berubah nama menjadi Politeknik Negeri Semarang. Seperti politeknik pada umumnya, Polines juga menyelenggarakan pendidikan dengan jenjang Diploma. Di samping itu, Polines juga menyelenggarakan jenjang Diploma IV yang jenjangnya setara dengan S1");

        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjMvMDkvNDEvMDkvMGE4Y2VlMzAtZTI1MC00NWM5LTkxYWUtNzM1NmVmYWZmYTkwLyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=058cc78b2aaae952");
        namaPoltek.add("Politeknik Perkapalan " +
                "Negeri Surabaya");
        infoPoltek.add("Politeknik Negeri Perkapalan Surabaya merupakan salah satu politeknik terbaik di Indonesia. Titik balik berdirinya PPNS dimulai pada tahun 1986 dengan bantuan World Bank melalui Direktorat Jendral Pendidikan Tinggi menawarkan pembukaan Politeknik baru di ITS. Pada tahun 1987 sampai 1998 Politeknik Perkapalan mendapat hibah dari Pemerintah Jerman Barat melalui Gesellschaft Technische Zusammenarbeit (GTZ) untuk dana pengembangan SDM, perlengkapan peralatan laboratorium dan Technical Assistance. Tahun 2014, PPNS telah secara resmi dinyatakan sebagai Perguruan Tinggi yang mandiri dan merupakan satu-satunya Politeknik Negeri yang membidangi perkapalan.");

        gambarPoltek.add("https://mediacdn.quipper.com/media/W1siZiIsIjIwMTgvMDEvMjMvMDkvMzAvNTkvZjhhZWE4OTUtMDIyNi00Y2RmLTgxNzctOTkxMWYzYThiOGM5LyJdLFsicCIsInRodW1iIiwiODh4ODgiLHt9XV0?sha=4e2fb29deeca87e3");
        namaPoltek.add("Politeknik Negeri Samarinda");
        infoPoltek.add("Politeknik Negeri Samarinda dulunya bernama Politeknik Universitas Mulawarman. Kampus ini menyiapkan generasi-generasi muda untuk siap berkontribusi di dunia kerja, khususnya di bidang rekayasa dan tata niaga. Para lulusannya diharapkan bisa menjadi profesional yang berkualitas, siap diterapkan di mana saja dan berjiwa wirausaha. Bagi Quipperian yang tertarik, kampus ini memiliki 10 jurusan yang terdiri dari jenjang Diploma (DIII) dan Diploma IV (Sarjana Sains Terapan).");

        prosesRecyclerViewAdapter();
    }
}