package ru.smak.drawing_05_405

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.draw
import androidx.compose.ui.graphics.toComposeImageBitmap
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import ru.smak.drawing_05_405.viewmodels.MainViewModel

@Composable
@Preview
fun App(vm: MainViewModel = remember { MainViewModel() }) {
    val bitmap = remember(vm.imageSize) {
        if (vm.imageSize.width <= 0 || vm.imageSize.height <= 0) {
            null
        } else {
            vm.paint().toComposeImageBitmap()
        }
    }
    MaterialTheme {
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .onSizeChanged {
                    vm.imageSize = it
                }
        ) {
            bitmap?.let{ drawImage(it) }
        }
    }
}