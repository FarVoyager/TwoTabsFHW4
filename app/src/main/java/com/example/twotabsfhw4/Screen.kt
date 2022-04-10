package com.example.twotabsfhw4

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TabOneScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.TopCenter)
            .padding(20.dp)
    ) {
        Text(
            text = "Info",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
        Card(
            Modifier
                .background(colorResource(id = R.color.white))
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                Modifier.background(colorResource(id = R.color.teal_700))
            ) {
                Text(
                    text = "Exams:",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 20.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                )
                Text(
                    text = "13 : 25 : 43",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 20.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp
                )
            }
        }

        Card(
            Modifier
                .background(colorResource(id = R.color.white))
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                Modifier.background(colorResource(id = R.color.teal_700))
            ) {
                Text(
                    text = "Lessons:",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 20.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                )
                val lessonList = mutableListOf<String>()
                for (i in 0..20) {
                    lessonList.add("Lesson $i")
                }
                LazyColumn(Modifier.height(200.dp)) {
                    items(lessonList) { lesson ->
                        Text(
                            text = lesson,
                            Modifier.padding(20.dp)
                        )
                    }
                }
            }
        }

        Card(
            Modifier
                .background(colorResource(id = R.color.white))
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            val hwList = mutableListOf<Pair<String, String>>()
            for (i in 0..10) {
                hwList.add(Pair("Homework $i", "Till: ${i * 2}:${i * 3}"))
            }
            LazyRow(
                Modifier
                    .background(colorResource(id = R.color.teal_700))
                    .padding(10.dp)
            ) {
                items(hwList) { hwData ->
                    Card(
                        shape = RoundedCornerShape(20.dp),
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .width(100.dp)
                            .background(colorResource(id = R.color.teal_700))
                    ) {
                        Column(Modifier.background(colorResource(id = R.color.teal_200))) {
                            Text(
                                text = hwData.first,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(bottom = 20.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 14.sp,
                            )
                            Text(
                                text = hwData.second,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(bottom = 20.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 14.sp,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MusicScreenPreview() {
    TabOneScreen()
}

@Composable
fun TabTwoScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.TopCenter)
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = "Lesson Schedule",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .padding(bottom = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
            )
        }
        item {
            LessonCard(name = "English", time = "9 : 40")
        }
        item {
            LessonCard(name = "Math", time = "11 : 20")
        }
        item {
            LessonCard(name = "History", time = "13 : 00")
        }
        item {
            LessonCard(name = "Physics", time = "14 : 40")
        }
        item {
            LessonCard(name = "Chemistry", time = "16 : 20")
        }
        item {
            LessonCard(name = "German", time = "18 : 00")
        }
    }
}

@Composable
fun LessonCard(name: String, time: String) {
    Card(
        Modifier
            .background(colorResource(id = R.color.white))
            .fillMaxWidth()
            .padding(20.dp),
        shape = RoundedCornerShape(20.dp),
    ) {
        Column(
            Modifier.background(colorResource(id = R.color.teal_700))
        ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
            )
            Text(
                text = time,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MoviesScreenPreview() {
    TabTwoScreen()
}