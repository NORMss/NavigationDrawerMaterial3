package com.norm.mynavigationdrawermaterial3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.norm.mynavigationdrawermaterial3.ui.theme.MyNavigationDrawerMaterial3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNavigationDrawerMaterial3Theme {
                Drawer()
            }
        }
    }
}