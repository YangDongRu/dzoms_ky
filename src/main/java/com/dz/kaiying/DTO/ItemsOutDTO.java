package com.dz.kaiying.DTO;

import java.util.Date;

/**
 * Created by 24244 on 2018/3/29.
 */
public class ItemsOutDTO {

        private int id;
        private String personName;
        private String itemName;
        private String department;
        private Integer count;
        private Date time;
    private Integer state;
    private String applyTime;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }

        public void setPersonName(String personName) {
            this.personName = personName;
        }
        public String getPersonName() {
            return personName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }
        public String getItemName() {
            return itemName;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
        public String getDepartment() {
            return department;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
        public Integer getCount() {
            return count;
        }

        public void setTime(Date time) {
            this.time = time;
        }
        public Date getTime() {
            return time;
        }

}
