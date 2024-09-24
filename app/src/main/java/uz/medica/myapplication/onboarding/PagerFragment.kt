package uz.medica.myapplication.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.medica.myapplication.R
import uz.medica.myapplication.databinding.ItemPagerBinding

class PagerFragment : Fragment() {

    private var _binding: ItemPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ItemPagerBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.apply {
            binding.imageView.setImageResource(getInt("image", R.drawable.group_1))
            binding.textView.text = getString("title")
        }
    }
}