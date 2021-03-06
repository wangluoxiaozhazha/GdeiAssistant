package edu.gdei.gdeiassistant.ExceptionHandler;

import edu.gdei.gdeiassistant.Controller.Secret.SecretController;
import edu.gdei.gdeiassistant.Exception.DatabaseException.DataNotExistException;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice(basePackageClasses = SecretController.class)
@Order(Integer.MIN_VALUE)
public class SecretExceptionHandler {

    @ExceptionHandler(DataNotExistException.class)
    public ModelAndView ShowDataNotExistExceptionTip() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Error/commonError");
        modelAndView.addObject("ErrorTitle", "树洞信息不存在");
        modelAndView.addObject("ErrorMessage", "查询的树洞信息不存在");
        return modelAndView;
    }
}
