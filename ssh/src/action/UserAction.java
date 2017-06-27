package action;

import entity.User;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class UserAction extends DispatchAction {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public ActionForward add(ActionMapping actionMapping, ActionForm userForm
            , HttpServletRequest request, HttpServletResponse response) {
        User user = (User)userForm;
        userService.add(user);
        return actionMapping.findForward("success");
    }

    public ActionForward delete(ActionMapping actionMapping, ActionForm userForm
            , HttpServletRequest request, HttpServletResponse response) {
        User user = (User)userForm;
        userService.remove(user);
        return actionMapping.findForward("success");
    }

    public ActionForward update(ActionMapping actionMapping, ActionForm userForm
            , HttpServletRequest request, HttpServletResponse response) {
        User user = (User)userForm;
        userService.save(user);
        return actionMapping.findForward("success");
    }

    public ActionForward findByName(ActionMapping actionMapping, ActionForm userForm
            , HttpServletRequest request, HttpServletResponse response) {
        User user = (User)userForm;
        List<User> users = userService.findByAny(user.getUsername());
        request.setAttribute("users", users);
        return actionMapping.findForward("index");
    }

    public ActionForward findByUserid(ActionMapping actionMapping, ActionForm userForm
            , HttpServletRequest request, HttpServletResponse response) {
        User user = (User)userForm;
        user = userService.findByUserid(user.getUserid());
        request.setAttribute("user", user);
        return actionMapping.findForward("detail");
    }

}
