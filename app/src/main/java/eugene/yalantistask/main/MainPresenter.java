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

package eugene.yalantistask.main;

import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import eugene.yalantistask.R;
import eugene.yalantistask.main.fragments.done.DoneFragment;
import eugene.yalantistask.main.fragments.inWork.InWorkFragment;
import eugene.yalantistask.main.fragments.notDone.NotDoneFragment;
import eugene.yalantistask.utils.adapters.ViewPagerAdapter;
import eugene.yalantistask.utils.listeners.ToolbarNavigationOnClickListener;

/**
 * Presenter for main activity.
 */
public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private Context mContext;

    /**
     * Constructor of PresenterMain.
     *
     * @param view MainActivity attach to PresenterMain.
     */
    public MainPresenter(MainContract.View view) {
        mView = view;
        mContext = (Context) view;
    }


    @Override
    public void detachView() {
        mView = null;
    }

    /**
     * Setup adapter to ViewPager
     */
    @Override
    public ViewPagerAdapter getViewPagerAdapter() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(mView.getSupportFragmentManager());
        adapter.addFragment(
                new InWorkFragment(), mView.getResources().getString(R.string.tab_in_work));
        adapter.addFragment(
                new DoneFragment(), mView.getResources().getString(R.string.tab_done));
        adapter.addFragment(
                new NotDoneFragment(), mView.getResources().getString(R.string.tab_not_done));

        return adapter;
    }

    /**
     * Create and setup ActionBarDrawerToggle
     *
     * @return Created ActionBarDrawerToggle
     */
    @Override
    public ActionBarDrawerToggle createActionBarDrawerToggle(
            DrawerLayout drawerLayout, Toolbar toolbar) {

        // Create toggle
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                (Activity) mContext,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        toggle.setDrawerIndicatorEnabled(false); // disable default icon for NavigationView
        // in toolbar to set custom one
        // Set custom icon
        toggle.setHomeAsUpIndicator(R.drawable.ic_menu);

        // Click Listener for navigation toolbar
        toggle.setToolbarNavigationClickListener(
                new ToolbarNavigationOnClickListener(drawerLayout));

        // Synchronize the state of the drawer indicator/affordance with the linked DrawerLayout
        toggle.syncState();

        return toggle;
    }
}
