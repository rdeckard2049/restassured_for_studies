package commons;

import sample.serverest.login.PostLogin;

public class Hooks {

  public static PostLogin login;

  public static void getJWT() {
    login = new PostLogin();
    login.postLogin();
  }
}