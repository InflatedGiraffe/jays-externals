import ProjectVersions.openosrsVersion

/*
 * Copyright (c) 2019 Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.61"
    kotlin("kapt") version "1.3.61"
}

version = "0.0.1"

project.extra["PluginName"] = "Jays Rune Dragons" // This is the name that is used in the external plugin manager panel
project.extra["PluginDescription"] = "something....something....profit?" // This is the description that is used in the external plugin manager panel

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation(Libraries.lombok)
    // https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.9.3"))
    implementation("org.apache.commons:commons-lang3:3.0")
    kapt(Libraries.pf4j)

    compileOnly("com.openosrs:runelite-api:4.+")
    compileOnly("com.openosrs:runelite-client:4.+")
    compileOnly("com.openosrs.rs:runescape-api:4.+")
    compileOnly(group = "com.openosrs", name = "http-api", version = "4.+")
    //compileOnly(group = "com.owain.externals", name = "chinbreakhandler", version = "0.0.2+")
    compileOnly(project(":jaysutils"))

    compileOnly(Libraries.guice)
    compileOnly(Libraries.javax)
    compileOnly(Libraries.pf4j)
    compileOnly(Libraries.slf4j)



}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
            freeCompilerArgs = listOf("-Xjvm-default=enable")
        }
        sourceCompatibility = "11"
    }

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