package at.fh.swengb.kristan

import com.squareup.moshi.JsonClass

@JsonClass (generateAdapter = true)
class AuthResponse(val token: String) {
}