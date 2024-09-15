# KMP: DailyPulse

## Pre-requirements

1. [Install Git 2.27 or major](https://git-scm.com/downloads).
2. [Install Xcode 15.3 or minor](https://developer.apple.com/download/all/?q=Xcode) (just to iOS development).
3. [Install Android Studio](https://developer.android.com/studio).
4. Install some plugins in Android Studio:
    1. [Kotlin](https://plugins.jetbrains.com/plugin/6954-kotlin). If installed then update the plugin: To update the plugin, on the Android Studio welcome screen, select **Plugins | Installed**. Click **Update** next to Kotlin. You can also check the Kotlin version in **Tools | Kotlin | Configure Kotlin Plugin Updates**.
    2. [Kotlin Multiplatform Mobile](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile).
    3. [Genymotion](https://plugins.jetbrains.com/plugin/7269-genymotion).
5. [Install Genymotion Desktop](https://www.genymotion.com/product-desktop/download/).
6. [Install KDoctor](https://github.com/Kotlin/kdoctor) (just in macOS): `brew install kdoctor`.

## Configuration

1. Check if the JDK is installed, run the following command in the Android Studio terminal or your command line: `java --version`. If isn't installed then [install it](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Configurate a Android device:
    - [Set up a Android emulator: Using Genymotion](https://docs.genymotion.com/desktop/Get_started/014_Basic_steps/) (recommended option):
        - [Install Open GApps](https://support.genymotion.com/hc/en-us/articles/4414586104977-How-to-install-Google-Play-Store-and-other-Google-Apps-in-Genymotion).
    - [Set up a Android emulator: Using Androd Studio](https://docs.flutter.dev/get-started/install/windows/mobile?tab=virtual#set-up-the-android-emulator).
    - [Set up a real Android device](https://docs.flutter.dev/get-started/install/windows/mobile?tab=physical#set-up-your-target-android-device).
3. Configurate a iOS device (just to macOS):
    - [Set up a iOS simulator](https://docs.flutter.dev/get-started/install/macos/mobile-ios?tab=virtual#configure-your-target-ios-device).
    - [Set up a real iOS device](https://docs.flutter.dev/get-started/install/macos/mobile-ios?tab=physical#configure-your-target-ios-device).
4. To verify if all components of a complete Kotlin Multiplatform development environment were installed, run the following command: `kdoctor`. You may ignore KDoctor's warnings regarding the CocoaPods installation (just in macOS).
5. Open the project in Android Studio and wait it to index and install Gradle dependencies.

## Run and Debug

Before run into the IDE, run the virtual/physical device.

### Android

1. Open the project in Android Studio.
2. Run your device.
3. In the list of run configurations, select **androidApp**.
4. Choose an Android device next to the list of configurations and click **Run**.

More info: [here](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-create-first-app.html#run-your-application-on-android).

### iOS

1. Open the project in Android Studio.
2. Open the iOS project iOS in Xcode: [./iosApp/project.pbxproj](./iosApp/project.pbxproj).
3. Choose an iOS device on the target device list.
4. Click in **Run** button.
