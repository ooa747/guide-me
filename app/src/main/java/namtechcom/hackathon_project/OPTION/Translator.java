package namtechcom.hackathon_project.OPTION;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import namtechcom.hackathon_project.Adapter.RcAdpt_Ern;
import namtechcom.hackathon_project.Adapter.RcAdpt_Translator;
import namtechcom.hackathon_project.Adapter.RcAdpt_Trn;
import namtechcom.hackathon_project.R;

public class Translator extends AppCompatActivity {

    RecyclerView recyclerView , recyclerView1 , recyclerView2 ;
    RecyclerView.LayoutManager recyclerViewlayoutManager , recyclerViewlayoutManager2 , recyclerViewlayoutManager3 ;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_trn);
        recyclerView.setHasFixedSize(true);
        recyclerViewlayoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(recyclerViewlayoutManager2);

        adapter = new RcAdpt_Trn();
        recyclerView.setAdapter(adapter);

        recyclerView1 = (RecyclerView) findViewById(R.id.recycler_view_tro);
        recyclerView1.setHasFixedSize(true);
        recyclerViewlayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(recyclerViewlayoutManager);

        adapter = new RcAdpt_Ern();
        recyclerView1.setAdapter(adapter);

        recyclerView2 = (RecyclerView) findViewById(R.id.recycler_view_tr);
        recyclerView2.setHasFixedSize(true);
        recyclerViewlayoutManager3 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(recyclerViewlayoutManager3);

        adapter = new RcAdpt_Translator();
        recyclerView2.setAdapter(adapter);



    }

}
