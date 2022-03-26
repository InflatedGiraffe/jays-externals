version = "1.0.4"

project.extra["PluginName"] = "JayUtils"
project.extra["PluginDescription"] = "Tools required for JaysPlugins to function."


dependencies {

    annotationProcessor(Libraries.lombok)
    annotationProcessor(Libraries.pf4j)

    compileOnly("com.openosrs:runelite-api:4.+")
    compileOnly("com.openosrs:runelite-client:4.+")
    compileOnly("com.openosrs.rs:runescape-api:4.+")
    compileOnly(group = "com.openosrs", name = "http-api", version = "4.+")

// https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.9.0")



    compileOnly(Libraries.guice)
    //  compileOnly(Libraries.javax)
    compileOnly(Libraries.lombok)
    compileOnly(Libraries.pf4j)
}

tasks {
    jar {
        manifest {
            attributes(mapOf(
                    "Plugin-Version" to project.version,
                    "Plugin-Id" to nameToId(project.extra["PluginName"] as String),
                    "Plugin-Provider" to project.extra["PluginProvider"],
                    "Plugin-Description" to project.extra["PluginDescription"],
                    "Plugin-License" to project.extra["PluginLicense"]
            ))
        }
    }
}