package uz.medica.myapplication.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomPagerAdapter(activity: IntroActivity, val list: List<ModelData>):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return PagerFragment().apply {
            arguments = Bundle().apply {
                val item = list[position]
                putInt("image",item.image)
                putString("title",item.title)
                putString("des",item.description)
            }
        }
    }


}