package com.github.799452017.dipperintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.799452017.dipperintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
