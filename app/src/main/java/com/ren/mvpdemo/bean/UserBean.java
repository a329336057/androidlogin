package com.ren.mvpdemo.bean;

public class UserBean {

    /**
     * message : 登陆成功
     * Code : 200
     * reslut : {"userid":1,"username":"admin","password":"123456","user_nickname":"言曌","user_email":"admin@liuyanzhao.com"}
     */

    private String message;
    private int Code;
    private ReslutBean reslut;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public ReslutBean getReslut() {
        return reslut;
    }

    public void setReslut(ReslutBean reslut) {
        this.reslut = reslut;
    }

    public static class ReslutBean {
        /**
         * userid : 1
         * username : admin
         * password : 123456
         * user_nickname : 言曌
         * user_email : admin@liuyanzhao.com
         */

        private int userid;
        private String username;
        private String password;
        private String user_nickname;
        private String user_email;

        public int getUserid() {
            return userid;
        }

        public void setUserid(int userid) {
            this.userid = userid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUser_nickname() {
            return user_nickname;
        }

        public void setUser_nickname(String user_nickname) {
            this.user_nickname = user_nickname;
        }

        public String getUser_email() {
            return user_email;
        }

        public void setUser_email(String user_email) {
            this.user_email = user_email;
        }
    }
}
