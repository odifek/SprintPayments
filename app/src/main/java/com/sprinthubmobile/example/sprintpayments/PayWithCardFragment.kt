package com.sprinthubmobile.example.sprintpayments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.sprinthubmobile.example.sprintpayments.databinding.FragmentPayWithCardBinding

class PayWithCardFragment : Fragment() {

    private var mViewModel: PayWithCardViewModel? = null

    private lateinit var mBinding: FragmentPayWithCardBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_pay_with_card, container, false)

        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(PayWithCardViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
