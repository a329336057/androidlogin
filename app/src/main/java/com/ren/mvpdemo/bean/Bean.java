package com.ren.mvpdemo.bean;

import java.util.List;

/**
 * Created by asus on 2018/5/16.
 */

public class Bean {

    /**
     * data : [{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1//upload/community//community20180317010606.jpg","status":"8","address":"海尔测试实验室1区1栋1单元6层2户","roomId":269470,"communityName":"海尔测试实验室","communitySn":"123e","userType":1,"communityId":"426358"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1//upload/community//community20180315055141.jpg","status":"0","address":"香栀花园11区1栋1单元20层2户","roomId":269468,"communityName":"香栀花园1","communitySn":"123e","userType":2,"communityId":"426264"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1//upload/community//community20180315055141.jpg","status":"1","address":"香栀花园11区1栋1单元9层1户","roomId":269457,"communityName":"香栀花园1","communitySn":"123e","userType":1,"communityId":"426264"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1//upload/community//community20180317010606.jpg","status":"1","address":"海尔测试实验室1区2栋1单元1层2户","roomId":269423,"communityName":"海尔测试实验室","communitySn":"123e","userType":1,"communityId":"426358"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1/upload/community/e1ffc9c2-fc14-4cf8-a5b7-ce0173e48404.jpg","status":"1","address":"印象山F区7栋3单元2层2户","roomId":269410,"communityName":"印象山","communitySn":"999e","userType":1,"communityId":"426262"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1/upload/community/e1ffc9c2-fc14-4cf8-a5b7-ce0173e48404.jpg","status":"0","address":"印象山F区4栋2单元1层1户","roomId":269407,"communityName":"印象山","communitySn":"999e","userType":2,"communityId":"426262"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1/null","status":"0","address":"鼎世华府A区3栋1单元1层10户","roomId":268919,"communityName":"鼎世华府","communitySn":"","userType":2,"communityId":"426311"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1/null","status":"0","address":"鼎世华府A区4栋2单元1层2户","roomId":268451,"communityName":"鼎世华府","communitySn":"","userType":2,"communityId":"426311"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1/null","status":"0","address":"鼎世华府A区A栋1单元1层10户","roomId":268071,"communityName":"鼎世华府","communitySn":"","userType":2,"communityId":"426311"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1/upload/community/13e39082-3f35-453b-8858-22a15686e3e7.png","status":"0","address":"迷城小区C区2栋2单元1层1户","roomId":265890,"communityName":"迷城小区","communitySn":"","userType":2,"communityId":"426283"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1/upload/community/13e39082-3f35-453b-8858-22a15686e3e7.png","status":"0","address":"迷城小区F区3栋2单元2层2户","roomId":265888,"communityName":"迷城小区","communitySn":"","userType":2,"communityId":"426283"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1/upload/community/38fa78fa-7621-48f2-92fa-0b1e97554350.jpg","status":"0","address":"测试1F区3栋1单元1层1户","roomId":264391,"communityName":"测试1","communitySn":"","userType":2,"communityId":"426246"},{"logo":"http://210.51.17.150:7531/IntelligentCommunity-v1/null","status":"0","address":"haierA区54栋2单元11层1户","roomId":264380,"communityName":"haier","communitySn":"","userType":2,"communityId":"0"}]
     * code : 0
     * msg : 成功
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * logo : http://210.51.17.150:7531/IntelligentCommunity-v1//upload/community//community20180317010606.jpg
         * status : 8
         * address : 海尔测试实验室1区1栋1单元6层2户
         * roomId : 269470
         * communityName : 海尔测试实验室
         * communitySn : 123e
         * userType : 1
         * communityId : 426358
         */

        private String logo;
        private String status;
        private String address;
        private int roomId;
        private String communityName;
        private String communitySn;
        private int userType;
        private String communityId;

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getRoomId() {
            return roomId;
        }

        public void setRoomId(int roomId) {
            this.roomId = roomId;
        }

        public String getCommunityName() {
            return communityName;
        }

        public void setCommunityName(String communityName) {
            this.communityName = communityName;
        }

        public String getCommunitySn() {
            return communitySn;
        }

        public void setCommunitySn(String communitySn) {
            this.communitySn = communitySn;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public String getCommunityId() {
            return communityId;
        }

        public void setCommunityId(String communityId) {
            this.communityId = communityId;
        }
    }
}
