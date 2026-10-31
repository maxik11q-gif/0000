APK за 5 минут (WebView-обёртка)
================================

Игра (HTML-версия) кладётся в APK и открывается на весь экран.
Сборка на GitHub: 3-5 минут, без NDK и Python.

1) github.com/new  ->  имя chekushka-apk  ->  Create repository
2) Add file -> Upload files -> перетащи СОДЕРЖИМОЕ этой папки
   (build.gradle, settings.gradle, gradle.properties, папку src) -> Commit
3) Add file -> Create new file -> имя: .github/workflows/build-apk.yml
   вставь файл build-apk.yml из этой папки -> Commit
4) Actions -> Build WebView APK -> Run workflow
5) Через 3-5 минут: Artifacts -> chekushka-webview-apk.zip -> app-debug.apk

Установка: разреши "Установка из неизвестных источников".
Игра работает офлайн, интернет не нужен.
