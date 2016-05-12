package eugene.yalantistask.main.fragments.notDone;

import java.util.Arrays;
import java.util.List;

import eugene.yalantistask.main.fragments.StatusContract;
import eugene.yalantistask.model.DebtIssue;
import eugene.yalantistask.model.DismantlingIssue;
import eugene.yalantistask.model.Issue;

/**
 * Presenter for NotDoneFragment.
 */
public class NotDoneFragmentPresenter
        implements StatusContract.Presenter {

    private StatusContract.View mView;

    /**
     * Constructor of DoneFragmentPresenter.
     *
     * @param view DoneFragment attach to PresenterMain.
     */
    public NotDoneFragmentPresenter(NotDoneFragment view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public List<Issue> getIssues() {
        Issue[] issues = new Issue[]{
                new DismantlingIssue(43, 20, "14.06.2015", "Вул. Вадима Гетьмана, 42"),
                new DebtIssue(43, 19, "15.06.2015", "Вул. Вадима Гетьмана, 42"),
                new DebtIssue(43, 19, "15.06.2015", "Вул. Вадима Гетьмана, 42"),
                new DebtIssue(43, 19, "15.06.2015", "Вул. Вадима Гетьмана, 42")
        };

        return Arrays.asList(issues);
    }
}
