package org.nigajuan.ui;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nigajuan
 * Date: 13/07/12
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */
@Controller
@SessionScoped
public class SessionBean  {

    private UIComponent formA;
    private UIComponent formB;


    private List<String> list = Arrays.asList("include1.xhtml" , "include2.xhtml");

    public void actionA(){
        FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add(formA.getClientId());
        FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add(formB.getClientId());
        System.out.println("action A!!");
    }

    public void actionB(){
        System.out.println("action B!!");
    }


    public UIComponent getFormA() {
        return formA;
    }

    public void setFormA(UIComponent formA) {
        this.formA = formA;
    }

    public UIComponent getFormB() {
        return formB;
    }

    public void setFormB(UIComponent formB) {
        this.formB = formB;
    }

}
