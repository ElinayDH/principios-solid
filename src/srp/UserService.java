package srp;

public class UserService {
	
	public void changeMail(User user) {
        if (PermissionService.hasPermission(user)) {
            // altera o e-mail
        }
    }

}
