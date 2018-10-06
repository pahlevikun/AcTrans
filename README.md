# AcTrans
A simple Android Library. Very easy for use this Android library and give transition animations between 2 activities.
<br>Example :
<br>![Example 1](https://raw.githubusercontent.com/pahlevikun/AcTrans/master/example02.gif "Example 1") ![Example 2](https://raw.githubusercontent.com/pahlevikun/AcTrans/master/example01.gif "Example 2")

## Support 
Support from Android 4.0 Ice Cream Sandwich / Minimum API 14

## Permission 
No needed special permission in AndroidManifest

## Special Case 
For several case, please add this if you are using android version >= 21 in the style.xml file in the values-v21
```xml
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
       <item name="android:windowActivityTransitions">true</item>
</style>
```
## Installing 
Add repository in root build.gradle
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```
And add dependency to module build.gradle:
```gradle
dependencies {
    implementation 'com.github.pahlevikun:actrans:0.0.2'
}
```

## Sample Code 
Animation for can be work in Activity Transition so please place the code after intent or other activity transition event
```kotlin
startActivity(Intent(this,SecondActivity::class.java))
AcTrans.Builder(this).performSlideToTop()
```
```kotlin
override fun onBackPressed() {
    super.onBackPressed()
    AcTrans.Builder(this).performSlideToRight()
}
```

## Changelog
In first release, AcTrans only have 5 different transition :
```
Version 0.0.1
- Bottom to Top Animation
- Top to Bottom Animation
- Left to Right Animation
- Right to Left Animation
- No Animation

Version 0.0.2
- Fade Animation
```

## License
```
Copyright 2018 Farhan Yuda Pahlevi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
