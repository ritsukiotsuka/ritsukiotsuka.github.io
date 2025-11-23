package io.github.ritsukiotsuka

import org.jetbrains.compose.resources.DrawableResource
import ritsukiotsuka.composeapp.generated.resources.Res
import ritsukiotsuka.composeapp.generated.resources.ic_logo_facebook
import ritsukiotsuka.composeapp.generated.resources.ic_logo_github
import ritsukiotsuka.composeapp.generated.resources.ic_logo_linkedin
import ritsukiotsuka.composeapp.generated.resources.ic_logo_wantedly
import ritsukiotsuka.composeapp.generated.resources.ic_logo_x

data class SocialMediaAccount(
    val name: String,
    val url: String,
    val iconRes: DrawableResource,
)

val socialMediaAccounts = listOf(
    SocialMediaAccount(
        name = "GitHub",
        url = "https://github.com/ritsukiotsuka",
        iconRes = Res.drawable.ic_logo_github,
    ),
    SocialMediaAccount(
        name = "LinkedIn",
        url = "https://www.linkedin.com/in/ritsukiotsuka",
        iconRes = Res.drawable.ic_logo_linkedin,
    ),
    SocialMediaAccount(
        name = "Facebook",
        url = "https://facebook.com/ritsukiotsuka",
        iconRes = Res.drawable.ic_logo_facebook,
    ),
    SocialMediaAccount(
        name = "X",
        url = "https://x.com/_rotsuka",
        iconRes = Res.drawable.ic_logo_x,
    ),
    SocialMediaAccount(
        name = "Wantedly",
        url = "https://www.wantedly.com/id/rotsuka",
        iconRes = Res.drawable.ic_logo_wantedly,
    ),
)
