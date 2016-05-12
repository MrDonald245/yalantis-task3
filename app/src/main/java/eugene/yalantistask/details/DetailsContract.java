package eugene.yalantistask.details;

import android.content.res.Resources;
import android.support.v7.app.ActionBar;

/**
 * Base classes for view and presenter.
 */
public interface DetailsContract {

    interface View {
        ActionBar getSupportActionBar();

        Resources getResources();

        android.view.View findViewById(int id);
    }

    interface Presenter {
        void detachView();

        void recyclerViewInit();

        void setBackButton();
    }
}
