package com.example.productexplorer

import android.health.connect.datatypes.units.Percentage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.productexplorer.ui.theme.ProductExplorerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductExplorerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Contenu de l'écran
                }
            }
        }
    }
}

data class ProductUi(
    val title: String,
    val brand: String,
    val category: String,
    val description: String,
    val discountPercentage: Double,
    val rating: Double,
    val stock: Int,
    val warrantyInformation: String,
    val shippingInformation: String
)