package com.example.twotabsfhw4.ui.theme

import androidx.compose.runtime.Composable
import com.example.twotabsfhw4.TabTwoScreen
import com.example.twotabsfhw4.TabOneScreen

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var title: String, var screen: ComposableFun) {
    object Info : TabItem("Info", { TabOneScreen() })
    object Schedule : TabItem("Schedule", { TabTwoScreen() })
}
