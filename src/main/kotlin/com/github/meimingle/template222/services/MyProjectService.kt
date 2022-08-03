package com.github.meimingle.template222.services

import com.intellij.openapi.project.Project
import com.github.meimingle.template222.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
