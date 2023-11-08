## FDD-XPlat
***

This project is a Gradle template that allows you to build Forge/Fabric mods using shared code. You do not require any extra libraries like Architectury.

This project is powered by [Unimined](https://github.com/unimined/unimined), and supports almost every Minecraft version.

***

### Using this template

*Before you start, please note that this project has been built on, and tested ONLY on IntelliJ idea. Other IDE's have not been tested, and cannot be guaranteed to work.*

1) Clone, download the project to your computer, or generate a new repository from this template
2) Open up `settings.gradle` and replace `rootProject.name = 'fdd-xplat'` with the name of your project
3) Open up `gradle.properties` and replace the following values:
   1) `mod_author` -> Your name
   2) `mod_id` -> The id of your mod. For example: `myawesomemod`
   3) `mod_name` -> The name of your mod. This will be used for the output jars
   4) `minecraft_version` -> The minecraft version your project targets
   5) `fabric_loader` -> The fabric loader version to use. Find this [here](https://fabricmc.net/develop/)
   6) `fabric_api` -> The Fabric API for your minecraft version. Find this [here](https://fabricmc.net/develop/)
   7) `neoforge_version` -> The NeoForge version for your Minecraft version to use. For example: `39-beta`

4) Open up `fabric.mod.json` from the Fabric module, and replace the following values:
   1) `description` -> Describe what your mod does
   2) `homepage` -> Your Modrinth/Curseforge/GitHub page of the mod
   3) `sources` -> Your GitHub repository of the mod
   4) `license` -> Your mod license
   5) `icon` -> Your mod icon
   6) `minecraft` -> The minecraft version(s) your mod supports
   7) If you do not plan on using mixins, remove the `mixins` section

5) Open up `mods.toml` from the NeoForge module and replace the following values:
   1) `loaderVersion` -> The neoforge version code
   2) `license` -> Your mod license
   3) `issueTrackerURL` -> Your GitHub repository of the mod
   6) `displayURL` -> Your Modrinth/Curseforge/GitHub page of the mod
   7) `logoFile` -> Your mod icon
   9) `description` -> Your mod description
   11) `versionRange` -> `[neoforgeVersionCode,)` and `[1.20.2,)` (Replace with the minecraft versions your mod supports) 

6) If your default JVM/JDK is not Java 17 you will encounter an error when opening the project. This error is fixed by going to File > Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVMand changing the value to a valid Java 17 JVM. You will also need to set the Project SDK to Java 17. This can be done by going to File > Project Structure > Project SDK. Once both have been set open the Gradle tab in IDEA and click the refresh button to reload the project.
7) Replace the contents of `LICENSE` with your mod license
8) Replace the contents of `readme.md` with your mod readme

***

### Development Guide

When using this template the majority of your mod is developed in the Common project. The Common project is compiled against the vanilla game and is used to hold code that is shared between the different loader-specific versions of your mod. The Common project has no knowledge or access to ModLoader specific code, apis, or concepts. Code that requires something from a specific loader must be done through the project that is specific to that loader, such as the NeoForge or Fabric project.

Loader specific projects such as the NeoForge and Fabric project are used to load the Common project into the game. These projects also define code that is specific to that loader. Loader specific projects can access all of the code in the Common project. It is important to remember that the Common project can not access code from loader specific projects.

***

### License

This template is licensed under CC0-1.0 license. You can use your own license for the mods you make using this project