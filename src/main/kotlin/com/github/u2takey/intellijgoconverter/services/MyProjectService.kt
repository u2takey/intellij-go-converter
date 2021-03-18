package com.github.u2takey.intellijgoconverter.services

import com.github.u2takey.intellijgoconverter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
