package chapmant.materialtest.model;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import chapmant.materialtest.R;

/**
 * Created by pan on 11/7/2014.
 */
public class TeaAdapter extends RecyclerView.Adapter<TeaAdapter.ViewHolder> {

    private String[] mDataset = {"Tea1", "Tea2", "Tea3"};

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public CardView mCardView;
        public ViewHolder(CardView v) {
            super(v);
            mCardView = v;
        }

        public void setText(String text) {
            // Find the TextView inside the CardView and set the lable appropriately
            TextView mTextView = (TextView) mCardView.findViewById(R.id.info_text);
            mTextView.setText(text);
        }
    }

    public TeaAdapter() {
        // DOES NOTHING
    }

    @Override
    public TeaAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        CardView v = (CardView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.single_tea_card, viewGroup, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(TeaAdapter.ViewHolder viewHolder, int i) {
        viewHolder.setText(mDataset[i]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
