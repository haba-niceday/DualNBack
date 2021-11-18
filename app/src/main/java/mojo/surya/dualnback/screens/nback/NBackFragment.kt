package mojo.surya.dualnback.screens.nback

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import mojo.surya.dualnback.R
import mojo.surya.dualnback.databinding.NBackFragmentBinding

class NBackFragment : Fragment() {

    private lateinit var viewModel: NBackViewModel

    private lateinit var binding: NBackFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.n_back_fragment,
            container,
            false
        )

        binding.btnEar.setOnClickListener {
            Log.d("!!!!Ear btn", "btn down");
            clickBtnEar();
        }
        binding.btnEye.setOnClickListener {
            Log.d("!!!!Eye btn", "btn down");
        }

        return binding.root
    }

    private fun clickBtnEar() {

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NBackViewModel::class.java)
        // TODO: Use the ViewModel
        fun clickBtnEar() {

        }
    }

}