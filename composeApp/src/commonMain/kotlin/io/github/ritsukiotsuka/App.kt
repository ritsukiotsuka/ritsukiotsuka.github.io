package io.github.ritsukiotsuka

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.ritsukiotsuka.component.SocialMediaIcon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import ritsukiotsuka.composeapp.generated.resources.Res
import ritsukiotsuka.composeapp.generated.resources.ic_profile_image

@Composable
fun App() {
    MaterialTheme {
        Surface(
            color = Color.White,
            modifier = Modifier.fillMaxSize(),
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState()),
            ) {
                val uriHandler = LocalUriHandler.current

                Spacer(Modifier.height(80.dp))

                Image(
                    painter = painterResource(Res.drawable.ic_profile_image),
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .size(120.dp)
                        .border(
                            border = BorderStroke(2.dp, Color.Gray),
                            shape = CircleShape,
                        )
                        .clip(CircleShape)
                        .background(Color.LightGray),
                )

                Spacer(Modifier.height(16.dp))

                Text(
                    text = "Ritsuki Otsuka",
                    color = Color.Black,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )

                Spacer(Modifier.height(8.dp))

                Text(
                    text = "Software Engineer - Android",
                    color = Color.Gray,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                )

                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier.padding(vertical = 24.dp)
                ) {
                    socialMediaAccounts.forEach { item ->
                        SocialMediaIcon(
                            drawableRes = item.iconRes,
                            contentDescription = item.name,
                            onClick = { uriHandler.openUri(item.url) }
                        )
                    }
                }

                Text(
                    text = "Copyright © 2025 ritsukiotsuka",
                    color = Color.Gray,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                )

                Spacer(Modifier.height(80.dp))
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    App()
}

