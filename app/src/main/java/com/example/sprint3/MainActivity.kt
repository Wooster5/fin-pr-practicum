
package com.example.sprint3

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {
                    // Верхняя панель
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .background(Color(0xFF3975E8))
                            .padding(horizontal = 12.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "Playlist maker",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    // Кнопка поиска
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .clickable {
                                startActivity(
                                    Intent(
                                        this@MainActivity,
                                        SearchActivity::class.java
                                    )
                                )
                            }
                            .padding(horizontal = 14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("⌕", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Поиск", fontSize = 14.sp)
                        Spacer(modifier = Modifier.weight(1f))
                        Text("›", fontSize = 24.sp, color = Color.LightGray)
                    }

                    // Кнопка плейлистов
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .padding(horizontal = 14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("▤", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Плейлисты", fontSize = 14.sp)
                        Spacer(modifier = Modifier.weight(1f))
                        Text("›", fontSize = 24.sp, color = Color.LightGray)
                    }

                    // Кнопка избранного
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .padding(horizontal = 14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("♡", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Избранное", fontSize = 14.sp)
                        Spacer(modifier = Modifier.weight(1f))
                        Text("›", fontSize = 24.sp, color = Color.LightGray)
                    }

                    // Кнопка настроек
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .clickable {
                                startActivity(
                                    Intent(
                                        this@MainActivity,
                                        SettingsActivity::class.java
                                    )
                                )
                            }
                            .padding(horizontal = 14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("⚙", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Настройки", fontSize = 14.sp)
                        Spacer(modifier = Modifier.weight(1f))
                        Text("›", fontSize = 24.sp, color = Color.LightGray)
                    }
                }
            }
        }
    }
}
