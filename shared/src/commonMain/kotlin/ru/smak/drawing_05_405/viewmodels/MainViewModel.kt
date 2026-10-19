package ru.smak.drawing_05_405.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.IntSize
import androidx.lifecycle.ViewModel
import java.awt.Color
import java.awt.image.BufferedImage

class MainViewModel : ViewModel() {

    var imageSize by mutableStateOf(IntSize.Zero)

    fun paint() : BufferedImage {
        val image = BufferedImage(
            imageSize.width,
            imageSize.height,
            BufferedImage.TYPE_INT_RGB
        )
        val g = image.graphics
        g.color = Color.WHITE
        g.fillRect(0, 0, image.width, image.height)
        g.color = Color.RED
        g.fillRect(10, 10, 100, 100)
        return image
    }
}