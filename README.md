# Unity of Bugs

A set of different programming errors that would cause errors on a real world game.  
This serves as a test project for crash reporting tools.

Includes:

* Assert False - only relevant on the editor (unless `BuildOptions.ForceEnableAssertions=true`).
* C# throw null - unhandled by user code.
* C# throw/try/catch and `Debug.LogException`.
* C# Log an instance of an Exception as a String - The raw `Exception.ToString()`.
* C# Unity `Log.Debug` calls.
* Android: Kotlin `throw Exception` - unhandled by user code.
* Android: Kotlin `throw` on a background thread - **Crashes the app**.
* Android: C bad access - Requires IL2CPP. **Crashes the app**.

Currently the native plugins are focused on Android. But iOS will come next, and standalone (desktop) after that.
