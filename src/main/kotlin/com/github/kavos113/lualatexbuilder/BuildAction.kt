package com.github.kavos113.lualatexbuilder

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class BuildAction: AnAction() {
    
    override fun actionPerformed(p0: AnActionEvent) {
        println("action is called")
    }
}