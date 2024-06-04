/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.CourseInfo;
import java.sql.*;

/**
 *
 * @author Khoa Bug
 */
public class CourseInfoDAO extends DBContext {

    // In ra toàn bộ giá trị của DB
    public List<CourseInfo> getAll() {
        List<CourseInfo> lCourse = new ArrayList<>();
        String sql = "select * from CourseInfo";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                // Tao 1 object CourseInfo => Them tung gia tri cua row
                lCourse.add(new CourseInfo(rs.getString("courseid"), rs.getString("info"), rs.getString("mentor")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lCourse;
    }
    public CourseInfo getElementById(String id){
        String sql = "Select * from CourseInfo where courseid = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return new CourseInfo(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public void delete(String courseid) {
        String sql = "DELETE FROM CourseInfo WHERE courseid = ?";
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, courseid);
            pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(CourseInfo course) {
        String sql = "UPDATE CourseInfo SET info = ?, mentor = ? WHERE courseid = ?";
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, course.getInfo());
            pre.setString(2, course.getMentor());
            pre.setString(3, course.getCourseId());
            pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void insert(CourseInfo course) {
        String sql = "INSERT INTO [dbo].[CourseInfo]\n"
                + "           ([courseid]\n"
                + "           ,[info]\n"
                + "           ,[mentor])\n"
                + "     VALUES\n"
                + "           (?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, course.getCourseId());
            st.setString(2, course.getInfo());
            st.setString(3, course.getMentor());
            st.executeQuery();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        CourseInfoDAO c = new CourseInfoDAO();
//        CourseInfo co = c.getElementById("PRO192");
//        System.out.println(co.toString());
//    }
}
