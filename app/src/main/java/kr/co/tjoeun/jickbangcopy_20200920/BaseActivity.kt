package kr.co.tjoeun.jickbangcopy_20200920

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}