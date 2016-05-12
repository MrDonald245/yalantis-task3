package eugene.yalantistask.details;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import eugene.yalantistask.R;
import eugene.yalantistask.utils.adapters.ImageAdapter;

/**
 * Presenter for DetailsActivity.
 */
public class DetailsPresenter implements DetailsContract.Presenter {

    private DetailsContract.View mView;


    /**
     * Constructor of PresenterMain.
     *
     * @param view MainActivity attach to PresenterMain.
     */
    public DetailsPresenter(DetailsContract.View view) {
        mView = view;
    }


    public void detachView() {
        mView = null;
    }


    /**
     * Recycler view initialization.
     * Recycler view contents photos witch represents form arrays.xml,
     * photo_links parameter
     */
    public void recyclerViewInit() {

        String[] photoLinks = mView.getResources().getStringArray(R.array.photo_links);

        LinearLayoutManager layoutManager = new LinearLayoutManager((Activity) mView,
                RecyclerView.HORIZONTAL, false);

        RecyclerView recyclerView = (RecyclerView) mView.findViewById(R.id.rvPhotos);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new ImageAdapter(photoLinks, (Activity) mView));
    }


    /**
     * Set back button to the activity.
     */
    public void setBackButton() {

        // set back button to action bar
        if (mView.getSupportActionBar() != null) {
            mView.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
