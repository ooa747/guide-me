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

public class RcAdpt_Trn extends RecyclerView.Adapter<RcAdpt_Trn.ViewHolder> {

    private String[] titles = {"سعيد",
            "عبدالمجيد",
            "عادل",
            "عبدالله",
            "سالم",
            "احمد",
            "صالح",
            "موسى"};

    private String[] details = { "0534224680",
            "0547544789",  "0534618965",
            "0543215678", "0535257869",
            "0543454346",  "0517658964",
            "0534643467"};

    private int[] images = { R.drawable.indonesiaflg,
            R.drawable.pakistanflag,
            R.drawable.inder,
            R.drawable.pakistanflag,
            R.drawable.inder,
            R.drawable.indonesiaflg,
            R.drawable.indonesiaflg,
            R.drawable.indonesiaflg };

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
    public RcAdpt_Trn.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_gallary, viewGroup, false);
        RcAdpt_Trn.ViewHolder viewHolder = new RcAdpt_Trn.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RcAdpt_Trn.ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
