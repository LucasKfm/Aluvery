package com.example.aluvery.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.example.aluvery.R
import com.example.aluvery.ui.theme.Indigo400
import com.example.aluvery.ui.theme.Indigo500

@Preview(showBackground = true)
@Composable
fun ChallengePreview() {
    Row {
        Box(
            modifier = Modifier
                .height(150.dp)
                .width(100.dp)
                .background(Color.Blue)
        )
        Column {
            Text(
                text = "Test 1",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(all = 16.dp)
            )
            Text(
                text = "Test 2", modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductChallengePreview() {
    Surface(
        shape = RoundedCornerShape(10.dp),
        elevation = 4.dp,
        modifier = Modifier.padding(all = 16.dp)
    ) {
        Row {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(imageSize)
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(Indigo400, Indigo500)
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .size(imageSize)
                        .offset(x = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(CenterStart)
                        .border(
                            BorderStroke(
                                width = 2.dp,
                                brush = Brush.verticalGradient(listOf(Indigo400, Indigo400))
                            ),
                            CircleShape
                        )
                )

            }
            Spacer(modifier = Modifier.width(imageSize / 2))
            Text(
                text = LoremIpsum(100).values.first(),
                maxLines = 6,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .padding(16.dp)
                    .align(CenterVertically)
            )
        }
    }
}