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

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import eugene.yalantistask.utils.adapters.ViewPagerAdapter;

/**
 * Base classes for both presenter and view.
 */
public interface MainContract {
    interface View {
        FragmentManager getSupportFragmentManager();
        Resources getResources();
    }

    interface Presenter {
        void detachView();

        /**
         * Setup adapter to ViewPager
         */
        ViewPagerAdapter getViewPagerAdapter();

        /**
         * Create and setup ActionBarDrawerToggle
         *
         * @return Created ActionBarDrawerToggle
         */
        ActionBarDrawerToggle createActionBarDrawerToggle(
                DrawerLayout drawerLayout, Toolbar toolbar);
    }
}
