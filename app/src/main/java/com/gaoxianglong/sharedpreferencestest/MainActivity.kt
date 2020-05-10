package com.gaoxianglong.sharedpreferencestest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 点击保存数据
        button.setOnClickListener {
            // 获取到SharedPreferences.Editor实例调用apply可以链式调用
            getSharedPreferences("data", Context.MODE_PRIVATE).edit().apply {
                putString("userName","yiSheep") // 设置一个数据key是userName value是yiSheep
                putString("password","asd1230.")
                apply() // 保存
            }
        }
        button2.setOnClickListener {
            val sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE)
            val userName = sharedPreferences.getString("userName", "")
            val password = sharedPreferences.getString("password", "")
            Toast.makeText(this,"userName:$userName\npassword:$password",Toast.LENGTH_SHORT).show()
        }
    }
}
