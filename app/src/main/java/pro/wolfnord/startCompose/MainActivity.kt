package pro.wolfnord.startCompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pro.wolfnord.startCompose.ui.theme.StartComposeTheme

class MainActivity: ComponentActivity() { // Нужен для управления приложением
    override fun onCreate(savedInstanceState: Bundle?) { // Является частью жизненного цикла (Мы переопределяем элемент onCreate)
        super.onCreate(savedInstanceState) // Запуск активности с параметром состояния
        enableEdgeToEdge() // Для расширения макета приложения
        setContent(content = {
            StartComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding
                    -> Greeting(
                        name = "Жукалов Алексей Николаевич ИКБО-26-22",
                        modifier = Modifier
                            .padding(innerPadding)
                            .background(Color.Yellow)
                            .size(200.dp)
                            .border(2.dp, Color.Black)
                    )
                }
            }
        })
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Row(
            modifier = modifier
        ) {
            Box(
                modifier = Modifier
                    .background(Color(0xffffa500))
                    .padding(16.dp)
                    .size(200.dp)
                    .border(2.dp, Color(0xFF664100))
            ) {
                Text(
                    text = "Hello, $name",
                    color = Color(0xFF664100),
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(16.dp)
                )
            }
        }
    }
}