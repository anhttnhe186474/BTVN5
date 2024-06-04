/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Khoa Bug
 */
public class CourseInfo {
    /*
    courseid varchar(6) primary key,
	info varchar(50) not null,
	mentor varchar(10) not null
    */
    private String courseId, info, mentor;

    public CourseInfo(String courseId, String info, String mentor) {
        this.courseId = courseId;
        this.info = info;
        this.mentor = mentor;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "CourseInfo{" + "courseId=" + courseId + ", info=" + info + ", mentor=" + mentor + '}';
    }
    
}
