package com.github.apartyagi.holydarkside.services

import com.intellij.openapi.project.Project
import com.github.apartyagi.holydarkside.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
