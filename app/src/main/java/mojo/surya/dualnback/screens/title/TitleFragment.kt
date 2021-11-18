package mojo.surya.dualnback.screens.title

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import mojo.surya.dualnback.R
import mojo.surya.dualnback.databinding.TitleFragmentBinding

class TitleFragment : Fragment() {

    companion object {
        fun newInstance() = TitleFragment()
    }

    private lateinit var viewModel: TitleViewModel

    private lateinit var binding: TitleFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.title_fragment,
            container,
            false
        )
        binding.btnStart.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_title_destination_to_NBackFragment)
        }
        return binding.root
    }

/*    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TitleViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}