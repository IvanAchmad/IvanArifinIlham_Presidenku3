package com.example.ivanarifinilham_presidenku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    // variabel recycler
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.Listdata)
        var data = ArrayList<Datagambar>()
        data.add(Datagambar(R.drawable.sukarno, "ir soekarno","1945-1967"))
        data.add(Datagambar(R.drawable.soeharto, "soeharto","1967-1998"))
        data.add(Datagambar(R.drawable.habibie, "bj habibie","1998-1999"))
        data.add(Datagambar(R.drawable.gusdur, "Gusdur","1999-2001"))
        data.add(Datagambar(R.drawable.megawati, "Megawati sukarno putri","2001-2004"))
        data.add(Datagambar(R.drawable.sby, "susilo bambang yudhoyono","2004-2009,2009-2014"))
        data.add(Datagambar(R.drawable.jokowi, "Jokowi Dodo","2014-2019,2019-2024"))
        data.add(Datagambar(R.drawable.jokowi, "Jokowi dodo","2014-2019,2019-202"))
        // menambahkan data kedalam adapter
        recyclerAdapter = simpleAdapter(data)
        // menambahkan layout manager
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        // memanggil adapter
        recyclerView.adapter = recyclerAdapter
        // menampilkan data ke layout
        recyclerView.layoutManager = layoutManager
    }

}