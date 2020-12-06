package unity.of.bugs

import android.content.Context
import android.util.Log

object KotlinPlugin {
    @JvmStatic
    fun throw() {
        try {
            Log.e("test", "test from Kotlin!")
            throw Exception("Bugs in Kotlin 🐛")
        }
        catch (e: Exception) {
            Log.e("test", "Exception thrown in Kotlin!", e)
            throw e
        }
    }
}
