# AddonLoader

## Description
This project enables dynamic loading of individual .jar files at runtime, inspired by Bukkit and its plugin loader.

## Usage

```java
File dir = new File("addons folder");
Logger logger = Logger.getLogger("addon_load");

AddonLoader loader = new AddonLoader(logger, dir);

loader.loadAll(); // Load all addons from the folder

loader.enableAll(); // Enable all addons

loader.disableAll(); // Disable all addons
loader.unloadAll(); // Unload all addons
```

## License
This project is licensed under the [MIT License](LICENSE).

## Acknowledgments
- Inspired by Bukkit's plugin loader.

## Installation

Add the following Maven repository to your project:

Maven:
```xml
<repositories>
    <repository>
        <id>by1337</id>
        <url>https://by1337.space/repository/maven-releases/</url>
    </repository>
</repositories>
```
Gradle:
```groovy
repositories {
    maven {
        url 'https://by1337.space/repository/maven-releases/'
    }
}
```

Add the dependency:

Maven:
```xml
<dependencies>
    <dependency>
        <groupId>org.by1337.addonloader</groupId>
        <artifactId>AddonLoader</artifactId>
        <version>1.0</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```
Gradle:
```groovy
dependencies {
    implementation 'org.by1337.addonloader:AddonLoader:1.0'
}
```