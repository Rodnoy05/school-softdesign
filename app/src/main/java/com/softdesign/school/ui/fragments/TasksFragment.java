package com.softdesign.school.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softdesign.school.R;
import com.softdesign.school.ui.activities.MainActivity;

/**
     * Created by Rodnoy on 02.02.2016.
     */
    public class TasksFragment extends Fragment {
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View convertView = inflater.inflate(R.layout.fragment_tasks,null,false);
            ((MainActivity) getActivity()).appBarLock(true, 4);

            /* Определение активного пункта меню (сбивалось при повороте экрана)*/
            NavigationView mNavigationView = (NavigationView) getActivity().findViewById(R.id.navigation_view);
            mNavigationView.getMenu().findItem(R.id.drawer_profile).setChecked(false);
            mNavigationView.getMenu().findItem(R.id.drawer_contacts).setChecked(false);
            mNavigationView.getMenu().findItem(R.id.drawer_team).setChecked(false);
            mNavigationView.getMenu().findItem(R.id.drawer_tasks).setChecked(true);
            mNavigationView.getMenu().findItem(R.id.drawer_setting).setChecked(false);

            return convertView;
        }

    }
