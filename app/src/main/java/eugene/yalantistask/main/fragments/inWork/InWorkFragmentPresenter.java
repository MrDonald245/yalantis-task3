package eugene.yalantistask.main.fragments.inWork;

import java.util.Arrays;
import java.util.List;

import eugene.yalantistask.main.fragments.StatusContract;
import eugene.yalantistask.model.DebtIssue;
import eugene.yalantistask.model.DismantlingIssue;
import eugene.yalantistask.model.Issue;
import eugene.yalantistask.model.LiftIssue;
import eugene.yalantistask.model.SanitaryIssue;

/**
 * Presenter for InWorkFragment.
 */
public class InWorkFragmentPresenter
        implements StatusContract.Presenter {

    private StatusContract.View mView;

    /**
     * Constructor of DoneFragmentPresenter.
     *
     * @param view DoneFragment attach to PresenterMain.
     */
    public InWorkFragmentPresenter(InWorkFragment view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public List<Issue> getIssues() {
        Issue[] issues = new Issue[]{
                new DismantlingIssue(43, 14, "21.06.2015", "Вул. Вадима Гетьмана, 42"),
                new DebtIssue(43, 14, "21.06.2015", "Вул. Вадима Гетьмана, 42"),
                new LiftIssue(43, 14, "21.06.2015", "Вул. Вадима Гетьмана, 42"),
                new SanitaryIssue(43, 14, "21.06.2015", "Вул. Вадима Гетьмана, 42")
        };

        return Arrays.asList(issues);
    }

}
