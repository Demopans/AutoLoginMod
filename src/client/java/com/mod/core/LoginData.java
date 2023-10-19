package com.mod.core;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * data entry type. Managed by {@link }
 */
public class LoginData {
    /**
     *
     */
    public static enum LoginDataType {
        /**
         * do nothing
         *
         * @since 2.0
         */
        DISABLE("disable"),
        /**
         * open a connection box
         *
         * @since 2.0
         */
        SECURE_LOGIN("secure"),
        /**
         * send automatically the password
         *
         * @since 2.0
         */
        AUTO("auto");
        private String lang;

        private LoginDataType(String lang) {
            this.lang = lang;
        }

        /**
         * translated name of the type
         * @unused
         * @since 2.0
         */
        /*public String getLang() {
            return I18n.format("autologin.type." + lang);
        }*/
    }

    /**
     * Private fields
     */
    private String ipAdder;
    private String loginPattern;
    private String registerPattern;
    private String password; // bit of a security problem
    private LoginDataType type;

    /**
     * interactors
     */
    public String ipAdder() {return ipAdder;}

    public void setIpAdder(String ipAdder) {this.ipAdder = ipAdder;}

    public void setLoginPattern(String loginPattern) {this.loginPattern = loginPattern;}
    public String loginPattern() {return loginPattern;}

    public String loginMessage() {return loginPattern.replace("%s", password);}

    public void setRegisterPattern(String registerPattern) {this.registerPattern = registerPattern;}
    public String registerPattern() {return registerPattern;}
    public String registerMessage() {return registerPattern.replace("%s", password);}


    public String password() {return password;}

    public void setPassword(String password) {this.password = password;}

    /**
     * Constructors
     */
    public LoginData(String ipAdder, String loginPattern, String registerPattern, String password, LoginDataType type) {
        this.ipAdder = ipAdder;
        this.loginPattern = loginPattern;
        this.registerPattern = registerPattern;
        this.password = password;
        this.type = type;
    }

    public LoginData(){
        this("","/login %s", "/register %s %s", "", LoginDataType.DISABLE);
    }

    public LoginData copy(){return new LoginData(ipAdder, loginPattern, registerPattern, password, type);}
    public LoginData copyEmpty(){return new LoginData(ipAdder, loginPattern, registerPattern, "", type);}
}
