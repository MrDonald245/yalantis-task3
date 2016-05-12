/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eugene.yalantistask.main.fragments.done;

import java.util.Arrays;
import java.util.List;

import eugene.yalantistask.main.fragments.StatusContract;
import eugene.yalantistask.model.DebtIssue;
import eugene.yalantistask.model.DismantlingIssue;
import eugene.yalantistask.model.Issue;

/**
 * Presenter for DoneFragment.
 */
public class DoneFragmentPresenter implements StatusContract.Presenter{

    private StatusContract.View mView;

    /**
     * Constructor of DoneFragmentPresenter.
     *
     * @param view DoneFragment attach to PresenterMain.
     */
    public DoneFragmentPresenter(DoneFragment view) {
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
                    new DebtIssue(43, 19, "15.06.2015", "Вул. Вадима Гетьмана, 42"),
                    new DebtIssue(43, 19, "15.06.2015", "Вул. Вадима Гетьмана, 42")
            };

        return Arrays.asList(issues);
    }
}
