package com.example.poc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

@Controller
class FEController {

    @RequestMapping("/")
    @ResponseBody
    fun index(): ModelAndView {
        return ModelAndView("index")
    }
}
