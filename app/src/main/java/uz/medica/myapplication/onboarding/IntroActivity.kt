package uz.medica.myapplication.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import uz.medica.myapplication.MainActivity
import uz.medica.myapplication.R
import uz.medica.myapplication.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = listOf<ModelData>(
            ModelData(R.drawable.group_1,"group1",""),
            ModelData(R.drawable.group_2,"group2",""),
            ModelData(R.drawable.group_3,"group3","")
        )


        val customPagerAdapter = CustomPagerAdapter(this,list)

        binding.viewPager.adapter = customPagerAdapter


        TabLayoutMediator(binding.tabLayout,binding.viewPager){tab,position->}.attach()

//        binding.apply {
//            startBtn.setOnClickListener {
//                startActivity(Intent(this@IntroActivity, MainActivity::class.java))
//            }
//        }
    }
}