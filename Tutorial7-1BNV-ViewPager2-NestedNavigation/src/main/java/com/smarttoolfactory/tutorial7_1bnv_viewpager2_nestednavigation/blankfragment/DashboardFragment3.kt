package com.smarttoolfactory.tutorial7_1bnv_viewpager2_nestednavigation.blankfragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.smarttoolfactory.tutorial7_1bnv_viewpager2_nestednavigation.R
import com.smarttoolfactory.tutorial7_1bnv_viewpager2_nestednavigation.databinding.FragmentDashboard3Binding

class DashboardFragment3 : BaseDataBindingFragment<FragmentDashboard3Binding>() {

    override fun getLayoutRes(): Int = R.layout.fragment_dashboard3

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        dataBinding!!.btnGoToStart.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment3_to_dashboardFragment1)
        }

    }
}
