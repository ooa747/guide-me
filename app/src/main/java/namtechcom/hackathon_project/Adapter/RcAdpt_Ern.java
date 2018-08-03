package namtechcom.hackathon_project.Adapter;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import namtechcom.hackathon_project.R;

/**
 * Created by Ahmad-H on 02/08/2018.
 */

public class RcAdpt_Ern extends RecyclerView.Adapter<RcAdpt_Ern.ViewHolder> {

    private String[] titles = {"خالد",
            "احمد",
            "علي",
            "محمد",
            "نايف",
            "فارس",
            "بدر",
            "عادل"};

    private String[] details = {"0543366473",
            "0583356414", "0554456077",
            "0583222442", "0578556888",
            "0513350478", "0583356423",
            "0583356400"};

    private int[] images = { R.drawable.inder,
            R.drawable.inder,
            R.drawable.indonesiaflg,
            R.drawable.pakistanflag,
            R.drawable.inder,
            R.drawable.pakistanflag,
            R.drawable.indonesiaflg,
            R.drawable.inder };

    class ViewHolder extends RecyclerView.ViewHolder{

        Context context;


        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage  = (ImageView)itemView.findViewById(R.id.imageView2);
            itemTitle  = (TextView)itemView.findViewById(R.id.title);
            itemDetail = (TextView)itemView.findViewById(R.id.Docview);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    //Intent intent = new Intent(v.getContext(), View_card.class);
                    // v.getContext().startActivity(intent);

                }
            });
        }
    }

    @Override
    public RcAdpt_Ern.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_gallary, viewGroup, false);
        RcAdpt_Ern.ViewHolder viewHolder = new RcAdpt_Ern.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RcAdpt_Ern.ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
