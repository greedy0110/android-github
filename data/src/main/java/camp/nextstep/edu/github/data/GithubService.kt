package camp.nextstep.edu.github.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

internal class GithubService {
    fun getRepositories(): List<GithubRepository> {
        TODO()
    }
}

@JsonClass(generateAdapter = true)
internal data class GithubRepository(
    @Json(name = "full_name")
    val fullName: String,
    val description: String
)