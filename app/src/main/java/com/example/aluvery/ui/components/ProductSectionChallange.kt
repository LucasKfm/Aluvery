package com.example.aluvery.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.model.Product
import com.example.aluvery.sampledata.sampleProducts
import com.example.aluvery.ui.theme.AluveryTheme

@Composable
fun ProductSectionChallenge(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            text = title,
            fontWeight = FontWeight(400),
            fontSize = 30.sp,
            modifier = Modifier.padding(
                start = 16.dp
            )
        )
        LazyVerticalGrid(
            modifier = Modifier.fillMaxWidth()
                .padding(all = 16.dp),
            columns = GridCells.Fixed(count = 2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(products) {
                ProductItem(product = it)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProductSectionChallengePreview() {
    AluveryTheme {
        Surface {
            ProductSectionChallenge("Todos os Produtos", products = sampleProducts)
        }
    }
}