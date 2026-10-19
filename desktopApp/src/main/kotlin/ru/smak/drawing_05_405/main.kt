package ru.smak.drawing_05_405

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Drawing-05-405",
    ) {
        App()
    }
}